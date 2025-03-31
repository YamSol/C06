public class Main {
    public static void main(String args[]) {
	Cantina c = new Cantina("Cantina do Inatel");

	c.addSalgado(new Salgado("Esfirra"));
	c.addSalgado(new Salgado("Pizza"));
	c.addSalgado(new Salgado("Hamburger"));

	c.mostrarInfo();
    }
}
	
