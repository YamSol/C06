class Personagem {
    String nome;
    int pontos;

    // relacionamento
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
 q   
}
