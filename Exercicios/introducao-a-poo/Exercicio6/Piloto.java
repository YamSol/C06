public class Piloto {
    String nome;
    boolean vilao;

    public Piloto(String nome, boolean vilao) {
	this.nome = nome;
	this.vilao = vilao;
    }

    public void print() {
	System.out.println("---- Piloto ----");
	System.out.println("Nome: "+  nome);
	System.out.println("Vilao: "+ vilao);
	System.out.println("----------------");
    }

    public void soltarSuperPoder() {
	System.out.println("O piloto "+nome+" soltou seu super poder.");
    }
}
