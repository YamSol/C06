package exercicios.exercicio3;


public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando carrinho de compras: "+nome);
    }

    public void calculaValorTotalCompra() {
        System.out.println("Calculando valor total de compras: "+nome);
    }

    public void mostrarInfo() {
        System.out.println("-- Mostrando INFO");
        System.out.println("Nome: "+nome);
        System.out.println("preço: "+preco);
        System.out.println("Sabor: "+sabor);
    }
}
