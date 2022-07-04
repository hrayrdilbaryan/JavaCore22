package chapters.chapter10;

public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("verxni uroven");
        e.initCause(new ArithmeticException("prichina"));

        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("perexvacheno isklyuchenie:" + e);
            System.out.println("pervoprichina: " + e.getCause());
        }
    }
}
