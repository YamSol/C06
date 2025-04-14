package exercicios.exercicio2;

public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe() {
        System.out.println("Adicionando café à "+this.nome);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando Brownie de Cafe ao Carrinho de Compras");
    }

}
