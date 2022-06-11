package chapters.chapters5;

public class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        int a = 10, b = 20;
        while (a > b) {
            System.out.println(" эта строка выводиться не будет ");
        }

        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;
        System.out.println(i);


    }


}
