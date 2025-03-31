package br.inatel.cdg;

public class Cliente {
    private String nome;
    private long cpf;

    // GETTERS e SETTERS
    
    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getNome() {
	return this.nome;
    }

    public void setCpf(long cpf) {
	this.cpf = cpf;
    }

    public long getCpf() {
	return this.cpf;
    }

}
