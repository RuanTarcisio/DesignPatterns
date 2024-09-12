package desafio1.builder;

import desafio1.builder.naves.NaveEspacialBuilder;

import java.util.HashMap;
import java.util.Map;

public class Gerente {

    public static Gerente instance;
    public Map<String, NaveEspacialBuilder> navesBuilder;

    private Gerente(){
        this.instance = new Gerente();
        this.navesBuilder = new HashMap<>();
    }

    public Gerente getInstance(){
        if(instance == null)
            return new Gerente();

         return instance;
    }

    public void adicionarBuilder(String chave, NaveEspacialBuilder nave) {
        navesBuilder.put(chave, nave);
    }

    // Método para obter um objeto do mapa com base na chave
    public Object obterBuilder(String nave) {
        return navesBuilder.get(nave);
    }

    // Método para remover um objeto do mapa com base na chave
    public void removerBuilder(String nave) {
        navesBuilder.remove(nave);
    }
}
