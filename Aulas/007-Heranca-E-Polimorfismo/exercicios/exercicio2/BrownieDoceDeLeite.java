package exercicios.exercicio2;

public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando Doce de Leite à "+this.nome);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando Brownie de Doce de Leite ao Carrinho de Compras");
    }

}
