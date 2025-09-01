public class UPIPayment extends Payment {

    UPIPayment(String p, double a) {
        super(p, a);
    }

    @Override
    public String processPayment() {
        return "Paid via UPI: " + this.amount;
    }
    
}
