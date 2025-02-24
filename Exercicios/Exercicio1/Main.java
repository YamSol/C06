class Zombie {
    String nome;
    int vida;
    int dano;
    
    public Zombie(String nome, int vida, int dano) {
	this.nome = nome;
	this.vida = vida;
	this.dano = dano;
    }

    public void consumir() {
	System.out.println("Zombie " + nome + " está se alimentando");
    }

    public void print() {
	System.out.println("Nome: "+nome);
	System.out.println("Vida: "+vida);
	System.out.println("Dano: "+dano);
    }

    public void atacar(Zombie alvo) {
	alvo.vida -= this.dano;
	System.out.println("O Zombie "+this.nome+" causou "+this.dano+" de dano no Zombie "+alvo.nome);
    }
}

class Main {
    public static void main (String[] args) {
	Zombie z1 = new Zombie("Robson", 100, 40);
	Zombie z2 = new Zombie("Arrr", 250, 20);

	z1.print();
	z2.print();

	z1.atacar(z2);

	z1.print();
	z2.print();

	z1.consumir();
	z2.consumir();
    }
}
