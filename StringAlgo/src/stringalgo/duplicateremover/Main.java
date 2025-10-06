package stringalgo.duplicateremover;

public class Main {

    public static void main(String[] args) {
        // exemple banana -> ban
        String str = "babaans";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j) && i!=j) {
                    count++;
                }
            }
            if(count==0) {
                result += str.charAt(i);
            }
        }

        show(result);

    }

    public static void show(Object obj) {
        System.out.println(obj);
    }
}
