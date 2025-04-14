# Classes Abstratas

A instanciação de uma Superclasse, muitas vezes não fará sentido. Para esses casos, 

**Classes Abstratas** foram criadas.

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