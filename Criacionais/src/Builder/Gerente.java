package Builder;

import Singleton.Gerente.SingletonGerente;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rodrigo.pires
 */
public class Gerente {

    private static Gerente instance;
    private Map<String, BurgerBuilder> gerenteBuilder;

    private Gerente(){
        gerenteBuilder = new HashMap<>();
    }


    public static Gerente getInstance() {
        if (instance == null) {
            instance = new Gerente();
        }
        return instance;
    }

//    public Gerente(BurgerBuilder builder) {
//        this.builder = builder;
//    }
public void adicionarObjeto(String chave, BurgerBuilder builder) {
    gerenteBuilder.put(chave, builder);
}

    // Método para obter um objeto do mapa com base na chave
    public BurgerBuilder obterObjeto(String chave) {
        return gerenteBuilder.get(chave);
    }
//    public BurgerBuilder getBuilder() {
//        return builder;
//    }

//    public void setBuilder(BurgerBuilder builder) {
//        this.builder = builder;
//    }

    public Burger buildBurger(String chave) {
        BurgerBuilder builder = obterObjeto(chave);

        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
