package personagem;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    public static final int GUN_MAX_CAPACITY = 10;
    private Arma[] armas = new Arma[GUN_MAX_CAPACITY];

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void addArma(Arma arma) {
        for (int i = 0; i < armas.length; i++) {
            if (armas[i] == null) {
                armas[i] = arma;
                return;
            }
        }
    }

    public void mostrarArmas() {
        System.out.println("---- Armas: ");
        for (Arma arma : armas) {

            if (arma != null) {
                System.out.println(arma);
            }
        }
    }
    protected void desarmar() {
        for (int i = 0; i < armas.length; i++) {
            if (armas[i] != null) {
                armas[i].setNome("");
                armas[i].setDano(0);
                armas[i].setDurabilidade(0);
                armas[i] = null;
            }
        }
    }

    private boolean armaExiste(Arma arma) {
        return arma != null;
    }

    private boolean armaTemDurabilidade(Arma arma) {
        return arma.getDurabilidade() > 0;
    }

    private boolean alvoPossuiVida(Personagem personagem) {
        return personagem.vida > 0;
    }

    public void atacar(int posicao, Personagem personagem) {
        if( !armaExiste(armas[posicao]) || !armaTemDurabilidade(armas[posicao]) ) {
            System.out.println("Não foi possível atacar "+personagem.nome);
            return;
        }

        if (!alvoPossuiVida(personagem)) {
            System.out.println("O personagem não possui vida. Ataque nao realizado.");
            return;
        }
        personagem.vida = Math.max(0, personagem.vida-armas[posicao].getDano());
        armas[posicao].setDurabilidade(0);

        System.out.println("Ataque realizado com sucesso.");
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
