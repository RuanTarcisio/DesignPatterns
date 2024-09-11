package Builder;

/**
 * @author rodrigo.pires
 */
public abstract class BurgerBuilder {

    Burger burger = new Burger();

    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildSalad();
    abstract void buildCheese();
    abstract void buildSauce();

    Burger build(){
        reset();
        buildBun();
        buildSalad();
        buildCheese();
        buildMeat();
        buildSauce();
        return burger;
    };

    Burger reset(){
        burger.setBun("");
        burger.setCheese("");
        burger.setMeat("");
        burger.setSauce("");
        burger.setSalad("");

        return burger;
    }

}
