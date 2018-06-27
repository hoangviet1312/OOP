package XayDungLopRandom;

public class Application2 {
    public static void main(String[] args) {
        int number = 100;
        RanDom rado = new RanDom(number);
        int i = 0;
        while (i<50) {
            System.out.println(rado.random1(number));
            i++;
        }
    }
}
