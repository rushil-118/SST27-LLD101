

public class Demo01 {
    public static void main(String[] args) {
        Tax tax = new TaxCalculation();
        new OrderService(tax).checkout("a@shop.com", 100.0);
    }
}
