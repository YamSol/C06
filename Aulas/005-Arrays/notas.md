# Notas


## For-each
Loop por todos os elementos de um array, em que cada item (primitivo ou objeto) é retornado por um parâmetro do tipo do array.

### Exemplo For-each
``` java
double winVersoes = {7,8,8.1,10};

for (double versao: winVersoes) {
	sout("Versao: ");
}
```


## Multiplicidade
Na relação entre diferentes objetos, um objeto pode possuir <> unidades do outro objeto.

### Tipos de multiplicidade
- 0..1
- 1..1
- 0..*
- *
- 1..*
- 3..5
