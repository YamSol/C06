package exercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
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

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

    public void sacar(float quantidade) {
	if (quantidade > this.limite) return;
	if (quantidade < this.saldo) return;
	this.saldo -= quantidade;
	System.out.println("Valor sacado: "+quantidade);
    }

    public void transferir(float quantidade, Conta c) {
	if (this.saldo < quantidade) return;
	try {
	    this.saldo -= quantidade;
	    c.saldo    += quantidade;
	} catch(Exception e) {
		throw new RuntimeException(e);
	}
    }
	public void mostrarInfo() {
		ArrayList<Exception> erros = new ArrayList<>();

		System.out.println("Saldo: "+this.saldo);
		System.out.println("Limite: "+this.limite);
		System.out.println("Clientes: ");
		for(Cliente cliente: clientes) {
			try {
				System.out.println(cliente.nome);
			}catch (NullPointerException e) {
				System.out.println("-");
				erros.add(e);
			}
		}

		if(!erros.isEmpty()) {
			System.out.println("Erros: ");
			for(Exception erro: erros) {
				System.out.println(erro);
			}
		}
	}
}
	
	
	
