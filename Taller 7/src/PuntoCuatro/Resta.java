package PuntoCuatro;

import java.util.Scanner;

public class Resta {

	public void puntoA() {
		int a = 0, b = 0, res;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("\nDigite el primer numero: ");
			a = entrada.nextInt() //Error por falta de ";"
			System.out.print("Digite el segundo numero: ");
			b = entrada.nextInt();
		} catch (Exception e) {
			System.out.print("ERROR: No dijito un numero entero");
		}
		res = a-b;
		System.out.print("\nLa respuesta de la resta es: " + res);
	}
	
	public void puntoB() {
		int a = 0, b = 0, res;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("\n\nPUNTO B: Error de logica");
			System.out.print("\nEl Error de este punto es que suma los numeros enves de restarlos. \n\n");
			System.out.print("\nVamos a restar dos numeros");
			System.out.print("\nDigite el primer numero: ");
			a = entrada.nextInt();
			System.out.print("Digite el segundo numero: ");
			b = entrada.nextInt();
		} catch (Exception e) {
			System.out.print("ERROR: No dijito un numero entero");
		}
		res = a+b; //Error por poner un "+" enves de un "-"
		System.out.print("\nLa respuesta de la resta es: " + res);
	}
	
	public void puntoC() {
		int a = 0, b = 0, res;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("\n\nPUNTO C: Error de excepción");
			System.out.print("\nEl error de este punto es que si diguitas un numero que no sea entero, la ejecución del programa finaliza.\n\n");
			System.out.print("\nVamos a restar dos numeros");
			System.out.print("\nDigite el primer numero: ");
			a = entrada.nextInt();
			System.out.print("Digite el segundo numero: ");
			b = entrada.nextInt();
		res = a-b; 
		System.out.print("\nLa respuesta de la resta es: " + res);
		}
	}
}
