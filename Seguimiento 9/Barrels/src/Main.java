import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();

        while (n != 0){

        int numbarrels = reader.nextInt();
        int[] array = new int[numbarrels];
        int k = reader.nextInt();

            for (int i = 0; i < numbarrels; i++) {
                int barrels = reader.nextInt();
                array[i] = barrels;
            }

            Arrays.sort(array);
            long suma = 0;
            for (int i = array.length-1; k >= 0 ; i--) {
                suma += array[i];
                k--;
            }

            System.out.println(suma);







            n--;
        }




    }
}
