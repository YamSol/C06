class Conta {
    int id;
    String nomeDono;
    float saldo;
    float limite;

    public Conta(String nomeDono, float saldo, float limite) {
	this.saldo = saldo;
	this.limite = limite;
	this.nomeDono = nomeDono;
    }

    public void sacar(float quantidade, String nomeDono) {
	if (nomeDono != this.nomeDono) return;
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
	    System.out.println(e);
	}
    }
}

class Main {
    public static void main(String[] args) {
	Conta c1 = new Conta("Yam", 99.0F, 100.0F);
	Conta c2 = new Conta("Y2", 1000, 5000);

	c1.sacar(50, "Yam");
	c2.transferir(200, c1);
    }
}

	
	
	
