package desafio1.models;

public class MisseisTermicos extends Arma {
    private int capacidadeRastreamentoCalor;

    public MisseisTermicos(String nome, String tipo, int poderDestruicao, int alcance, int tempoRecarga, int capacidadeRastreamentoCalor) {
        super("Laser", tipo, poderDestruicao, alcance);
        this.capacidadeRastreamentoCalor = capacidadeRastreamentoCalor;
    }

    public MisseisTermicos() {
    }

    public void setCapacidadeRastreamentoCalor(int capacidadeRastreamentoCalor) {
        this.capacidadeRastreamentoCalor = capacidadeRastreamentoCalor;
    }

    @Override
    public void ativar() {
        System.out.println("Lançando Mísseis Térmicos com rastreamento de calor em " + capacidadeRastreamentoCalor + "%!");
    }

    public int getCapacidadeRastreamentoCalor() {
        return capacidadeRastreamentoCalor;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacidadeRastreamentoCalor=" + capacidadeRastreamentoCalor + '}';
    }
}
