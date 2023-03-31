package PuntoNueve;

import java.util.Scanner;

public class Hand {
	Card[] cardArray = new Card[52];
	Card[][] hand = new Card[5][5];
	int[] sumaHand = new int[6];
	int[] cartas = new int[5];

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
		int y, z, i;
		Card carta;
		int puntos = 0;
		for (y = 0; y < 2; y++) {
			for (z = 0; z < 5; z++) {
				int x = (int) (Math.random() * (24 + 1));
				puntos = 0;
				carta = cardArray[x];
				hand[z][y] = carta;
				puntos = carta.points;
				sumaHand[z] += puntos;
				cartas[z] += 1;
				if (sumaHand[z] > 21) {
					puntos = 0;
					boolean aceFound = false;
					for (i = 0; i < 5; i++) {
						if (!aceFound) {
							String a = "Ace";
							if (a.equals(carta.name) && carta.points == 11) {
								carta.points = 1;
								aceFound = true;
								hand[z][y] = carta;
								puntos = carta.points;
								sumaHand[z] += puntos - 10;
							}
						}
					}
				}
			}
		}
		System.out.print("¡Bienvenido a BlackJack! \n");
		System.out.print("Para ganar tienes que llegar a 21 puntos o estar lo más cerca posible.\n");
		System.out.print("Si te pasas o sacas menos puntos que el Cupier pierdes.\n");
		System.out.print("\n¡Que comience el Juego! \n");
		System.out.print("La ronda inicia con:  \n");
		for (z = 0; z < 5; z++) {
			System.out.print("\nMano " + (z + 1) + ":");
			for (y = 0; y < 2; y++) {
				System.out.print("\n   Carta " + (y + 1) + ": " + hand[z][y]);
			}
			System.out.print("\n   Puntos: " + sumaHand[z]);
		}
	}

	public void juego() {
		int b, y, z, i;
		Card carta;
		int puntos = 0;
		int opcion;
		boolean salir1 = true, salir2 = true;
		Scanner entrada = new Scanner(System.in);

		while (salir2 == true) {
			// for (y = 2; y >= 0; y++) {
			salir1 = true;
			// System.out.print("\n\nRONDA " + (y - 1) + ":");
			while (salir1 == true) {
				for (z = 0; z < 5; z++) {
					while (salir1 == true) {
						if (cartas[z] < 5) {
							for (y = 2; y < 5; y++) {
								System.out.print("\n\nMano " + (z + 1) + ":");
								for (b = 0; b < cartas[z]; b++) {
									System.out.print("\n   Carta " + (b + 1) + ": " + hand[z][b]);
								}
								System.out.print("\n   Puntos: " + sumaHand[z]);
								System.out.print("\n ¿Desea otra carta?");
								System.out.print("\n Si (1) // No (2)");
								opcion = entrada.nextInt();
								switch (opcion) {
								case 1:
									int x = (int) (Math.random() * (24 + 1));
									puntos = 0;
									carta = cardArray[x];
									hand[z][y] = carta;
									puntos = carta.points;
									sumaHand[z] += puntos;
									cartas[z] += 1;
									if (sumaHand[z] > 21) {
										puntos = 0;
										boolean aceFound = false;
										for (i = 0; i < 5; i++) {
											if (!aceFound) {
												String a1 = "Ace";
												if (a1.equals(carta.name) && carta.points == 11) {
													carta.points = 1;
													aceFound = true;
													hand[z][y] = carta;
													puntos = carta.points;
													sumaHand[z] += puntos - 10;
												}
											}
										}
									}
									System.out.print(" Su nueva carta es: " + hand[z][y]);
									System.out.print("\n Puntos actuales: " + sumaHand[z]);
									System.out.print("\n Cartas: " + cartas[z]);
									salir1 = false;
									if (cartas[z] == 5) {
										System.out.print("\n\nAlcanzaste el limite de cartas: " + cartas[z]);
										System.out.print("\nMano " + (z + 1) + ":");
										for (b = 0; b < cartas[z]; b++) {
											System.out.print("\n   Carta " + (b + 1) + ": " + hand[z][b]);
										}
										System.out.print("\n   Puntos Totales: " + sumaHand[z]);
										z++;
										y=1;
									} else if (sumaHand[z] == 21) {
										System.out.print("\n\n ¡Fecitaciones! Llegastes a los 21 puntos... ");
										z++;
										y=1;
									} else if (sumaHand[z] > 21) {
										System.out.print("\n\n Lo sentinos superaste el numero de puntos: 21");
										for (b = 0; b < cartas[z]; b++) {
											System.out.print("\n   Carta " + (b + 1) + ": " + hand[z][b]);
										}
										System.out.print("\n   Puntos Totales: " + sumaHand[z]);
										System.out.print("\n Ya no puedes seguir jugando.");
										z++;
										y=1;
									}
									break;
								case 2:
									System.out.print(" Ok, no hay peoblema.");
									System.out.print("\n Puntos actuales: " + sumaHand[z]);
									salir1 = false;
									System.out.print("\n\nNo puedes ser jugando.");
									System.out.print("\n\nMano " + (z + 1) + ":");
									for (b = 0; b < cartas[z]; b++) {
										System.out.print("\n   Carta " + (b + 1) + ": " + hand[z][b]);
									}
									System.out.print("\n   Puntos Totales: " + sumaHand[z]);
									cartas[z] = 5;
									z++;
									y=1;
									break;
								default:
									System.out.print("ERROR: La Opción no existe");
									salir1 = true;
									break;
								}
							}
						} 
					}
					salir1 = true;
				}
				salir1 = false;
			}
			// }
		}
	}
}
