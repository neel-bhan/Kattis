import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //base cases
        //ABBA
        //BAAB
        //ABAB
        //BABA
        //BBAA
        //AABB

        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        sc.nextLine();
        String order = sc.nextLine();

        if(order.equals("ABBA"))
        {
            if (A1 + 3 == A2)
            {
                System.out.println((A1 + 1) + " " + (A1 + 2));
            }
            else System.out.println("-1");

        }
        else if(order.equals("BAAB"))
        {
            System.out.println("-1");
        }
        else if(order.equals("ABAB"))
        {
            if(A1 == 6 && A2 == 8)
                System.out.println(A1 + 1 + " " + (A2 + 1));
            else System.out.println("-1");
        }
        else if(order.equals("BABA"))
        {
            if(A1 == 2 && A2 == 4)
                System.out.println((A1 - 1) + " " + (A2 - 1));
            else System.out.println("-1");
        }
        else if(order.equals("BBAA"))
        {
            if(A1 == 3 && A2 == 4)
                System.out.println("1 2");

            else System.out.println("-1");
        }
        else if(order.equals("AABB"))
        {
            if(A1 == 6 && A2 == 7)
                System.out.println((A2 + 1) + " " + (A2 + 2));

            else System.out.println("-1");

        }
        else
            System.out.println("-1");




    }
}