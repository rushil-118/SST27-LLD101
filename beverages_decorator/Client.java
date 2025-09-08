package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		Beverage coffee = new Cappuccino();
        System.out.println("Coffee");
		System.out.println(coffee.cost());
		
		Beverage chocoLatte = new ChocolateDecorator(new Latte());
		System.out.println("Chocolate Latte");
		System.out.println(chocoLatte.cost());
		
		Beverage coffeeWithSugar = new SugarDecorator(new Cappuccino());
		System.out.println("Cappuccino with Sugar");
		System.out.println(coffeeWithSugar.cost());
	}

}