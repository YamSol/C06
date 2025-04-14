package exercicios.exercicio2;

public class Main {
    public static void main(String[] args) {
        BrownieNutella bn = new BrownieNutella("Brownie Nutella", 21.0F, "Nutella");
        BrownieCafe bc = new BrownieCafe("Brownie Cafe", 21.0F, "Cafe");
        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("Brownie Doce de Leite", 21.0F, "Doce De Leite");

        bn.addCarrinhoDeCompras();
        bc.addCarrinhoDeCompras();
        bd.addCarrinhoDeCompras();
    }
}
