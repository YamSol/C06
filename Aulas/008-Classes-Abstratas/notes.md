# Classes Abstratas

**Classes abstratas** são utilizadas quando a instância de uma superclasse não faz sentido. Elas permitem definir uma estrutura comum para subclasses, que devem implementar os métodos e propriedades especificados, garantindo assim uma base consistente para a herança

Estas:
- são impossíveis de ser instanciadas,
- Será **necessariamente** uma Superclasse
- **Deve ser usada como referência**, permitindo o polimorfismo


## Métodos abstratos

Métodos abstratos devem, obrigatoriamente, ser sobrescritos.

Na Superclasse, deve-se definir apenas a assinatura do método:
```java
public class Brownie {
    abstract public void addCarrinhoDeCompras();
}

public class BrownieSub {
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionado");
    }
}
```

**OBS**: Métodos abstratos existem **apenas** em Abstratas