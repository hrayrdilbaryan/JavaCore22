package classwork.lesson10;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox = new Box(3, 5, 9);

        double vol = myBox.volume();
        System.out.println(vol * 2);

        Box myBox2 = new Box(3, 5, 9);

        System.out.println(myBox2.volume());

        System.out.println(myBox.equalTo(myBox2));


    }

}
