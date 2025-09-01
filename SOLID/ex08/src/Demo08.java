public class Demo08 {
    public static void main(String[] args) {
        Pedal v = new Bicycle();
        v.pedal(3); // crash

        Engine engine = new Bike();
        engine.startEngine();
    }
}
