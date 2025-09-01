public class STANDARDShipment extends Shipment{

    STANDARDShipment(String type, double w) {
        super(type, w);
    }

    @Override
    public double cost() {
        return 50 + 5*this.weightKg;
    }
    
}
