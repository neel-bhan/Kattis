import java.util.*;

public class babelfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> TranslationMap = new HashMap<String, String>();
        while (true) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                break;
            }
            String[] temp = line.split(" ");


            TranslationMap.put(temp[1], temp[0]);

        }

        while (sc.hasNextLine()) {
            String Input = sc.nextLine();


            if (TranslationMap.containsKey(Input)) {
                System.out.println(TranslationMap.get(Input));

            } else
                System.out.println("eh");

            }
        }
    }

