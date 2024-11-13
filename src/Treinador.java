public class Treinador {
    String nome;
    int x;
    int y;
    Pokemon[] pokemons;


    Treinador(String nome) {
        this.nome = nome;
        this.x = 0;
        this.y = 0;
        this.pokemons = new Pokemon[3];
    }
    void mover(String direcao){

        if(direcao.equals("cima")){
            y+=1;
        }else if(direcao.equals("baixo")){
            y-=1;
        }else if(direcao.equals("esquerda")){
            x-=1;
        }else if(direcao.equals("direita")){
            x+=1;
        }else{
            System.out.println("Direção inválida");
        }

    }

    void listar() {
        for (Pokemon pokemon : pokemons) {
            if (pokemon != null) {
                System.out.println(pokemon.nome);
            }
        }
    }

    boolean capturar(Pokemon pokemon) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i]== null) {
                pokemons[i] = pokemon;
                return true;
            }

        }
        return false;
    }


}

