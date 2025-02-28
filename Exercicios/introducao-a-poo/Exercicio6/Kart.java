public class Kart {
    String nome;

    // Associacoes
    Piloto piloto; // agregacao
    Motor motor; // composicao
    
    public Kart(String nome, String motorCilindradas, float motorVelocidadeMaxima) {
	this.nome = nome;

	motor = new Motor(motorCilindradas, motorVelocidadeMaxima);
    }

    public void print() {
	System.out.println("---- Kart ----");
	System.out.println("Nome: "+ nome);
	System.out.println("--------------");
    }

    public void pular() {
	System.out.println("O kart "+nome+" pulou.");
    }

    public void soltarTurbo() {
	System.out.println("O kart "+nome+" soltou o turbo.");
    }
    
    public void fazerDrift() {
	System.out.println("O kart "+nome+" realizou um drift.");
    }

}
