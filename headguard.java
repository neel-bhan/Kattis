import java.util.*;
public class headguard {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String temp = "";
       int counter =1;
       int count =0;
       while(sc.hasNext()){

           String s = sc.nextLine();
           String[] lines = new String[s.length()];
           for(int i=0;i<s.length();i++){
               lines[i] = String.valueOf(s.charAt(i));
           }
           count =0;
           temp = lines[count];
           counter =1;
            for(int j=1;j<lines.length;j++)
            {
                if(temp.equals(lines[j]))
                {

                    counter++;
                    count++;

                }
                else
                {
                    System.out.print(counter + temp);
                    count++;
                    counter =1;
                    temp = lines[count];
                }
            }

            if(s.length() == 1)
            {
                System.out.print(1 + temp);
                break;
            }
            System.out.print(counter + temp);
            System.out.println();


       }

    }
}