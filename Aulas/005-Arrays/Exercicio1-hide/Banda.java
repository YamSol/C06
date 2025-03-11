public class Banda {
    String nome;
    String genero;

    // Associacao
    Empresario empresario;
    Membro membros[];
    Musica musicas[];

    public Banda(String nome, String genero) {
	this.nome = nome;
	this.genero = genero;
    }

    public void mostrarInfo() {
	System.out.println("---- Banda: "+nome+" ----");
	System.out.println("\t- genero: "+genero);
	if(empresario != null) {
	    System.out.println("\t- Empresario: "+empresario.nome);
	    System.out.println("\t\t- cnpj: "+empresario.cnpj);
	}
	
	if(membros != null) {
	    System.out.println("\t- Membros:");
	    boolean empty = true;
	    for(Membro membro: membros) {
		if (membro != null) {
		    System.out.println("\t\t- "+membro.nome+" ("+membro.funcao+")");
		    empty = false;
		}
	    }
	    if(empty) {
		System.out.println("\t\t- .");
	    }
	}

	if(musicas != null) {
	    System.out.println("\t- Musicas:");
	    boolean empty = true;
	    for(Musica musica: musicas) {
		if (musica != null) {
		    System.out.println("\t\t- "+musica.nome+" ("+musica.duracao+"s)");
		    empty = false;
		}
	    }
	    if(empty) {
		System.out.println("\t\t- .");
	    }
	}
    }

    public void numeroMusicas(int n) {
	musicas = new Musica[n];
    }
    
    public void addMusicaNova(Musica musica) {
        for(int i = 0; i < musicas.length; i++) {
	    if(musicas[i] == null) {
		musicas[i] = musica;
		break;
	    }
	}
    }

    public void numeroMembros(int n) {
	membros = new Membro[n];
    }

    public void addMembroNovo(Membro membro) {
	for(int i = 0; i < membros.length; i++) {
	    if(membros[i] == null) {
		membros[i] = membro;
		break;
	    }
	}
    }

}
