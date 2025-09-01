public abstract class Payment {
    String provider; double amount;
    Payment(String p, double a){ provider=p; amount=a; }
    public abstract String processPayment();
}