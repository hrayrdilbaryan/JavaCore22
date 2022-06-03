package homework;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {

        PracticeHomework ph = new PracticeHomework();

        long sec = ph.convert(46);
        System.out.println(sec);

        int day = ph.calcAge(8);
        System.out.println(day);

        int numb = ph.nextNumber(21);
        System.out.println(numb);

        boolean ism = ph.isSameNum(4, 8);
        System.out.println(ism);

        boolean zero = ph.lessThanOrEqualToZero(-7);
        System.out.println(zero);

        boolean reverse = ph.reverseBool(true);
        System.out.println(reverse);

        int[] array1 = new int[27];
        int[] array2 = new int[42];
        int max = ph.maxLength(array1,array2);
        System.out.println(max);


    }


}
