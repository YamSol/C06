package exercicios.exercicio2;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella() {
        System.out.println("Adicionando Nutella à "+this.nome);
    }


    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando Brownie de Nutella ao Carrinho de Compras");
    }

}
