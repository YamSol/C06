package exercicios.exercicio3;

public class Main {

    public static void main(String[] args) {
        Comprador cp = new Comprador("Joao", 1500);

        BrownieCafe bc = new BrownieCafe("Brownie Cafe", 16, "Cafe");
        cp.efetuarCompra(bc);

    }

}
