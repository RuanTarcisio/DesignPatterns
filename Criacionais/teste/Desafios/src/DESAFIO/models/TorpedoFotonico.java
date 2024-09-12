package DESAFIO.models;

public class TorpedoFotonico extends Arma {
    private int tempoArmar; // em segundos

    public TorpedoFotonico(int poderDestruicao, int alcance, int tempoArmar) {
        super("Torpedo Fotônico", poderDestruicao, alcance);
        this.tempoArmar = tempoArmar;
    }

    @Override
    public void ativar() {
        System.out.println("Torpedo Fotônico armado! Tempo de armar: " + tempoArmar + " segundos.");
    }

    public int getTempoArmar() {
        return tempoArmar;
    }

    @Override
    public String toString() {
        return super.toString() + ", tempoArmar=" + tempoArmar + '}';
    }
}