package mamiferos;

import interfaces.Terrestre;
import interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico, Terrestre {
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

    @Override
    public void andar() {
        System.out.println("Andando...");
    }
}
