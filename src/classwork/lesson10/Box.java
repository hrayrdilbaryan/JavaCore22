package classwork.lesson10;

public class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double volume(){

        return depth * height * width;
    }

    boolean equalTo(Box box){
        return this.width == box.width
                && this.height == box.height
                && this.depth == box.depth;
    }



}
