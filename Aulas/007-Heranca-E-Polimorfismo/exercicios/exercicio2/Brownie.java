package exercicios.exercicio2;

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
        System.out.println("---------");
        System.out.println("Adicionando carrinho de compras: "+this.nome);
    }

    public void calculaValorTotalCompra() {
        System.out.println("---------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Valor da compra: "+this.preco);
    }

    public void mostrarInfo() {
        System.out.println("---------");
        System.out.println("Nome: "  + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Sabor: " + this.sabor);
    }
    
}
