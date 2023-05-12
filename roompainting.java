import java.util.Scanner;
import java.util.*;

public class roompainting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long sizesAvailable = sc.nextLong();
        long numColoredNeeded = sc.nextLong();
        long[] sizesList = new long[(int) sizesAvailable];
        long[] colorList = new long[(int) numColoredNeeded];

        for(int i =0; i < sizesAvailable; i++) {
            sizesList[i] = sc.nextLong();
        }

        Arrays.sort(sizesList);
        for(long i = 0; i < numColoredNeeded; i++) {
            colorList[(int) i] = sc.nextLong();
        }


        long sum = 0;
        for (long j : colorList) {
            for (long i : sizesList) {

                if (i >= j) {
                    sum += i - j;
                    break;
                }

            }
        }

        System.out.println(sum);
    }
}