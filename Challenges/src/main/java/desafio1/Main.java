package desafio1;

import desafio1.builder.GerenteNaveBuilders;
import desafio1.builder.armas.*;
import desafio1.builder.naves.NaveCruzeiroInterestelarBuilder;
import desafio1.builder.naves.NaveEspacialBuilder;
import desafio1.factory.CruzeiroInterestelarFactory;
import desafio1.factory.NaveEspacialFactory;
import desafio1.models.CruzeiroInterestelar;
import desafio1.models.NaveEspacial;

public class Main {
    public static void main(String[] args) {

        GerenteArmaBuilders gerenteArmas = GerenteArmaBuilders.getInstance();
        GerenteNaveBuilders gerenteNaves = gerarBuilders(gerenteArmas);

        NaveEspacialBuilder cruzeiroInterestelarBuilder = gerenteNaves.obterBuilder("cruzeiroInterestelarBuilder");
        NaveEspacialFactory cruzeiroFactory = new CruzeiroInterestelarFactory(cruzeiroInterestelarBuilder);
        NaveEspacial cruzeiro = cruzeiroFactory.criarNave();

        System.out.println(cruzeiro);
    }

    static GerenteNaveBuilders gerarBuilders(GerenteArmaBuilders gerenteArmas){
        GerenteNaveBuilders gerenteNaves = GerenteNaveBuilders.getInstance();
        ArmaBuilder laserBuilder = new LaserBuilder();
        ArmaBuilder canhaoPlasmaBuilder = new CanhaoPlasmaBuilder();
        ArmaBuilder misseisTermicosBuildertermicosBuilder = new MisseisTermicosBuilder();

        gerenteArmas.adicionarBuilder("laserBuilder", laserBuilder);
        gerenteArmas.adicionarBuilder("canhaoPlasmaBuilder", canhaoPlasmaBuilder);
        gerenteArmas.adicionarBuilder("misseisTermicosBuilder", misseisTermicosBuildertermicosBuilder);

        NaveEspacialBuilder cruzeiroInterestelarBuilder = new NaveCruzeiroInterestelarBuilder();



        gerenteNaves.adicionarBuilder("cruzeiroInterestelarBuilder", cruzeiroInterestelarBuilder);

        return gerenteNaves;
    }
}
