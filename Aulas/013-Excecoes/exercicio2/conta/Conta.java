package exercicio2.conta;

import exercicio2.Cliente;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Conta {
    int id;
	Set<Cliente> clientes;
    float saldo;
    float limite;

	public Conta(float saldo, float limite) {
		this.saldo = saldo;
		this.limite = limite;
		clientes = new HashSet<>();
    }

	public void addCliente(Cliente cliente) throws ClienteN
		if (cliente == null) throw new ClienteNuloException();
		clientes.add(cliente);
	}

    public void sacar(float quantidade) throws SaldoInsuficienteException, LimiteInsuficienteException {
	if (quantidade > this.limite) throw new LimiteInsuficienteException();
	if (quantidade > this.saldo) throw new SaldoInsuficienteException();

	this.saldo -= quantidade;
	System.out.println("Valor sacado: "+quantidade);
    }

    public void transferir(float quantidade, Conta c) throws SaldoInsuficienteException {
	if (this.saldo < quantidade) throw new SaldoInsuficienteException();
	if (c == null) throw new NullPointerException();

	this.saldo -= quantidade;
	c.saldo    += quantidade;
    }
	public void mostrarInfo() {
		ArrayList<Exception> erros = new ArrayList<>();

		System.out.println("Saldo: "+this.saldo);
		System.out.println("Limite: "+this.limite);
		System.out.println("Clientes: ");
		for(Cliente cliente: clientes) {
			try {
				System.out.println(cliente.getNome());
			}catch (NullPointerException e) {
				erros.add(e);
			}
		}

		if(!erros.isEmpty()) {
			System.out.println("\n--------------------");
			System.out.println("Erros: ");
			for(Exception erro: erros) {
				System.out.println(erro);
			}
		}
	}
}
	
	
	
