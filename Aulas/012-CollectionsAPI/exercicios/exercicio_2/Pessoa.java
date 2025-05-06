package exercicios.exercicio_2;

public abstract class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa pessoa){
        //return this.idade - pessoa.idade;
        if(this.idade < pessoa.idade){
            return 1;
        }
        if(this.idade > pessoa.idade){
            return -1;
        }
        return 0;
    }
}
