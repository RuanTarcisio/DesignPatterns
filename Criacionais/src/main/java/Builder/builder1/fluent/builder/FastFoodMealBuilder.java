package Builder.builder1.fluent.builder;


import Builder.builder1.fluent.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    /* Objeto final a ser criado. */
    protected FastFoodMeal meal;

    public FastFoodMealBuilder (){
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
