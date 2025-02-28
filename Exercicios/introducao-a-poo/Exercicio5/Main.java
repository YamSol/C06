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
    
	
