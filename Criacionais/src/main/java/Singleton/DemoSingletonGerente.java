package Singleton;


public class DemoSingletonGerente {

    public static void main(String[] args) {
        SingletonGerente gerente = SingletonGerente.getInstance();
        Boolean bool = false;

        gerente.adicionarObjeto("objeto1", new String("Objeto 1"));
        gerente.adicionarObjeto("objeto2", bool);

        // Obtendo e usando os objetos
        String objeto1 = (String) gerente.obterObjeto("objeto1");
        Boolean objeto2 = (Boolean) gerente.obterObjeto("objeto2");

        System.out.println("Objeto 1: " + objeto1);
        System.out.println("Objeto 2: " + objeto2);

        // Removendo um objeto
        gerente.removerObjeto("objeto1");
    }
}
