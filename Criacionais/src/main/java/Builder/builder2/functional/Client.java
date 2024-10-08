package Builder.builder2.functional;

import Builder.builder2.functional.model.Pasta;
import Builder.builder2.functional.model.Size;

public class Client {

	public static void main(String[] args) {
		Pasta p1 = new Pasta.Builder(Size.LARGE).now();
		System.out.println(p1);
		
		Pasta p2 = new Pasta.Builder(Size.SMALL)
				.withToppings("Bacon", "Broccoli")
				.withSauces("Tomato")
				.withCheese()
				.now();
		System.out.println(p2);
		
		Pasta p3 = new Pasta.Builder(Size.STANDARD)
				.withToppings("Garlic")
				.withSauces("Funghi", "Cheese")
				.withCheese()
				.withPepper()
				.now();
		System.out.println(p3);
	}
}
