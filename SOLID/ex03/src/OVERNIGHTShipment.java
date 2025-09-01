public class OVERNIGHTShipment extends Shipment {

    OVERNIGHTShipment(String type, double w) {
        super(type, w);
    }

    @Override
    public double cost() {
        return 120 + 10*this.weightKg;
    }
    
}
