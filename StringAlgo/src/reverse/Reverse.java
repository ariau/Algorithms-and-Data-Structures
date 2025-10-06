package reverse;

import java.util.Scanner;

public class Reverse {

    private Scanner scanner;

    public Reverse() {
        this.scanner = new Scanner(System.in);
    }

    public void reverse() {
        String str = getString("loop");

        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public void reverse2() {
        String str = getString("stringBuilder");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        System.out.print(stringBuilder.reverse());
        System.out.println();
    }

    public void closeScanner() {
        this.scanner.close();
    }

    private String getString(String mode) {
        System.out.print("Enter String to reverse" + mode + ": ");
        return scanner.nextLine();
    }
}
