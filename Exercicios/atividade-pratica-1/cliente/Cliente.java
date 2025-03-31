package cliente;

import computador.Computador;

public class Cliente {
	public String nome;
    public String cpf;

	public Computador[] computadoresCompra;
    
    public Cliente(String nome, String cpf, int quantidadeComputadores) {
	this.nome = nome;
	this.cpf = cpf;

	this.computadoresCompra = new Computador[quantidadeComputadores];
    }

    public float calculaTotalCompra() {
		float soma = 0;
		for (Computador comp : computadoresCompra) {
			if (comp != null) {
			soma += comp.preco;
			}
		}
		return soma;
	}
}
