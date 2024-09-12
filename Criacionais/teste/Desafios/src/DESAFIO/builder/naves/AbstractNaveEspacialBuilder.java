package DESAFIO.builder.naves;

import DESAFIO.models.Arma;
import DESAFIO.models.NaveEspacial;

public class AbstractNaveEspacialBuilder implements NaveEspacialBuilder{

    private NaveEspacial nave;

    public AbstractNaveEspacialBuilder(NaveEspacial nave) {
        this.nave = nave;
    }

    public NaveEspacial getNave() {
        return nave;
    }

    public void setNave(NaveEspacial nave) {
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
        return null;
    }

    @Override
    public NaveEspacial build() {
        return nave;
    }
}
