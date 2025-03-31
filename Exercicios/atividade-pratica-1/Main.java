import cliente.Cliente;
import console.Console;
import computador.Computador;
import computador.HardwareBasico;
import computador.MemoriaUSB;

import java.util.Scanner;

public class Main {

    public static final int MAX_QUANTITY_PC = 3;
    public static final int MATRICULA = 385;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("cliente 1", "123456789012", MAX_QUANTITY_PC);

        Computador[] computadores = new Computador[MAX_QUANTITY_PC];
        inicializarComputadores(computadores);

        boolean exit = false;
        int codigo;
        while (!exit) {
            // Ler codigo
            for (int i = 0; i < MAX_QUANTITY_PC; i++) {
                System.out.printf("====Configuração PC(%d)====\n", i+1);
                computadores[i].mostrarPCConfigs();
            }
            System.out.print("Escolha uma das promoções disponíveis: ");
            codigo = sc.nextInt();

            // condicao de saida
            if (codigo == 0) {
                exit = true;
                continue;
            }


            // Atualizar vetor de compra
            codigo -= 1; // ajustar array index
            for (int i = 0; i < MAX_QUANTITY_PC; i++) {
                if (cliente.computadoresCompra[i] == null) {
                    cliente.computadoresCompra[i] = computadores[codigo];
                    break;
                }
            }
            Console.limpar();
            System.out.printf("\n\nComputador %d adicionado as compras.\n", codigo);
            Console.esperar();

        }

        // Resultado
        Console.limpar();
        System.out.println("Total da compra: " + cliente.calculaTotalCompra());

    }

    public static void inicializarComputadores(Computador[] computadores) {
        Computador c = new Computador(MATRICULA, "Apple");
        c.hardwareBasico[0] = new HardwareBasico("Pentium Core i3", 2200);
        c.hardwareBasico[1] = new HardwareBasico("Memória RAM", 8);
        c.hardwareBasico[2] = new HardwareBasico("HD", 500);
        c.sistemaOperacional.nome = "Linux Ubuntu";
        c.sistemaOperacional.tipo = 32;
        c.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));
        computadores[0] = c;

        c = new Computador(MATRICULA + 1234, "Samsung");
        c.hardwareBasico[0] = new HardwareBasico("Pentium Core i5", 3370);
        c.hardwareBasico[1] = new HardwareBasico("Memória RAM", 16);
        c.hardwareBasico[2] = new HardwareBasico("HD", 1000);
        c.sistemaOperacional.nome = "Windows 8";
        c.sistemaOperacional.tipo = 64;
        c.addMemoriaUSB(new MemoriaUSB("Pendrive", 32));
        computadores[1] = c;

        c = new Computador(MATRICULA + 5678, "Dell");
        c.hardwareBasico[0] = new HardwareBasico("Pentium Core i7", 4500);
        c.hardwareBasico[1] = new HardwareBasico("Memória RAM", 32);
        c.hardwareBasico[2] = new HardwareBasico("HD", 2000);
        c.sistemaOperacional.nome = "Windows 10";
        c.sistemaOperacional.tipo = 64;
        c.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
        computadores[2] = c;
    }

}
