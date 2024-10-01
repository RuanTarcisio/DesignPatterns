package desafio1.models;

public class ArmaLaser extends Arma {
    private int intensidadeEnergia;

    public ArmaLaser(int intensidadeEnergia) {
        this.intensidadeEnergia = intensidadeEnergia;
    }

    public ArmaLaser( ) {

    }

    public ArmaLaser(String nome, String tipo, int poderDestruicao, int alcance, int intensidadeEnergia) {
        super("Laser", tipo, poderDestruicao, alcance);
        this.intensidadeEnergia = intensidadeEnergia;
    }

    public void setIntensidadeEnergia(int intensidadeEnergia) {
        this.intensidadeEnergia = intensidadeEnergia;
    }

    @Override
    public void ativar() {
        System.out.println("Ativando o Laser com intensidade " + intensidadeEnergia + "!");
    }

    public int getIntensidadeEnergia() {
        return intensidadeEnergia;
    }

    @Override
    public String toString() {
        return super.toString() + ", intensidadeEnergia=" + intensidadeEnergia + '}';
    }
}