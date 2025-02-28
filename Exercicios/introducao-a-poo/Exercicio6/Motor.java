public class Motor {
    String cilindradas;
    float velocidadeMaxima;
    
    public Motor(String cilindradas, float velocidadeMaxima) {
	this.cilindradas = cilindradas;
	this.velocidadeMaxima = velocidadeMaxima;
    }

    public void print() {
	System.out.println("---- Motor ----");
	System.out.println("Cilindradas: "      + cilindradas);
	System.out.println("VelocidadeMaxima: " + velocidadeMaxima);
	System.out.println("---------------");
    }

    public void mostrarInfo() {
	this.print();
    }
    
}
	
