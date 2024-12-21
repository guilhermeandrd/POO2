package br.ufc.quixada.poo.game.pokemon;

public class Mapa {
    private Treinador treinador;
    private Treinador x;
    private Treinador y;
    int x2 = treinador.x; //faltar uma aula realmente faz diferenca
                        //em resumo, acessar o atributo privado de outra classe
    int y2 = treinador.y;
    public Mapa(Treinador x, Treinador y){

    }

    boolean posicaoValida(int x, int y){
        return true;
    }

    public Treinador getTreinador() {
        return treinador;
    }
}
