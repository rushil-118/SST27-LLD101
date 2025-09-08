package beverages_decorator;

public abstract class BeverageDecorator extends Beverage {
    public Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
}