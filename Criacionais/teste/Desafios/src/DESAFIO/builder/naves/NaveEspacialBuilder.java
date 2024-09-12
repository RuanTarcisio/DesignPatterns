package DESAFIO.builder.naves;

import DESAFIO.builder.armas.ArmaBuilder;
import DESAFIO.models.Arma;
import DESAFIO.models.NaveEspacial;

public interface NaveEspacialBuilder {
    NaveEspacialBuilder setCapacidadePassageiros(int capacidade);
    NaveEspacialBuilder setSistemaPropulsao(String propulsao);
    NaveEspacialBuilder setAutonomia(int autonomia);
    NaveEspacialBuilder setArmamentos(Arma arma);
    NaveEspacialBuilder starter();
    NaveEspacial build();
}
