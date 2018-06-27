public class Application {
    public static void main(String[] args) {
        String symbol = "ORCL";
        String name = "Oracle Corportion";
        double giahomqua = 34.5;
        double giahomnay = 34.35;

        Stock stock = new Stock();

        System.out.println("Phần trăm thay đổi giữa hôm qua và hôm nay là : " + stock.getChangePercent(giahomqua, giahomnay));

    }
}
