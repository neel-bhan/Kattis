import java.util.Scanner;
public class aboveaverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            int n = sc.nextInt();
            double avg = 0;
            int[] arr = new int[n];
            for(int j=0;j<n;j++){

                arr[j] = sc.nextInt();
                }

            for(int ele: arr){
                avg+=ele;
            }
            avg = avg/n;
            double count = 0;
            for(int ele: arr){
                if(ele>avg){
                    count++;
                }
            }

            System.out.printf("%.3f" ,count/n*100);
            System.out.println("%");
        }
    }
}