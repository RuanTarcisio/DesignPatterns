package desafio1.factory;

import desafio1.builder.naves.NaveEspacialBuilder;
import desafio1.models.NaveEspacial;

public abstract class NaveEspacialFactory {

    protected NaveEspacialBuilder naveEspacialBuilder;

    public NaveEspacialFactory(NaveEspacialBuilder builder) {
        this.naveEspacialBuilder = builder;
    }

    public abstract NaveEspacial criarNave();
}
