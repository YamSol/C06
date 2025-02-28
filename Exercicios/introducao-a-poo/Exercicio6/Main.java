public class Main {
    public static void main(String args[]) {
        Kart k1 = new Kart("Speedster", "100", 150.5f);
        Kart k2 = new Kart("Thunder", "150", 200.0f);
	
        Piloto p1 = new Piloto("Racer", false);
        Piloto p2 = new Piloto("Shadow", true);

	k1.piloto = p1;
	k2.piloto = p2;

	k1.pular();
	k1.fazerDrift();
	k1.piloto.soltarSuperPoder();

	k2.soltarTurbo();
	k2.fazerDrift();
	k2.piloto.soltarSuperPoder();

	k1.motor.mostrarInfo();
	k2.motor.mostrarInfo();
	
    }
}  
