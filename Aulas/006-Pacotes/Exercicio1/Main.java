public class Main {
    public static void main(String args[]) {
	final int numClientes = 2;
	Conta conta = new Conta(numClientes);

	Clientes clientes = new Clientes[numClientes];
	
	clientes[0].setNome("Yam");
	clientes[0].setCpf(00000000001);
	clientes[1].setNome("Gustavo");
	clientes[1].setCpf(00000000002);

	conta.setClientes(clientes);
	conta.setLimite(2000);
	
	conta.depositar(600);
	conta.sacar(23.2);
	conta.sacar(50.0);
	conta.sacar(15.75);
	conta.sacar(100.0);
	conta.sacar(5.5);
	conta.sacar(30.0);
	
	System.out.println("Saldo: "+conta.getSaldo());
	
    }
}
