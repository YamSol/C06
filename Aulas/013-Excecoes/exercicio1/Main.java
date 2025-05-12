package exercicio1;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(1000, 5000);
        c.addCliente(new Cliente("Cliente 1"));
        c.addCliente(new Cliente("Cliente 2"));
        c.addCliente(null);

        c.mostrarInfo();
        System.out.println("Fim do programa");
    }
}
