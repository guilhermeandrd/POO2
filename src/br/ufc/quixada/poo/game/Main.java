package br.ufc.quixada.poo.game;

import br.ufc.quixada.poo.game.pokemon.Pokemon;
import br.ufc.quixada.poo.game.pokemon.Treinador;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu");
        Pokemon crab = new Pokemon("Crab");
        Pokemon nidoran = new Pokemon("Nidoran");
        Pokemon evee = new Pokemon("Evee");
        Pokemon blastoise = new Pokemon("Blastoise");
        Pokemon ratata = new Pokemon("ratata");
        Treinador misty = new Treinador("Misty");

        misty.capturar(pikachu);
        misty.capturar(crab);
        misty.capturar(nidoran);
        misty.capturar(evee);
        misty.capturar(blastoise);
        misty.capturar(ratata);

        misty.listarPokemons();
        //o metodo de capturar pokemons tem um problema, porque é possível mexer na posição dos vetores e substituir um dos pokemons
        //de forma forçada, onde seria colocado o novo pokemon no local de outro

        //misty.pokemons[2] = Onix;
        //isso vai ser solucionado com o encapsulamento: que permite restringir o acesso a objetos internos

        /*int pocao = 100;
        System.out.println(pikachu);
        System.out.println(crab);
        System.out.println(pikachu.taVivo());
        pikachu.curar(pocao);
        System.out.println(pikachu.taVivo());
        pikachu.atacar(1, pikachu);*/
    }
}