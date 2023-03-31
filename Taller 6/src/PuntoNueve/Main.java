package PuntoNueve;

public class Main {
	public static void main(String args[]) {
		//blackJack();
		muestra();
	}
	
	public static void blackJack() {
		Deck d = new Deck();
		d.print();
	}
	
	public static void muestra() {
		Hand h = new Hand();
		h.mano();
		h.juego();
	}
}
