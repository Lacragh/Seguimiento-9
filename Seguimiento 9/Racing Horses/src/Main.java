import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);


        int cases = reader.nextInt();

        while(cases != 0){

            int n = reader.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                int s = reader.nextInt();
                array[i] = s;
            }

            for (int i = 0; i < array.length-1; i++) {

                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < array[i]){
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }

            }



            int min = 1000000000;
            for (int i = 0; i < array.length-1; i++) {

                if ((array[i+1] -array[i]) < min){
                    min = array[i+1]-array[i];
                }
            }
            System.out.println(min);

            cases--;
        }







    }
}
