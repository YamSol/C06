package exercicio1;

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

    }

    public void calculaValorTotalCompra() {

    }

    public void mostrarInfo() {
        System.out.println("===== "+nome);
        System.out.println("Preco: " + preco);
        System.out.println("Sabor: " + sabor);
    }
    
}
