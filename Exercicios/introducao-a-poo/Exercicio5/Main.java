class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    public Arma(String nome, int poder, int resistencia, String descricao) {
	this.nome = nome;
	this.poder = poder;
	this.resistencia = resistencia;
	this.descricao = descricao;
    }

    public void print() {
	System.out.println("---- (Arma) ----");
		System.out.println("Nome:"		+this.nome);
		System.out.println("Poder: "		+this.poder);
		System.out.println("Resistencia: "	+this.resistencia);
		System.out.println("Descricao: "	+this.descricao);
	System.out.println("=---------------=");
    }

    public void mostrarInfoArma() {
	this.print();
    }
        
}

class Personagem {
    String nome;
    int pontos;
    Arma arma; // agregacao
    
    
    public Personagem(String nome, int pontos) {
	this.nome = nome;
	this.pontos = pontos;
    }

    public void usarArma() {
	int desgasteResistencia = 2;
	arma.resistencia -= 2;
	System.out.println("A arma "+arma.nome+" desgastou em "+desgasteResistencia+" pontos.");
    }
	
    public void tomarDano() {
	int danoSofrido = 5;
	this.pontos -= danoSofrido;
	System.out.println("Personagem "+this.nome+" tomou "+danoSofrido+" de dano");
    }

    public void print() {
	System.out.println("---- (Personagem) ----");
	System.out.println("Nome: "+this.nome);
	System.out.println("Pontos: "+this.pontos);
	System.out.println("=--------------------=");
    }
    
}

public class Main {
    public static void main(String args[]) {
	Personagem p1 = new Personagem("Lucca", 50);

	Arma a1 = new Arma("arma1", 100, 20, "Uma arma simples");

	p1.arma = a1;
	p1.usarArma();
	p1.tomarDano();
	
	a1.mostrarInfoArma();
	p1.print();
    }

}
    
	
