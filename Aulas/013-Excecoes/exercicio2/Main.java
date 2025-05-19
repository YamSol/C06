package exercicio2;

import exercicio2.conta.ClienteNuloException;
import exercicio2.conta.Conta;
import exercicio2.conta.LimiteInsuficienteException;
import exercicio2.conta.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(1000, 5000);

        try {
            c.addCliente(new Cliente("Cliente 1"));
            c.addCliente(new Cliente("Cliente 2"));
//            c.addCliente(null);
        } catch (ClienteNuloException e) {
            throw new RuntimeException(e);
        }

        c.mostrarInfo();

        try {
            c.sacar(10000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        } catch (LimiteInsuficienteException e) {
            System.out.println(e);
        }
        System.out.println("Fim do programa");
    }
}
