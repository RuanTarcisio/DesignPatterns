package desafio1.builder.naves;


import desafio1.builder.armas.ArmaBuilder;
import desafio1.builder.armas.CanhaoPlasmaBuilder;
import desafio1.builder.armas.LaserBuilder;
import desafio1.models.Arma;
import desafio1.models.CruzeiroInterestelar;

import java.util.HashMap;
import java.util.Map;

public class NaveCruzeiroInterestelarBuilder implements NaveEspacialBuilder{
    private CruzeiroInterestelar nave;
    private Map<String, Arma> armas;

    public NaveCruzeiroInterestelarBuilder(CruzeiroInterestelar nave) {
        this.armas = new HashMap<>();
        this.armas.put("Laser", new LaserBuilder().starter().build());
        this.armas.put("Canhao Plasma", new CanhaoPlasmaBuilder().starter().build());
        this.nave = nave;
    }

    public NaveCruzeiroInterestelarBuilder() {
        this.nave = new CruzeiroInterestelar();
        this.armas = new HashMap<>();
        this.armas.put("Laser", new LaserBuilder().starter().build());
        this.armas.put("Canhao Plasma", new CanhaoPlasmaBuilder().starter().build());
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
                .setArmamentos(armas.get("Laser"))
                .setArmamentos(armas.get("Canhao Plasma"))
                .setAutonomia(200)
                .setCapacidadePassageiros(200);

        return this;
    }

    @Override
    public CruzeiroInterestelar build() {
        return nave;
    }
}
