package desafio1.builder;

import desafio1.builder.armas.GerenteArmaBuilders;
import desafio1.builder.naves.NaveEspacialBuilder;

import java.util.HashMap;
import java.util.Map;

public class GerenteNaveBuilders {

    public static GerenteNaveBuilders instance;
    private static GerenteArmaBuilders armaBuilders;
    public Map<String, NaveEspacialBuilder> navesBuilder;

    private GerenteNaveBuilders(){
        this.navesBuilder = new HashMap<>();
    }

    public GerenteNaveBuilders(GerenteArmaBuilders gerenteArma) {
        armaBuilders = gerenteArma;
        this.navesBuilder = new HashMap<>();
    }

    public static GerenteNaveBuilders getInstance(GerenteArmaBuilders armaBuilders){
        if(instance == null)
            return new GerenteNaveBuilders(armaBuilders);

         return instance;
    }

    public static GerenteNaveBuilders getInstance( ){
        if(instance == null)
            return new GerenteNaveBuilders();

        return instance;
    }

    public void adicionarBuilder(String chave, NaveEspacialBuilder nave) {
        navesBuilder.put(chave, nave);
    }

    public NaveEspacialBuilder obterBuilder(String nave) {
        return navesBuilder.get(nave);
    }

    public void removerBuilder(String nave) {
        navesBuilder.remove(nave);
    }
}
