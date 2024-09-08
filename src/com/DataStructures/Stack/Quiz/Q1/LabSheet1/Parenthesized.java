// Lab Exercise 1-b
package DataStructures.Stack.Quiz.Q1.LabSheet1;

public class Parenthesized {
    public static boolean isParenthesized(String expression) {
        Stack stack = new Stack(expression.length());

        for(char ch : expression.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
                continue;
            }

            if(ch == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }


    public static boolean isParenthesizedExt(String expression) {
        Stack stack = new Stack(expression.length());

        for(char ch : expression.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }

            if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char last = stack.pop();
   /*             if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }*/

                switch (ch) {
                    case ')':
                        if (last != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (last != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (last != '[') {
                            return false;
                        }
                        break;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an expression: ");
//        String expression = scanner.nextLine();
//
//        if (isParenthesizedExt(expression)) {
//            System.out.println("The expression is valid.");
//        } else {
//            System.out.println("The expression is not valid.");
//        }

        System.out.println(isParenthesizedExt("3 + {(6 * [2]) - 3}")); // valid
        System.out.println(isParenthesizedExt("3 + {(6 * [2] - 3}")); // not valid
        System.out.println(isParenthesizedExt("[(3 + {6 * 2}) - 3]")); // valid
        System.out.println(isParenthesizedExt("[(3 + {6 * 2} - 3]")); // not valid
        System.out.println(isParenthesizedExt("{[}]")); // not valid
    }
}
