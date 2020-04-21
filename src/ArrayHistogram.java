import java.util.Scanner;
import java.lang.Math;

public class ArrayHistogram{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sampleN = k.nextInt();
        k.nextLine();
        int[] hist = new int[10];
        for (int i = 0; i < 10; i++) {
            hist[i] = 0;
        }

        /*for (int i = 0; i < hist.length; i++) {
            System.out.print(hist[i]+" ");
        }*/

        for (int i = 0; i < sampleN; i++) {
            int randInt = (int) (Math.random()*10);
            hist[randInt] += 1;
        }

        /*for (int i = 0; i < hist.length; i++) {
            System.out.print(hist[i]+" ");
        }*/
       for (int i = 0; i < 10; i++) {
           double num = ((double) hist[i]/sampleN)*100;
          System.out.printf("%5.2f%% ", num);
       }
    }
}
