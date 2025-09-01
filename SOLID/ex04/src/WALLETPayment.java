public class WALLETPayment extends Payment{

    WALLETPayment(String p, double a) {
        super(p, a);
    }

    @Override
    public String processPayment() {
        return "Wallet debit: " + this.amount;
    }
    
}
