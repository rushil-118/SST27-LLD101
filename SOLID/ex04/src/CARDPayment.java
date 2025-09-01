public class CARDPayment extends Payment{

    CARDPayment(String p, double a) {
        super(p, a);
    }

    @Override
    public String processPayment() {
       return "Charged card: " + this.amount;
    }
    
}
