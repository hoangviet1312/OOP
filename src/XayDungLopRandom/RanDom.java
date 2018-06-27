package XayDungLopRandom;
import java.util.Random;
public class RanDom {
    int rd;

    public RanDom(int rd) {

    }

    public int random1(int rdom) {
        this.rd = rdom;
        Random rand = new Random();
        int number = rand.nextInt(rdom);
        return number;
    }
}
