class Pessoa {
	private String nome;
        
	public void falar(String s) {
	    System.out.println("Ola, eu sou uma pessoa. "+s);
	}
    }

class Professor extends Pessoa {
	public void ministrarAula(String t) {
	    this.falar("Estou ministrando uma aula: "+t);
	}
    }


class Exercicio0 {    
    public static void main(String[] args) {

	Professor p = new Professor();

	p.ministrarAula("<conteudo ministrado>");
    }
}
	
	
