//import java.util.Scanner;
//
//public class roundedbuttons {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int testcase = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < testcase; i++) {
//            find(sc.nextLine());
//            System.out.println();
//        }
//    }
//
//    static void find(String ans) {
//        Scanner sc = new Scanner(ans);
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        double w = sc.nextDouble();
//        double h = sc.nextDouble();
//        double r = sc.nextDouble();
//        int m = sc.nextInt();
//        double[][] clicks = new double[m][2];
//        for (int i = 0; i < m; i++) {
//            clicks[i][0] = sc.nextDouble();
//            clicks[i][1] = sc.nextDouble();
//        }
//        for (double[] ele : clicks) {
//            if (isInsideRoundedRect(x, y, w, h, r, ele[0], ele[1]))
//                System.out.println("inside");
//            else
//                System.out.println("outside");
//        }
//    }
//
//    static boolean isInsideRoundedRect(double x, double y, double w, double h, double r, double mouseX, double mouseY) {
//        double[][] circleCenters = new double[4][2];
//        //top left
//        circleCenters[0][0] = x + r;
//        circleCenters[0][1] = y + r;
//
//        //topright
//        circleCenters[1][0] = x + w - r;
//        circleCenters[1][1] = y + r;
//
//        //bottom left
//        circleCenters[2][0] = x + r;
//        circleCenters[2][1] = y + h - r;
//
//        //bottomright
//        circleCenters[3][0] = x + w - r;
//        circleCenters[3][1] = y + h - r;
//
//        for (double[] center : circleCenters) {
//            double distance = Math.sqrt(Math.pow(mouseX - center[0], 2) + Math.pow(mouseY - center[1], 2));
//            if (distance <= r)
//                return true;
//        }
//
//        if (mouseX >= x + r && mouseX <= x + w - r && mouseY >= y && mouseY <= y + h)
//            return true;
//
//        if (mouseY >= y + r && mouseY <= y + h - r && mouseX >= x && mouseX <= x + w)
//            return true;
//
//        return false;
//    }
//}
import java.util.*;
public class roundedbuttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        for (int i= 0; i < testcase; i++)
        {
            find(sc.nextLine());
            System.out.println();
        }
    }
    static void find(String ans) {
        Scanner sc = new Scanner(ans);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double r = sc.nextDouble();
        int m = sc.nextInt();
        double[][] clicks = new double[m][2];
        for (int i = 0; i < m; i++) {
            clicks[i][0] = sc.nextDouble();
            clicks[i][1] = sc.nextDouble();
        }

        double[][] circleCenters = new double[4][2];
        //top left
        circleCenters[0][0] = x + r;
        circleCenters[0][1] = y + r;

        //topright
        circleCenters[1][0] = x + w - r;
        circleCenters[1][1] = y + r;

        //bottom left
        circleCenters[2][0] = x + r;
        circleCenters[2][1] = y + h - r;

        //bottomright
        circleCenters[3][0] = x + w - r;
        circleCenters[3][1] = y + h - r;

        for (double[] ele : clicks) {
            if (ele[0] >= circleCenters[0][0] && ele[0] <= circleCenters[1][0]) {
                if (ele[1] >= y && ele[1] <= circleCenters[2][1]) {
                    System.out.println("inside");
                } else System.out.println("outside");


            } else if (ele[1] >= circleCenters[0][1] && ele[1] <= circleCenters[2][1]) {
                if (ele[0] >= x && ele[0] <= x + w) {
                    System.out.println("inside");
                } else System.out.println("outside");
            } else if (ele[0] >= x && ele[0] <= circleCenters[0][0]) {
                if (ele[1] >= y && ele[1] <= circleCenters[0][1]) {
                    double distanceR = calc(ele[0], ele[1], circleCenters[0][0], circleCenters[0][1]);
                    if (distanceR <= r)
                        System.out.println("inside");
                    else
                        System.out.println("outside");
                    //calc dist with top left
                }
                if (ele[1] >= circleCenters[2][1] && ele[1] <= y + h) {
                    double distanceR = calc(ele[0], ele[1], circleCenters[2][0], circleCenters[2][1]);
                    if (distanceR <= r)
                        System.out.println("inside");
                    else
                        System.out.println("outside");
                    //calc dist with bottom left
                }
            } else if (ele[0] >= circleCenters[1][0] && ele[0] <= x + w) {
                if (ele[1] >= y && ele[1] <= circleCenters[0][1]) {
                    double distanceR = calc(ele[0], ele[1], circleCenters[1][0], circleCenters[1][1]);
                    if (distanceR <= r)
                        System.out.println("inside");
                    else
                        System.out.println("outside");
                    //calc dist with top right
                }
                if (ele[1] >= circleCenters[2][1] && ele[1] <= y + h) {
                    double distanceR = calc(ele[0], ele[1], circleCenters[3][0], circleCenters[3][1]);
                    if (distanceR <= r)
                        System.out.println("inside");
                    else
                        System.out.println("outside");
                    //calc dist with bottom right
                }
            }
        }


    }

    static double calc(double xClick, double yClick, double xCircle, double yCircle)
    {
        return Math.sqrt((yClick - yCircle) * (yClick - yCircle) + (xClick - xCircle) * (xClick - xCircle));
    }
}