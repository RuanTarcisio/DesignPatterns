package DESAFIO.models;

public class CanhaoPlasma extends Arma {
    private int tempoRecarga; // em segundos

    public CanhaoPlasma( ) {
    }

    public CanhaoPlasma(String nome, String tipo, int poderDestruicao, int alcance, int tempoRecarga) {
        super("Laser", tipo, poderDestruicao, alcance);
        this.tempoRecarga = tempoRecarga;
    }

    @Override
    public void ativar() {
        System.out.println("Disparando o Canhão de Plasma! Tempo de recarga: " + tempoRecarga + " segundos.");
    }

    public void setTempoRecarga(int tempoRecarga) {
        this.tempoRecarga = tempoRecarga;
    }

    public int getTempoRecarga() {
        return tempoRecarga;
    }

    @Override
    public String toString() {
        return super.toString() + ", tempoRecarga=" + tempoRecarga + '}';
    }
}