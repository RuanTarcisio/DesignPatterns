package DESAFIO.builder.naves;

import DESAFIO.builder.armas.CanhaoPlasmaBuilder;
import DESAFIO.builder.armas.LaserBuilder;
import DESAFIO.models.Arma;
import DESAFIO.models.ArmaLaser;
import DESAFIO.models.CanhaoPlasma;
import DESAFIO.models.CruzeiroInterestelar;

public class NaveCruzeiroInterestelarBuilder implements NaveEspacialBuilder{
    private CruzeiroInterestelar nave;

    public NaveCruzeiroInterestelarBuilder(CruzeiroInterestelar nave) {
        this.nave = nave;
    }

    public CruzeiroInterestelar getNave() {
        return nave;
    }

    public void setNave(CruzeiroInterestelar nave) {
        this.nave = nave;
    }

    @Override
    public NaveEspacialBuilder setCapacidadePassageiros(int capacidade) {
        nave.setCapacidadePassageiros(capacidade);
        return this;
    }

    @Override
    public NaveEspacialBuilder setSistemaPropulsao(String propulsao) {
        nave.setSistemaPropulsao(propulsao);
        return this;
    }

    @Override
    public NaveEspacialBuilder setAutonomia(int autonomia) {
        nave.setAutonomia(autonomia);
        return this;
    }

    @Override
    public NaveEspacialBuilder setArmamentos(Arma arma) {
        nave.adicionarArma(arma);
        return this;
    }

    @Override
    public NaveEspacialBuilder starter() {
        setSistemaPropulsao("Etanol")
                .setArmamentos(new LaserBuilder(new ArmaLaser()).starter().build())
                .setArmamentos(new CanhaoPlasmaBuilder(new CanhaoPlasma()).starter().build())
                .setAutonomia(200)
                .setCapacidadePassageiros(200);

        return this;
    }

    @Override
    public CruzeiroInterestelar build() {
        return nave;
    }
}
