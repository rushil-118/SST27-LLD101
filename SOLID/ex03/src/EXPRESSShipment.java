public class EXPRESSShipment extends Shipment{

    EXPRESSShipment(String type, double w) {
        super(type, w);
    }

    @Override
    public double cost() {
        return 80 + 8*this.weightKg;
    }
    
}
