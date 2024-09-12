package DESAFIO.models;

import java.util.List;
import java.util.UUID;

public class CruzeiroInterestelar extends NaveEspacial {
    private int tempoViagem; // tempo de viagem em anos

    public CruzeiroInterestelar(UUID idNave, List<Arma> armas, int capacidadePassageiros, String sistemaPropulsao, int autonomia, int tempoViagem) {
        super(idNave, armas, capacidadePassageiros, sistemaPropulsao, autonomia);
        this.tempoViagem = tempoViagem;
    }

    public int getTempoViagem() {
        return tempoViagem;
    }

    public void setTempoViagem(int tempoViagem) {
        this.tempoViagem = tempoViagem;
    }

    @Override
    public void descricao() {
        System.out.println("Cruzeiro Interestelar com tempo de viagem de " + tempoViagem + " anos.");
    }

    @Override
    public String toString() {
        return super.toString() + ", tempoViagem=" + tempoViagem + '}';
    }
}

