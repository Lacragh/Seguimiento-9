import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String s = reader.next();
        String[] array =  s.split("\\+");




        for (int i = 0; i < array.length-1; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i].compareTo(array[j]) > 0){
                    String temp =  array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }

        }

        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1){
                System.out.print(array[i]+"+");
            }else{
                System.out.println(array[i]);
            }

        }



    }
}
