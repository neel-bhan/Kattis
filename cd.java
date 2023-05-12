import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class cd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int[] Jack = new int[a];
             if (a == 0 && b == 0) {
                break;
             }

            int count = 0;
            for (int i = 0; i < a; i++) {
                Jack[i] = scanner.nextInt();
            }
            for (int i = 0; i < b; i++) {
                if(Arrays.binarySearch(Jack, scanner.nextInt())>=0) {
                    count++;
                }
            }
            System.out.println(count);


    }}
}