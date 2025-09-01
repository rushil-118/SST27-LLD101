public class OrderService {
    Tax tax;
    public OrderService(Tax tax) {
        this.tax = tax;
    }

    EmailClient email = new EmailClient();

    
    void checkout(String customerEmail, double subtotal) {
        double total = tax.totalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}