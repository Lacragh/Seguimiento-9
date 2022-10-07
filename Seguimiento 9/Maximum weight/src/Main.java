import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int cases = reader.nextInt();

        while (cases != 0){
            array.clear();
            int n = reader.nextInt();
            int k = reader.nextInt();
            if (k > n-k){
                k = n-k;
            }

            for (int i = 0; i < n; i++) {
                int objects = reader.nextInt();
                array.add(objects);
            }

            for (int i = 0; i < array.size()-1; i++) {

                for (int j = i+1; j < array.size(); j++) {
                    if (array.get(j) < array.get(i)){
                        int temp = array.get(j);
                        array.set(j,array.get(i));
                        array.set(i,temp);
                    }
                }

            }
            int kidSum = 0;
            int cheffSum = 0;
            for (int i = 0; i < k; i++) {
                kidSum += array.get(i);
            }
            for (int i = k; i < array.size(); i++) {
                cheffSum += array.get(i);
            }
            if (kidSum > cheffSum){
                int temp = cheffSum;
                cheffSum = kidSum;
                kidSum = temp;
            }
            System.out.println(cheffSum-kidSum);
            cases--;
        }

    }
}
