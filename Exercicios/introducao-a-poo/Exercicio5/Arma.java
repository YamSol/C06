public class Arma {
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
