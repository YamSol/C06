package personagem;

public class Heroi extends Personagem implements Combater {
    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        personagem.desarmar();
        System.out.println("Herói " + nome + " usou seu Especial. " +
                personagem.nome + " perdeu todas as armas");
    }
}
