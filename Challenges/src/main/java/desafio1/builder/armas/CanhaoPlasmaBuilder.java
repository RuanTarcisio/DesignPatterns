package desafio1.builder.armas;


import desafio1.models.Arma;
import desafio1.models.CanhaoPlasma;

public class CanhaoPlasmaBuilder implements ArmaBuilder{

    private CanhaoPlasma arma;

    public CanhaoPlasmaBuilder(CanhaoPlasma arma) {
        this.arma = arma;
    }

    public CanhaoPlasmaBuilder() {
        this.arma = new CanhaoPlasma();
    }

    @Override
    public ArmaBuilder starter() {
        setTempoRecarga(5)
                .setNome("Arma laser")
                .setAlcance(2500)
                .setTipo("Longo Alcance")
                .setPoderDestruicao(4000);
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

    public ArmaBuilder setTempoRecarga(int intencidade){
        this.arma.setTempoRecarga(intencidade);
        return this;
    }

    @Override
    public Arma build() {
        return arma;
    }
}
