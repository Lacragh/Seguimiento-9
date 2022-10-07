import java.util.ArrayList;
import java.util.Scanner;

public class SpikeTalks {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        int secretary = reader.nextInt();
        int count = 0;

        for (int i = 0; i < secretary ; i++) {

            int space = reader.nextInt();
            array.add(String.valueOf(space));
            // 0 1 1 3 1 3 2 2
        }

        for (int i = 0; i < array.size()-1; i++) {

            for (int j = i+1; j < array.size(); j++) {

                if (Integer.parseInt(array.get(j))   < Integer.parseInt(array.get(i)) ){
                    String temp = array.get(j);
                    array.set(j,array.get(i));
                    array.set(i,temp);
                }
            }

        }


        for (int i = 0; i < array.size()-1; i++) {

                if (array.get(i).equals(array.get(i+1))  && !array.get(i).equals("0")  && !array.get(i+1).equals("0")) {
                    count++;
                    i++;
                    if (i+1 < array.size()){
                        if (array.get(i).equals(array.get(i+1))){
                            count = -1;
                            break;
                        }
                    }

                }




        }
        System.out.println(count);

    }
}
