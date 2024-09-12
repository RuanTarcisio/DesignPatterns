package desafio1.builder.armas;

import java.util.HashMap;
import java.util.Map;

public class GerenteArmaBuilders {

    public static GerenteArmaBuilders instance;
    public Map<String, ArmaBuilder> armasBuilder;

    private GerenteArmaBuilders(){
        this.armasBuilder = new HashMap<>();
    }

    public static GerenteArmaBuilders getInstance(){
        if(instance == null)
            instance = new GerenteArmaBuilders();

         return instance;
    }

    public void adicionarBuilder(String chave, ArmaBuilder arma) {
        armasBuilder.put(chave, arma);
    }

    // Método para obter um objeto do mapa com base na chave
    public ArmaBuilder obterBuilder(String nave) {
        return armasBuilder.get(nave);
    }

    // Método para remover um objeto do mapa com base na chave
    public void removerBuilder(String nave) {
        armasBuilder.remove(nave);
    }
}
