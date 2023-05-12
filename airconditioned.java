import java.util.*;
public class airconditioned {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        ArrayList<Integer> rooms= new ArrayList<Integer>();
//        int[][] inroom = new int[tc*tc][2];
//        for(int i =0; i < (tc *2) -2; i++)
//        {
//            rooms.add(sc.nextInt());
//        }
//        int inclusiveMin = sc.nextInt();
//        int inclusiveMax= sc.nextInt();
//        int min;
//        int max;
//        int minc;
//        int maxc;
//        boolean inclusive = false;
//        int count = rooms.size()/2;
//        int size = 0;
//        boolean found = false;
//        for(int i =0; i < rooms.size()-1; i++)
//        {
//            min = rooms.get(i);
//            max = rooms.get(i+1);
//            for(int j =i +2; j < rooms.size()-1;j++)
//            {
//
//                minc = rooms.get(j);
//                maxc = rooms.get(j+1);
//                if((inclusiveMin > minc && inclusiveMin < maxc)|| (inclusiveMax > minc && inclusiveMax < maxc) || (inclusiveMin > min && inclusiveMin < max)|| (inclusiveMax > min && inclusiveMax < max))
//                {
//                    inclusive =  true;
//                }
//                if(((minc>= min && minc <= max) || (maxc >= min && maxc <= max))) {
//                }
//                else {
//                    for(int[] ele: inroom) {
//                        if (minc == ele[0] && maxc == ele[1]) {
//                            found = true;
//                        }
//                    }
//                        if(found){
//                            inroom[size][0]= min;
//                            inroom[size][1]= max;
//                            size++;
//                            count--;
//                            break;
//
//
//                        }
//                        if(count==0)break;
//                    }
//                    if(count==0)break;
//
//
//                }
//
//            }
//
////        for(int ele: rooms)
////            System.out.println(ele);
//
//        if(!inclusive)
//        {
//            System.out.print(count + 1);
//        }
//        else System.out.print(count);
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        ArrayList<Integer> allrooms= new ArrayList<Integer>();
        for(int i = 0; i < tc*2; i++) {
            allrooms.add(sc.nextInt());
        }
        int count = 0;

        while(allrooms.get(2) != 0)
        {

            int[] range = rangecalc(allrooms.get(0), allrooms.get(1), allrooms.get(2), allrooms.get(3));
            while(range[0] == 0 && range[1] == 0)
            {
                allrooms.add(allrooms.remove(0));
                allrooms.add(allrooms.remove(0));
                range = rangecalc(allrooms.get(0), allrooms.get(1), allrooms.get(2), allrooms.get(3));
            }
            if(allrooms.get(2) >= range[0] && allrooms.get(2) <= range[1])
            {
                allrooms.remove(2);
                allrooms.remove(3);
                count++;

            }


        }
        System.out.println(count);


    }
    static int[] rangecalc(int min1, int max1, int min2, int max2)
    {
        int rangemin = Math.max(min1, min2);
        int rangemax = Math.min(max1, max2);

        if (rangemin > rangemax) {
            // the ranges do not overlap, return an empty range
            return new int[] { 0, 0 };
        }

        return new int[] { rangemin, rangemax };
    }
}
