package desafio1.builder.armas;

import desafio1.models.Arma;

public interface ArmaBuilder {

    public ArmaBuilder starter();
    ArmaBuilder setNome(String nome);
    ArmaBuilder setPoderDestruicao(int potencia);
    ArmaBuilder setTipo(String tipo);
    ArmaBuilder setAlcance(int alcance);
    Arma build();
}
