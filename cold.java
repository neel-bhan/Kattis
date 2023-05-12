import java.util.Scanner;
public class cold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int tc = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < tc; i++) {

            int a  = sc.nextInt();
            if(a<0)
            {
            count++;
            }

        }
        System.out.println(count);

    }
}