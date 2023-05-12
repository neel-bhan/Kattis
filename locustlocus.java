import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class locustlocus {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> answers = new ArrayList<Integer>();
        for(int i = 0; i < cases; i++)
        {
            answers.add(year(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }
        answers.sort(Comparator.naturalOrder());
        System.out.println(answers.get(0));
    }
    static int year(int year, int a, int b)
    {
        int x = 1;
        while(!((x % a ==0) && (x % b == 0) ))
            x++;
        return  year + x;

    }
}