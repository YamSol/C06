import computador.Computador;
import computador.HardwareBasico;
import computador.MemoriaUSB;
import computador.SistemaOperacional;

public class Main {

    public static final int MAX_QUANTITY_PC = 3;
    public static final int MATRICULA = 385;

    public static void main(String[] args) {
        Computador[] computadores = new Computador[MAX_QUANTITY_PC];
        inicializarComputadores(computadores);

        Cliente cliente = new Cliente("cliente 1", "123456789012");
        Computador[] ComputadoresCompra = new Computador[MAX_QUANTITY_PC];

    }

    public static void inicializarComputadores(Computador[] computadores) {
        Computador c1 = new Computador(MATRICULA, "Apple");
        c1.sistemaOperacional.nome = "Linux Ubuntu";
        c1.sistemaOperacional.tipo = 32;
        c1.hardwareBasico[0] = new HardwareBasico("Pentium Core i3", 2200);
        c1.hardwareBasico[1] = new HardwareBasico("Memória RAM", 8);
        c1.hardwareBasico[2] = new HardwareBasico("HD", 500);
        c1.addMemoriaUSB(new MemoriaUSB("Pendrive", 32));



        Computador c2 = new Computador(MATRICULA+1234, "Samsung");
        SistemaOperacional s2 = new SistemaOperacional("Windows 8", 64);

        Computador c3 = new Computador(MATRICULA+5678, "Dell");
        SistemaOperacional s3 = new SistemaOperacional("Windows 10", 64);

    }
}
