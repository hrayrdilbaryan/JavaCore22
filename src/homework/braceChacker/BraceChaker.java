package homework.braceChacker;

import homework.stack.Stack;

public class BraceChaker {

    private final String text;
    private final Stack stack = new Stack();

    BraceChaker(String text) {
        this.text = text;
    }

    public void chck() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            char check;
            switch (c){
                case ')':
                    check = (char) stack.pop();
                    if (check == '{' || check == '['){
                        System.out.println("opened " + check + "but closed " + c + "inIndex " + i);
                    }
                    break;
                case '}':
                    check = (char) stack.pop();
                    if (check == '[' || check == '('){
                        System.out.println("openes " + check + "but closed " + c + "inIndex " + i);
                    }
                    break;
                case ']':
                    check = (char) stack.pop();
                    if (check == '{' || check == '('){
                        System.out.println("openes " + check + "but closed " + c + "inIndex " + i);
                    }
                    break;
            }
        }
        char last;
        while ((last = (char)stack.pop()) != 0){
            System.out.println("Error opened " + last + "But not closed ");

        }


    }

}
