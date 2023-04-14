package puntoSieteOcho;

public class Hand {

	static Card[] cardArray = new Card[52];
	static Card[] hand = new Card[5];
	static int sumaHand = 0;
	static int y, z, i;
	
	static int suits = 4;
	static int cardType = 13;
	static int cardCount = 0;
	
	Hand() {
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		for (int i = 1; i <= suits; i++) {
			for (int j = 1; j <= cardType; j++) {
				cardArray[cardCount] = new Card(i, j);
				cardCount++;
			}
		}
	}
	public static void main(String args[]) {
		mano();
		juego();
	}
	public static void juego() {

		mano();
		System.out.print("¡Bienvenido a BlackJack! \n");
		System.out.print("Para ganar tienes que llegar a 21 puntos o estar lo más cerca posible.\n");
		System.out.print("Si te pasas o sacas menos puntos que el Cupier pierdes.\n");
		System.out.print("\n¡Que comience el Juego! \n");
		System.out.print("La ronda inicia con:  \n");
			for (y = 0; y < 2; y++) {
				System.out.print("\n   Carta " + (y + 1) + ": " + hand[y]);
			}
			System.out.print("\n   Puntos: " + sumaHand);
		//System.out.println("Desea otra carta: Si(1) No(2): ");
		//int pregunta = sc.nextInt();
		//if (pregunta == 1) {

		
	}
	
public static void mano() {
	Card carta;
	int puntos = 0;
		for (z = 0; z < 2; z++) {
			int x = (int) (Math.random() * (24 + 1));
			puntos = 0;
			carta = cardArray[x];
			hand[z] = carta;
			puntos = carta.points;
			sumaHand += puntos;
			if (sumaHand > 21) {
				puntos = 0;
				boolean aceFound = false;
				for (i = 0; i < 5; i++) {
					if (!aceFound) {
						String a = "Ace";
						if (a.equals(carta.name) && carta.points == 11) {
							carta.points = 1;
							aceFound = true;
							hand[z] = carta;
							puntos = carta.points;
							sumaHand = sumaHand - 10;
						}
						carta.points = 11;
					}
				}

			}
		}
	}
	
}
