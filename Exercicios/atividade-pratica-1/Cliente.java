import computador.Computador;

public class Cliente {
    public String nome;
    public String cpf;
    
    public Cliente(String nome, String cpf) {
	this.nome = nome;
	this.cpf = cpf;
    }

    float calculaTotalCompra(Computador[] computadores) {
		float soma = 0;
		for (Computador comp : computadores) {
			soma += comp.preco;
		}
		return soma;
	}
}
