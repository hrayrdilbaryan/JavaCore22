package chapters.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        }catch (ArithmeticException e){
            System.out.println("delenie na nul: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("oshibka indeksikacii za predelyami " + "massiva: " + e);

        }
        System.out.println("posle blika operatorov try/catch.");

    }
}
