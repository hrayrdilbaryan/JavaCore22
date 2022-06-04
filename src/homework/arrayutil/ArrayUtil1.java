package homework.arrayutil;

public class ArrayUtil1 {

    int max (int[]array){
        int maxIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]> maxIndex){
                maxIndex = array[i];
            }
        }
        return maxIndex;
    }

    int min (int[]array){
        int minIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minIndex){
                minIndex = array[i];
            }
        }
        return  minIndex;
    }

    void even (int[]array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
                System.out.print(array[i] + " ");
            }

        }
        System.out.println(count);
    }
    void odd (int[]array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                count ++;
                System.out.print(array[i] + " ");
            }

        }
        System.out.println(count);
    }
     int arrayAverage (int[]array){
        int sum = 0;
        int count = 0;
         for (int i = 0; i < array.length; i++) {
             sum += array[i];
             count++;
         }
         return sum / count;
    }

    int sumElem (int[]array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    void bubbleSort (int[]array){
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <array.length ; j++) {
                if (array[i] > array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");
        }
    }

    void bubbleSortReverse (int[]array){
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <array.length ; j++) {
                if (array[i] < array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");

        }

    }

}
