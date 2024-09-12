package desafio1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CruzeiroInterestelar extends NaveEspacial {

    public CruzeiroInterestelar(UUID idNave, List<Arma> armas, int capacidadePassageiros, String sistemaPropulsao, int autonomia) {
        super(idNave, armas, capacidadePassageiros, sistemaPropulsao, autonomia);

    }

    public CruzeiroInterestelar( ) {
        super.armas = new ArrayList<>();
    }


    @Override
    public void descricao() {
        System.out.println("Cruzeiro Interestelar com tempo de viagem de " );
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

