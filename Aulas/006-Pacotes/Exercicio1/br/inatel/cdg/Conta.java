package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente clientes[];
    
    public Conta(int NumeroClientes) {
	clientes = new Cliente[NumeroClientes];
    }

    public void sacar(float quantia) {
	if (saldo + limite > quantia) {
	    this.saldo -= quantia;
	    System.out.println("Saque: R$ "+quantia);
	}
    }

    public deposita(float quantia) {
	this.depositar(quantia);
    }
	 
    public depositar(float quantia) {
	this.saldo += quantia;
    }

    // GETTERS E SETTERS

    public void setClientes(Cliente clientes[]) {
	this.clientes = clientes;
    }
	    
    public Cliente[] getClientes() {
	return this.clientes;
    }
	
    public float getSaldo() {
	return this.saldo;
    }
    
    public void setLimite(float limite) {
	this.limite = limite;
    }
    
    public float getLimite() {
	return this.limite;
    }

    public void setNumero(int numero) {
	this.numero = numero;
    }

    public int getNumero() {
	return this.numero;
    }
    
}
