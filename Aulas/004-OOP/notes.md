# Association

A way classes can comunicate within.

## Aggregation
The idea of the parent or child class

Implies a relationship where the child can exist without the parent

### Exemple
``` java
Conta conta = new Conta();
Cliente cliente = new Cliente();

conta.titular = cliente;
```

## Composition

Implies a relationship where the child canot exist without the parent.

### Example

``` java
public class Empresa {
	String nome;
	Departamento dep;
	
	// constructor
	public Empresa() {
		dep = new Departamento();
	}
}		
```


# Constructor

Special method that doesnt have a return. 
It has the same name as the Class.
It's always called when an instance initialize.

## Example

``` java
public class Empresa {
	String nome;
	Departamento dep;
	
	// constructor
	public Empresa() {
		dep = new Departamento();
	}
}		
```
