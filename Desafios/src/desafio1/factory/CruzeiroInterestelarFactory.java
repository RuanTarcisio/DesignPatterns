package desafio1.factory;

import desafio1.builder.naves.NaveEspacialBuilder;
import desafio1.models.CruzeiroInterestelar;
import desafio1.models.NaveEspacial;

public class CruzeiroInterestelarFactory extends NaveEspacialFactory{


    public CruzeiroInterestelarFactory(NaveEspacialBuilder builder) {
        super(builder);
    }

    @Override
    public NaveEspacial criarNave() {

        CruzeiroInterestelar cruzeiroInterestelar = (CruzeiroInterestelar) super.naveEspacialBuilder.starter().build();

        return cruzeiroInterestelar;
    }
}
