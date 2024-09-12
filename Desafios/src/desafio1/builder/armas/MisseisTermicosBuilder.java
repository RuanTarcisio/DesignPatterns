package desafio1.builder.armas;

import desafio1.models.Arma;
import desafio1.models.MisseisTermicos;

public class MisseisTermicosBuilder implements ArmaBuilder{
    private MisseisTermicos arma;

    public MisseisTermicosBuilder(MisseisTermicos misseisTermicos) {
        this.arma = misseisTermicos;
    }

    public MisseisTermicosBuilder() {
        this.arma = new MisseisTermicos();
    }

    public MisseisTermicos getMisseisTermicos() {
        return arma;
    }

    public void setMisseisTermicos(MisseisTermicos misseisTermicos) {
        this.arma = misseisTermicos;
    }

    @Override
    public ArmaBuilder starter() {
        setCapacidadeRastreamentoCalor(2100)
                .setNome("Arma laser")
                .setAlcance(30000)
                .setTipo("Longo Alcance")
                .setPoderDestruicao(6799);
        return this;
    }

    @Override
    public ArmaBuilder setNome(String nome) {
        this.arma.setNome(nome);
        return this;
    }

    @Override
    public ArmaBuilder setPoderDestruicao(int potencia) {
        this.arma.setPoderDestruicao(potencia);
        return this;
    }

    @Override
    public ArmaBuilder setTipo(String tipo) {
        this.arma.setTipo(tipo);
        return this;
    }

    @Override
    public ArmaBuilder setAlcance(int alcance) {
        this.arma.setAlcance(alcance);
        return this;
    }

    public ArmaBuilder setCapacidadeRastreamentoCalor(int intencidade) {
        this.arma.setCapacidadeRastreamentoCalor(intencidade);
        return this;
    }

    @Override
    public Arma build() {
        return arma;
    }

}