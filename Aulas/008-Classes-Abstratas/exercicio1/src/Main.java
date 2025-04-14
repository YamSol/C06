public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Bob", 80);
        Lontra l = new Lontra("David", 30);
        Boi b = new Boi("Geraldo", 150);

        c.mostrarInfo();
        c.emitirSom();

        b.mostrarInfo();
        b.emitirSom();

        l.mostrarInfo();
        l.emitirSom();
    }
}