import java.util.*;
public class cocktail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int time = sc.nextInt();
        long[] drinks = new long[testcases];
        for(int i= 0; i < testcases; i++)
        {
            drinks[i]= sc.nextInt();
        }
        Arrays.sort(drinks);
        if(calc(testcases, time, drinks))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    static boolean calc(int numDrinks, int drinkTime, long[] drinks)
    {
        int k = drinkTime *(numDrinks-1);
        boolean test = true;
        for (int i = numDrinks -1; i > 0; i--)
        {
            if(drinks[i]  - k<=0)
            {
                test = false;
            }
            k-=drinkTime;
        }
        return test;
    }
}