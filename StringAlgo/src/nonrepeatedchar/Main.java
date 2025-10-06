package nonrepeatedchar;

import java.util.Scanner;

public class Main {

    public static String firstNonRepeatingNumber(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if(str.charAt(i) != ' ') {
                for (int j = 0; j < str.length(); j++) {

                    if(i!=j && str.charAt(j) == str.charAt(i)) {
                        count++;
                        break;
                    }

                }
            }

            if(count==0) {
                result += str.charAt(i);
                break;
            }
        }

        return result;
    }

    public static String lastNonRepeatingNumber(String str) {
        String result = "";

        for (int i = str.length() - 1; i > 0; i--) {
            int count = 0;
            if(str.charAt(i)!=' ') {
                for (int j = 0; j < str.length(); j++) {
                    if(i!=j && str.charAt(i) == str.charAt(j)) {
                        count++;
                        break;
                    }
                }
                if(count==0) {
                    result+=str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        System.out.println("Answer is: "+ firstNonRepeatingNumber(str));
        System.out.println("Enter String: ");
        String strLast=sc.nextLine();
        System.out.println("Answer is: "+ lastNonRepeatingNumber(strLast));
    }
}
