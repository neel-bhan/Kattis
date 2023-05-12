import java.util.Scanner;
public class santaklas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        double angle = sc.nextDouble();
        if(angle<= 180)
        {
            System.out.println("safe");
        }
        else if(angle>=270 && angle<360)
        {
            angle-=270;
            angle = Math.toRadians(angle);
            double dist= Math.cos(angle)*h;
            dist = Math.ceil(dist);
            System.out.println((long) dist);

        }
        else if(angle>180 && angle<270)
        {
            angle = 270 - angle;
            angle = Math.toRadians(angle);
            double dist= Math.cos(angle)*h;
            dist = Math.ceil(dist);
            System.out.println((long) dist);
        }





    }
}