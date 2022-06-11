package chapters.chapter7;

public class RetOb {

    public static void main(String[] args) {
        Test1 ob1 = new Test1(2);
        Test1 ob2;

        ob2 = ob1.incrBYten();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrBYten();
        System.out.println("ob2.a после второго увеличения значен " + ob2.a);


    }

}
