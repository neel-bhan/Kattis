import  java.util.*;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        long[] innums = new long[nums.length];
        for(int i = 0; i < nums.length; i++)

        {
        innums[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(innums);
        long A = innums[0];
        long B = innums[1];
        long C = innums[2];
        String abc = sc.nextLine();
        for(int i = 0; i < 3; i++)
        {
            if(abc.charAt(i) == 'A')
            {
                System.out.print(A + " ");
            }
            if(abc.charAt(i) == 'B')
            {
                System.out.print(B + " ");
            }
            if(abc.charAt(i) == 'C')
            {
                System.out.print(C + " ");
            }
        }



    }
}