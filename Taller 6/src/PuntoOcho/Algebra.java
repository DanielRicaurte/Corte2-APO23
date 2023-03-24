package PuntoOcho;

import java.util.Scanner;

public class Algebra {

	int[][] matrizA = new int[2][2];
	int[][] matrizB = new int[2][2];
	int[][] matrizFor = new int[2][2];

	public void menu() {
		int x = 0;
		String opcion;
		try (Scanner opc = new Scanner(System.in)) {
			System.out.print("Bienvenido, aqui podras resolver tus problemas de algreba. \n");
			for (x = 0; x >= 0; x++) {
				System.out.print("\nMenu: \n");
				System.out.print("A. Enter Arreglo A \n");
				System.out.print("B. Enter Arreglo B \n");
				System.out.print("C. Display A + B \n");
				System.out.print("D. Display A - B \n");
				System.out.print("E. Display A * B \n");
				System.out.print("F. Exit \n");
				System.out.print("Escoge una Opción: ");
				opcion = opc.nextLine();
				System.out.print("\n");
				switch (opcion) {
				case "A":
				case "a":
					arregloA();
					break;
				case "B":
				case "b":
					arregloB();
					break;
				case "C":
				case "c":
					suma();
					break;
				case "D":
				case "d":
					resta();
					break;
				case "E":
				case "e":
					multiplicacion();
					break;
				case "F":
				case "f":
					System.exit(-1);
					break;
				default:
					System.out.print("ERROR: Opción Incorrecta \n");
					break;
				}
			}
		}
	}

	public void arregloA() {
		int x, y;
		Scanner num = new Scanner(System.in);
		System.out.print("Arreglo A: \n");
		System.out.print("Digite el primer numerador: ");
		matrizA[0][0] = num.nextInt();
		System.out.print("Digite el primer denomidor: ");
		matrizA[1][0] = num.nextInt();
		System.out.print("Digite el segundo numerador: ");
		matrizA[0][1] = num.nextInt();
		System.out.print("Digite el segundo denomidor: ");
		matrizA[1][1] = num.nextInt();
		System.out.print("\nValores de la Matriz A: ");
		for (x = 0; x < 2; x++) {
			System.out.print("\n");
			for (y = 0; y < 2; y++) {
				System.out.print(matrizA[x][y] + "   ");
			}
		}
	}

	public void arregloB() {
		int x, y;
		Scanner num = new Scanner(System.in);
		System.out.print("Arreglo B: \n");
		System.out.print("Digite el primer numerador: ");
		matrizB[0][0] = num.nextInt();
		System.out.print("Digite el primer denomidor: ");
		matrizB[1][0] = num.nextInt();
		System.out.print("Digite el segundo numerador: ");
		matrizB[0][1] = num.nextInt();
		System.out.print("Digite el segundo denomidor: ");
		matrizB[1][1] = num.nextInt();
		System.out.print("\nValores de la Matriz B: ");
		for (x = 0; x < 2; x++) {
			System.out.print("\n");
			for (y = 0; y < 2; y++) {
				System.out.print(matrizB[x][y] + "   ");
			}
		}
	}

	public void suma() {
		int x, y;
		System.out.print("Suma de Arreglos: \n");

		mostrarArreglos();
		
		for (x = 0; x < 2; x++) {
			for (y = 0; y < 2; y++) {
				matrizFor[x][y] = matrizA[x][y] + matrizB[x][y];
			}
		}
		System.out.print("\n  Suma de Matriz A y B: ");
		for (x = 0; x < 2; x++) {
			System.out.print("\n");
			for (y = 0; y < 2; y++) {
				System.out.print("   " + matrizFor[x][y] + "   ");
			}
		}
	}
	public void resta() {
		int x, y;
		System.out.print("Resta de Arreglos: \n");

		mostrarArreglos();
		
		for (x = 0; x < 2; x++) {
			for (y = 0; y < 2; y++) {
				matrizFor[x][y] = matrizA[x][y] - matrizB[x][y];
			}
		}
		
		System.out.print("\n  Resta de Matriz A y B: ");
		for (x = 0; x < 2; x++) {
			System.out.print("\n");
			for (y = 0; y < 2; y++) {
				System.out.print("   " + matrizFor[x][y] + "   ");
			}
		}
	}
	
	public void multiplicacion() {
		int x, y;
		System.out.print("Multiplicación de Arreglos: \n");
		
		mostrarArreglos();
		
		matrizFor[0][0] = (matrizA[0][0] * matrizB[0][0]) + (matrizA[0][1] * matrizB[1][0]);
		matrizFor[0][1] = (matrizA[0][0] * matrizB[0][1]) + (matrizA[0][1] * matrizB[1][1]);
		matrizFor[1][0] = (matrizA[1][0] * matrizB[0][0]) + (matrizA[1][1] * matrizB[1][0]);
		matrizFor[1][1] = (matrizA[1][0] * matrizB[0][1]) + (matrizA[1][1] * matrizB[1][1]);
		
		System.out.print("\n  Multiplicación de Matriz A y B: ");
		for (x = 0; x < 2; x++) {
			System.out.print("\n");
			for (y = 0; y < 2; y++) {
				System.out.print("   " + matrizFor[x][y] + "   ");
			}
		}
	}
	
	public void mostrarArreglos() {
		int x, y;
		
		System.out.print("\n  Matriz A: ");
		for (x = 0; x < 2; x++) {
			System.out.print("\n");
			for (y = 0; y < 2; y++) {
				System.out.print("   " + matrizA[x][y] + "   ");
			}
		}
		
		System.out.print("\n  Matriz B: ");
		for (x = 0; x < 2; x++) {
			System.out.print("\n");
			for (y = 0; y < 2; y++) {
				System.out.print("   " + matrizB[x][y] + "   ");
			}
		}
	}
}
