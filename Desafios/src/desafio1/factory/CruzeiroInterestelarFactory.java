package desafio1.factory;

import desafio1.builder.Gerente;
import desafio1.builder.naves.NaveEspacialBuilder;
import desafio1.models.NaveEspacial;

public class CruzeiroInterestelarFactory extends NaveEspacialFactory{


    public CruzeiroInterestelarFactory(NaveEspacialBuilder builder) {
        super(builder);
    }

    @Override
    NaveEspacial criarNave() {
        return naveEspacialBuilder.starter().build();
    }
}
