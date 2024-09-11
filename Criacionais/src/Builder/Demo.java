package Builder;

/**
 * @author rodrigo.pires
 */
public class Demo {

    public static void main(String[] args) {
        //Gerente gerente = new Gerente(new CheeseBurgerBuilder());
        Gerente gerente = Gerente.getInstance();
        gerente.adicionarObjeto("CheeseBurger", new CheeseBurgerBuilder());
        Burger buger = gerente.obterObjeto("CheeseBurger").build();
        buger.print();

        //Gerente gerente1 = new Gerente(new VeganBurgerBuidler());
        gerente.adicionarObjeto("VeganBurguer",new VeganBurgerBuidler());
        buger = gerente.obterObjeto("VeganBurguer").build();
        buger.print();
    }
}
