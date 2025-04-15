package mamiferos;

import interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("A Lontra emitiu um som");
    }
}
