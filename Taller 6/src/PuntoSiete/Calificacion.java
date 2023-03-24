package PuntoSiete;

import java.util.Scanner;

public class Calificacion {
	
	public void pruebas() {
		int est=0;
		int x;
		int y;
		double prom = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Bienvenido, si quiere saber el promedio de sus estudiantes. \n");
		System.out.print("Digite la cantidad de estudiantes en su salon: \n");
		est = entrada.nextInt();
		
		int[][] calificacion = new int[est][6];
		System.out.print("Ingresar Calificacines \n");
		for(x=0;x<est;x++) {
			System.out.print("\n Estudiante: " + (x+1) + "\n");
			for(y=0;y<5;y++) {
				System.out.print(" Digite la calificacion de la prueba " + (y+1) + ":\n");
				calificacion[x][y] = entrada.nextInt();
				calificacion[x][5] = calificacion[x][y]+calificacion[x][5];
			}
			calificacion[x][5] = calificacion[x][5]/5;
		}
		
		System.out.print("Calificaciones: \n");
		for(x=0;x<est;x++) {
			System.out.print("\n Estudiante: " + (x+1) + "\n");
			for(y=0;y<5;y++) {
				System.out.print(" Calificacion de la prueba " + (y+1) + ": " + calificacion[x][y] + "\n");
			}
			System.out.print(" Calificacion total: " + calificacion[x][5] + "\n");
		}
		
		for(x=0;x<est;x++) {
			prom = prom + calificacion[x][5];
		}
		prom = prom/est;
		System.out.print("El Promedio de los estudiantes es: " + prom);
	}
}
