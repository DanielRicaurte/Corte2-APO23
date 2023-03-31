package PuntoTres;

import java.util.Scanner;

public class Suma {

	public void operación() {
		int a = 0, b = 0, res;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Vamos a sumar dos numeros");
			System.out.print("\nDigite el primer numero: ");
			a = entrada.nextInt();
			System.out.print("Digite el segundo numero: ");
			b = entrada.nextInt();
		} catch (Exception e) {
			System.out.print("ERROR: No dijito un numero entero");
		}
		res= a+b;
		System.out.print("\nLa respuesta de la suma es: " + res);
	}
	
}
