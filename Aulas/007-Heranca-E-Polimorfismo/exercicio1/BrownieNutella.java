package exercicio1;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella() {
        System.out.println("Adicionando Nutella à "+this.nome);
    }
}
