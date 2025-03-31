package console;

import java.io.IOException;

public class Console {
    public static void limpar() {
        System.out.println("\n".repeat(50));
    }

    public static void esperar() {
        System.out.println("Pressione ENTER para continuar..");
        try {
            //noinspection ResultOfMethodCallIgnored
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
