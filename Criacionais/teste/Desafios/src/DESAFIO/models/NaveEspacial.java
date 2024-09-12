package DESAFIO.models;

import java.util.List;
import java.util.UUID;

public abstract class NaveEspacial {
    protected UUID idNave;
    protected List<Arma> armas;
    protected int capacidadePassageiros;
    protected String sistemaPropulsao;
    protected int autonomia;

    public NaveEspacial(UUID idNave, List<Arma> armas, int capacidadePassageiros, String sistemaPropulsao, int autonomia) {
        this.idNave = idNave;
        this.armas = armas;
        this.capacidadePassageiros = capacidadePassageiros;
        this.sistemaPropulsao = sistemaPropulsao;
        this.autonomia = autonomia;
    }



//    public NaveEspacial(NaveEspacialBuilder builder) {
//        this.idNave = UUID.randomUUID(); // Gera automaticamente um UUID único
//        this.armas = builder.armas;
//        this.capacidadePassageiros = builder.capacidadePassageiros;
//        this.sistemaPropulsao = builder.sistemaPropulsao;
//        this.tipoCabine = builder.tipoCabine;
//    }


    public UUID getIdNave() {
        return idNave;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void adicionarArma(Arma arma) {
        this.armas.add(arma);
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getSistemaPropulsao() {
        return sistemaPropulsao;
    }

    public void setSistemaPropulsao(String sistemaPropulsao) {
        this.sistemaPropulsao = sistemaPropulsao;
    }

    public abstract void descricao();

    @Override
    public String toString() {
        return "NaveEspacial{" +
                "idNave=" + idNave +
                ", capacidadePassageiros=" + capacidadePassageiros +
                ", sistemaPropulsao='" + sistemaPropulsao + '\'' +
                ", armas=" + armas +
                '}';
    }


}