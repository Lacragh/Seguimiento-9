import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


        public static void main (String[] args) {
            Scanner reader = new Scanner(System.in);
            int cases = reader.nextInt();

            HashMap<Integer,Integer> hashMap = new HashMap<>();

            for (int r = 0; r < cases; r++) {
                int numHits = 0;
                int n = reader.nextInt();
                int[] weights = new int[n];
                int[] order = new int[n];
                int[] lengths = new int[n];

                for(int i=0; i<n; i++){
                    weights[i] = reader.nextInt();
                    hashMap.put(weights[i],i);
                }
                Arrays.sort(weights);

                for(int i=0; i<n; i++){
                    lengths[i] = reader.nextInt();
                }

                int pos = hashMap.get(weights[0]);
                for(int i=1;i<n;i++) {
                    int punch= hashMap.get(weights[i]);

                    while(punch <= pos){
                        punch=punch+lengths[hashMap.get(weights[i])];
                        numHits++;
                    }
                    pos=punch;
                    hashMap.put(weights[i],punch);

                }

                System.out.println(numHits);
            }





        }



    }

