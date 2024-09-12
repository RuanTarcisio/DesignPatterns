package desafio1.builder.naves;

import desafio1.models.Arma;
import desafio1.models.NaveEspacial;

public interface NaveEspacialBuilder {
    NaveEspacialBuilder setCapacidadePassageiros(int capacidade);
    NaveEspacialBuilder setSistemaPropulsao(String propulsao);
    NaveEspacialBuilder setAutonomia(int autonomia);
    NaveEspacialBuilder setArmamentos(Arma arma);
    NaveEspacialBuilder starter();
    NaveEspacial build();
}
