public class Stock {
    String symbol;
    String nameCoPhieu;
    double gia_homqua;
    double gia_homnay;

    public void symbol(String symbol) {
        this.symbol = symbol;
    }

    public void name(String name) {
        this.nameCoPhieu = name;
    }

    public void previousClosingPrice(double gia_homqua) {
        this.gia_homqua = gia_homqua;
    }

    public void curentPrice(double gia_homnay) {
        this.gia_homnay = gia_homnay;
    }

    public double getChangePercent(double gia_homqua, double gia_homnay) {
        return ((gia_homnay - gia_homqua) / gia_homqua) * 100;
    }
}
