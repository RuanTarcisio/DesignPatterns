package DESAFIO.builder;

import DESAFIO.builder.naves.NaveEspacialBuilder;

import java.util.HashMap;
import java.util.Map;

public class Gerente {

    public static Gerente instance;
    public Map<String, NaveEspacialBuilder> naves;

    private Gerente(){
        this.instance = new Gerente();
        this.naves = new HashMap<>();
    }

    public Gerente getInstance(){
        if(instance == null)
            return new Gerente();

         return instance;
    }

    public void adicionarBuilder(String chave, NaveEspacialBuilder nave) {
        naves.put(chave, nave);
    }

    // Método para obter um objeto do mapa com base na chave
    public Object obterBuilder(String nave) {
        return naves.get(nave);
    }

    // Método para remover um objeto do mapa com base na chave
    public void removerBuilder(String nave) {
        naves.remove(nave);
    }
}
