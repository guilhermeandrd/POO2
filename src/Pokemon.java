public class Pokemon{
    static int contador;
    String nome="Pikachu";
    String tipo;
    int nivel;
    int ataque;
    int defesa;
    int velocidade;
    int experiencia;
    int pontosDeVida;

    Pokemon(String nome){
        contador ++;
        this.nome=nome;
        this.nivel=1;
        this.ataque= (int) (Math.random()*100);
    }

    Pokemon(String nome, int nivel){
        this(nome);
        this.nivel=nivel;
    }

    Pokemon(String nome, int nivel, int pontosDeVida){
        this(nome,nivel);
        this.pontosDeVida=pontosDeVida;
    }

    String falar() {
        return nome + " " + nome;
    }

    int curar(int pontosDeVida){
        this.pontosDeVida += pontosDeVida;
        /*
        int ao inves de void*/
        return this.pontosDeVida; //ao inves de so this.*/
    }

    void atacar(int movimento, Pokemon alvo){
        if(taVivo()){
            //ataque!
            System.out.println("Atacando o alvo " + alvo + " com ataque " + movimento);
        }else {
            System.out.println("to morto:/");
        }
    }


    boolean taVivo(){
        return this.pontosDeVida > 0;
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", pontosDeVida= " + pontosDeVida +
                ", nivel=" + nivel +
                ", ataque=" + ataque +
                ", defesa=" + defesa +
                ", velocidade=" + velocidade +
                '}';
    }
}
