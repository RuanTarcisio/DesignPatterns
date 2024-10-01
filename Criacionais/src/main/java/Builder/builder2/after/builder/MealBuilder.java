package Builder.builder2.after.builder;

import Builder.builder2.after.model.Size;

import java.util.List;


public interface MealBuilder {

	void setSize(Size size);
	void setSauce(List<String> sauces);
	void setToppings(List<String> toppings);
	void setCheese(boolean cheese);
	void setPepper(boolean pepper);
}
