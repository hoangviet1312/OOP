package Rectangle;

public class Rectangle {
    private double height = 1;
    private double width = 1;

    public Rectangle(double height, double width) {

    }

    public double getArea(double chieucao, double chieurong) {
        return chieucao * chieurong;
    }

    public double getPerimeter(double chieucao, double chieurong) {
        return (chieucao + chieurong) * 2;
    }


}
