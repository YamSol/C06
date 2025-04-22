import personagem.Arma;
import personagem.Heroi;
import personagem.Vilao;

public class Main {
    public static void main(String[] args) {
        // Criação e associação das classes instâncias
        Heroi heroi = new Heroi("Valiant", 100);
        Vilao vilao = new Vilao("Shadow", 100);
        Arma[] armas = new Arma[] {
                new Arma("Espada", 15, 40),
                new Arma("Machado", 30, 20),
                new Arma("Arco", 30, 20)
        };
        heroi.addArma(armas[0]);
        vilao.addArma(armas[1]);
        vilao.addArma(armas[2]);

        mostrarEstado(heroi, vilao);
        heroi.atacar(0, vilao);
        vilao.atacar(0, heroi);

        mostrarEstado(heroi, vilao);
        heroi.usarEspecial(vilao);
        vilao.usarEspecial(heroi);

        mostrarEstado(heroi, vilao);
        heroi.atacar(1, vilao);
        vilao.atacar(1, heroi);
    }

    private static void mostrarEstado(Heroi heroi, Vilao vilao) {
        System.out.println("==== ESTADO ATUAL");
        System.out.println("-- Herói");
        heroi.mostrarArmas();
        System.out.println("-- Vilão");
        vilao.mostrarArmas();
    }
}
