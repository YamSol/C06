public class Cantina {
    String nome;

    // Associacao
    Salgado salgados[] = new Salgado[3];


    // constructor
    public Cantina(String nome) {
	this.nome = nome;
    }

    public void addSalgado(Salgado novoSalgado) {
	for (int i = 0; i < salgados.length; i++) {
	    if (salgados[i] == null) {
		salgados[i] = novoSalgado;
		break;
	    }
	}
       }

    public void mostrarInfo() {
	System.out.println("---- Cantina: "+nome+" ----");
	System.out.println("Lista de Salgados:");
	
	for(Salgado salgado : salgados) {
	    System.out.println("- "+salgado.nome);
	}
    }

}
