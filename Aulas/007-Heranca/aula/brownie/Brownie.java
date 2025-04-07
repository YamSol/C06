package aula.brownie;

public class Brownie {
    protected String nome;
    protected Float preco;
    protected String sabor;

    Brownie(String nome, Float preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;

    }

    public void carrinhoDeCompras() {
        System.out.println("O produto foi adicionado ao carrinho de compras: "+nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
