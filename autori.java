import java.util.Scanner;
public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split("-");
        for (String line : lines) {
            System.out.print(String.valueOf(line.charAt(0)));
        }
    }
}