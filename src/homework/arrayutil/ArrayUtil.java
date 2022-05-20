package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {56, 8, 3, -8, 0, 65, 6, 54, 2, 13};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max->" + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min->" + min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int countOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0 && array[i] % 2== 0){
              countOfEvens ++;
            }
        }
        System.out.println(countOfEvens);

        int countOfOdds = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
              countOfOdds ++;
            }
        }
        System.out.println(countOfOdds);

        double sun = 0;
        for (int i = 0; i < array.length; i++) {
            sun += array[i];
        }
        System.out.println("sun " + sun);
        double avg = sun / array.length;
        System.out.println("avg " + avg);



    }
}
