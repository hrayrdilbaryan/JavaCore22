package homework.arrayutil;

public class ArrayUtil1Demo {
    public static void main(String[] args) {

        ArrayUtil1 arr = new ArrayUtil1();

        int[] array = {3, 5, -8, 13, 0, 6,34, 7, 1};
        int maxNumber = arr.max(array);
        System.out.println(maxNumber);

        int minNumber = arr.min(array);
        System.out.println(minNumber);

        arr.even(array);
        System.out.println();

        arr.odd(array);

        int average = arr.arrayAverage(array);
        System.out.println(average);

        int sum = arr.sumElem(array);
        System.out.println(sum);

        arr.bubbleSort(array);
        System.out.println();

        arr.bubbleSortReverse(array);

    }
}
