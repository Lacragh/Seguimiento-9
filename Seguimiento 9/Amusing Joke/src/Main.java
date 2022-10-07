import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String first = reader.next();
        String second = reader.next();
        String third = reader.next();

        String suma = first + second;
        char[] orderthird = third.toCharArray();
        char[] order = suma.toCharArray();

        for (int i = 0; i < order.length-1; i++) {

            for (int j = i+1; j < order.length; j++) {

                if (order[i] < order[j]) {
                    char temp =  order[j];
                    order[j] = order[i];
                    order[i] = temp;

                }

            }



        }

        for (int i = 0; i < orderthird.length-1; i++) {

            for (int j = i+1; j < orderthird.length; j++) {

                if (orderthird[i] < orderthird[j]) {
                    char temp =  orderthird[j];
                    orderthird[j] = orderthird[i];
                    orderthird[i] = temp;

                }

            }

        }

        String order1 =  new String(order);
        String order2 = new String(orderthird);
        if (order1.equals(order2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
