# Heranca

O principal objetivo da **Heranca** é permitir a reutilização de classes.

## Super classe
Nome dado à classe da qual outras classes herdam.

*\*obs: caso a super classe possua um construtor, todas as classes que a extendem também devem possuir Construtor.* 

## Sub classes
As subclasses são as classes que herdam da super classe

A partir da subclasse, é possível acessar os métodos e atributos da superclasse através da função `super()`.

# Polimorfismo

"Muitas Formas". Polimorfismo permite a existencia de um comportamento geral, que, quando aplicado em diferentes contextos (sub classes), permite conmportamentos individuais (específicos). 

## Primeira forma 
A sobrescrita de métodos é uma das formas pelas quais se pode realizar polimorfismo.

- Uma instancia de uma sub classe pode ser do tipo super classe:
    - `Brownie = new BrownieNutella`
    - Ainda nesse caso, caso o método também seja um método sobrescrito, ele:
      - Não poderá mais acessar os métodos especificos da sub classe
      - Manterá o método sobrescrito.

### Casting
Um tipo super classe pode ser convertido para um tipo sub classe:
```java
Brownie bn = new BrownieCafe();

// acessar metodo da sub classe BrownieCafe
if (bc instanceof BrownieCafe) {
    BrownieCafe brownieCafe = (BrownieCafe) bc;
    brownieCafe.adicionaMaisCafe();
    }
```

## Segunda forma
Outra forma de fazer polimorfismo (não excludente com a primeira) é através da utilização direta da super classe.

```java
public Comprador {
    public void comprarBrownies(Brownie brownie){
        System.out.println("Comprando um brownie: " + brownie.nome);
    }
}
```


