package Singleton.Gerente;

import java.util.HashMap;
import java.util.Map;

public class SingletonGerente {
    private static SingletonGerente instance;
    private Map<String, Object> objetosGerenciados;

    private SingletonGerente(){
        objetosGerenciados = new HashMap<>();
    }

    public static SingletonGerente getInstance() {
        if (instance == null) {
            instance = new SingletonGerente();
        }
        return instance;
    }

    public void adicionarObjeto(String chave, Object objeto) {
        objetosGerenciados.put(chave, objeto);
    }

    // Método para obter um objeto do mapa com base na chave
    public Object obterObjeto(String chave) {
        return objetosGerenciados.get(chave);
    }

    // Método para remover um objeto do mapa com base na chave
    public void removerObjeto(String chave) {
        objetosGerenciados.remove(chave);
    }
}
