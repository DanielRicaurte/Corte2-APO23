package PuntoNueve;

public class Hand {
	Card[] cardArray = new Card[52];
	Card[][] hand = new Card[5][5];
	Card[][] sumaHand = new Card[5][1];
	
	
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
	
	public void mano() {
		int y,z;
		Card carta;
		String suma;
		//Card num;
		for(y=0;y<2;y++) {
			for(z=0;z<5;z++) {
				int x = (int) (Math.random() * (24 + 1));
				carta = cardArray[x];
				hand[z][y] = carta;
				//suma = carta.getName(z);
				//sumaHand[z][0] = suma;
			}
		}
		for(z=0;z<5;z++) {
			System.out.print("\nMano " + (z+1) + ":");
			for(y=0;y<2;y++) {
				System.out.print("\n   Carta " + (y+1) + ": " + hand[z][y]);
			}
		}
		
		
		
	}
}
