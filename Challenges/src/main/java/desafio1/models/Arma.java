package desafio1.models;
public abstract class Arma {
    protected String nome;
    protected String tipo;
    protected int poderDestruicao;
    protected int alcance;


    public Arma() {
    }

    public Arma(String nome, String tipo, int poderDestruicao, int alcance) {
        this.nome = nome;
        this.tipo = tipo;
        this.poderDestruicao = poderDestruicao;
        this.alcance = alcance;
    }

    public abstract void ativar();

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPoderDestruicao() {
        return poderDestruicao;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPoderDestruicao(int poderDestruicao) {
        this.poderDestruicao = poderDestruicao;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poderDestruicao=" + poderDestruicao +
                ", alcance=" + alcance +
                '}';
    }
}