package Rectangle;

public class Application1 {
    public static void main(String[] args) {
        double w = 4;
        double h = 40;
        double wi = 3.5;
        double he = 35.9;
      Rectangle rt = new Rectangle(w, h);
        System.out.println("Diện tích hình chữ nhật là : "+ rt.getArea(w,h));
        System.out.println("Chu vi hình chữ nhật là : " + rt.getPerimeter(w, h));

        System.out.println("Diện tích hình chữ nhật là : "+ rt.getArea(wi,he));
        System.out.println("Chu vi hình chữ nhật là : " + rt.getPerimeter(wi, he));
    }
}
