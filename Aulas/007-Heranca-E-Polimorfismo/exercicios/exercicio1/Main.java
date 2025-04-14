package exercicios.exercicio1;

public class Main {
    public static void main(String[] args) {
        BrownieNutella bn = new BrownieNutella("Brownie Nutella", 20.0F, "Nutella");
        BrownieCafe bc = new BrownieCafe("Brownie Cafe", 20.0F, "Cafe");
        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("Brownie Doce de Leite", 20.0F, "Doce De Leite");

        bn.addCarrinhoDeCompras();
        bc.addCarrinhoDeCompras();
        bd.addCarrinhoDeCompras();
    }
}
