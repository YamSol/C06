public class Posicao {
    int X = -1;
    int Y = -1;
    boolean isMina = false;
    boolean visitada false;
    
    public Posicao(int X, int Y) {
	this.X = X;
	this.Y = Y;
    }
    
    public Posicao(int X, int Y, boolean isMina, boolean visitada) {
	this.X = X;
	this.Y = Y;
	this.isMina = isMina;
	this.visitada = visitada;
    }
}
