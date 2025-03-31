public class Main {

    public static void main(String args[]) {
	Banda banda = new Banda("System of a Down", "heavy metal");

	banda.empresario = new Empresario("Rick Rubin", 24492886000104L);

	banda.numeroMembros(4);
	banda.addMembroNovo(new Membro("Serj Tankian", "vocalista"));
	banda.addMembroNovo(new Membro("Daron Malakian", "guitarra"));
	banda.addMembroNovo(new Membro("Shavo Odadjian", "baixo"));
	banda.addMembroNovo(new Membro("John Dolmayan", "bateria"));

	banda.numeroMusicas(5);
	banda.addMusicaNova(new Musica("Chop Suey!", 210));
	banda.addMusicaNova(new Musica("Toxicity", 218));
	banda.addMusicaNova(new Musica("Aerials", 235));
	banda.addMusicaNova(new Musica("B.Y.O.B.", 255));
	banda.addMusicaNova(new Musica("Lonely Day", 167));

	banda.mostrarInfo();
    }
}
