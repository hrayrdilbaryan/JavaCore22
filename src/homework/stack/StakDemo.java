package homework.stack;

public class StakDemo {
    public static void main(String[] args) {

        Stak myStack = new Stak();
        Stak myStack2 = new Stak();

        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        for (int i = 10; i <20 ; i++) {
            myStack2.push(i);
        }
        System.out.println("content mySteck");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i <10 ; i++) {
            System.out.print(myStack2.pop() + " ");

        }


    }
}
