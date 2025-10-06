package stringalgo.parentethis;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Is Valid parentheses: " +  isValid());
    }

    private static boolean isValid() {
        String str = "[({})])";
        Stack <Character> stack = new Stack();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '('
                    || str.charAt(i) == '{'
                    || str.charAt(i) == '[') {

                stack.push(str.charAt(i));

            } else if(str.charAt(i) == ')'
                    || str.charAt(i) == '}'
                    || str.charAt(i) == ']') {

                //Missing openning one
                if(stack.isEmpty()) return false;

                char top = stack.peek();
                if(top != '(' && str.charAt(i) == ')'
                        || top != '{' && str.charAt(i) == '}'
                        || top != '[' && str.charAt(i) == ']')  {
                    return false;
                }
                //
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
