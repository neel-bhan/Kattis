import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
    /* If the constraints were larger, use the BigInteger class
            BigInteger b1 = new BigInteger(sc.next());
            BigInteger b2 = new BigInteger(sc.next());
            System.out.println(new BigInteger(b1.subtract(b2).abs().toByteArray()));
    */

            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            System.out.println(Math.abs(a - b));

        }

    }
}
