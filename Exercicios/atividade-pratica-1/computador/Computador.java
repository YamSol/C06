package computador;

public class Computador {
    public static final int MAXSIZE_HARDWARE_BASICO = 3;
    public String marca;
    public float preco;

    // Associacoes
    public SistemaOperacional sistemaOperacional;
    public HardwareBasico[] hardwareBasico;
    MemoriaUSB memoriaUSB;

    public Computador(float preco, String marca) {
        this.preco = preco;
        this.marca = marca;

        sistemaOperacional = new SistemaOperacional();
        hardwareBasico = new HardwareBasico[MAXSIZE_HARDWARE_BASICO];
    }

    public void mostrarPCConfigs() {
        System.out.printf("+ Marca: %s\n", marca);
        System.out.printf("+ Preço: %.2f\n", preco);
        if(sistemaOperacional != null && sistemaOperacional.nome != null) {
            System.out.printf("+ Sistema Operacional: %s\n", sistemaOperacional.nome);
            System.out.printf("  - Tipo: %s\n", sistemaOperacional.tipo);
        }
        for (HardwareBasico hardwareBasico : hardwareBasico) {
            if(hardwareBasico != null && hardwareBasico.nome != null) {
                System.out.printf("+ Hardware Basico: %s\n", hardwareBasico.nome);
                System.out.printf("  - Capacidade: %s\n", hardwareBasico.capacidade);
            }
        }
        if(memoriaUSB != null && memoriaUSB.nome != null) {
            System.out.printf("+ Memoria USB: %s\n", memoriaUSB.nome);
            System.out.printf("  - capacidade: %s\n", memoriaUSB.capacidade);
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

}
