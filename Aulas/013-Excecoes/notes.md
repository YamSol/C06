# Exceptions

## Tipos

### Unchecked Exception

- Ocorre em tempo de `execução`
- Exemplos: NullPointerException

### Checked Exception

- Ocorre em tempo de `compilação`
- Exemplos: FileNotFoundException

## Tratamento

### Try/catch

```java

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) {
        try (FileInputStream f = new FileInputStream("config.txt")){
            pass;
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e);
        }
    }
}
```


### Throws

Utilizável em métodos. Obriga a utilização do tratamento `try-catch` aonde o código for chamado.

```java

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) {
        try (func_1()) {
            pass;
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e);
        }
    }

    public void func_1() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("config.txt");
    }
}

```

## Criando Exceptions específicas

É possível herdar de 2 super classes:
- `RuntimeException`: Cria uma **unchecked** exception
- `Exception`: Cria uma **checked** exception

```java
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
```