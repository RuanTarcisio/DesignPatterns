package Builder.builder1.fluent.builder;

public class FatMealBuilder extends FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("MilkShake");
    }

    @Override
    public void buildMain() {
        meal.setMain("X-EggFrangoBaconBurger");
    }

    @Override
    public void buildSide() {
        meal.setSide("Onion Rings");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Manja dos Deuses");
    }

    @Override
    public void buildGift() {
        meal.setToy("Day Hospital");
    }
}
