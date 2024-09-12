package desafio1.builder.armas;

import desafio1.models.Arma;
import desafio1.models.ArmaLaser;

public class LaserBuilder implements ArmaBuilder{

    private ArmaLaser arma;

    public LaserBuilder(ArmaLaser arma) {
        this.arma= arma;
    }

    public LaserBuilder( ) {
        this.arma = new ArmaLaser();
    }

    public ArmaBuilder starter(){
        setIntensidadeEnergia(1000)
            .setNome("Arma laser")
            .setAlcance(2500)
            .setTipo("Longo Alcance")
            .setPoderDestruicao(4000);
        return  this;
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

    public ArmaBuilder setIntensidadeEnergia(int intencidade){
        this.arma.setIntensidadeEnergia(intencidade);
        return this;
    }

    @Override
    public Arma build() {
        return arma;
    }
}
