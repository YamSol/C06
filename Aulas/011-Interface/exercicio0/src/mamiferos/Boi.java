package mamiferos;

public class Boi extends Mamifero {
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Boi emitiu um som");
    }

}
