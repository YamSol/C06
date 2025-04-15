import mamiferos.Boi;
import mamiferos.Cachorro;
import mamiferos.Lontra;

public class Main {
    public static void main(String[] args) {
        Boi boi = new Boi("NOME_BOI", 150.0);
        Cachorro cachorro = new Cachorro("NOME_CACHORRO", 150.0);
        Lontra lontra = new Lontra("NOME_LONTRA", 150.0);

        boi.mostratInfo();
        boi.emitirSom();

        cachorro.mostratInfo();
        cachorro.emitirSom();

        lontra.mostratInfo();
        lontra.emitirSom();
        lontra.nadar();
    }
}
