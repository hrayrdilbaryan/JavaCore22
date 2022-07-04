package chapters.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{
        System.out.println("v teli metoda throwOne().");
        throw new IllegalAccessException("demonstraciya");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        }catch(IllegalAccessException e){
            System.out.println("perexvacheno isklyuchenie: " + e);
        }
    }
}
