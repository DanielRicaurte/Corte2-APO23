package puntoCuatroCincoSeis;

import java.util.Scanner;

public class Estudiante {
	    String nombre;
	    int creditos;
	    double GPA, puntosCalidad;
	    static Scanner sn = new Scanner(System.in);
	    
	    public Estudiante(String nombre, int creditos, double puntosCalidad, double GPA) {
	        this.nombre = nombre;
	        this.creditos = creditos;
	        this.GPA = GPA;
	        this.puntosCalidad = puntosCalidad;
	    }
	    
	    public double getPromedioPonderado() {
	        return puntosCalidad / creditos;
	    }
	    
	    public void agregarClase(int creditosClase, double puntosCalidadClase) {
	        this.creditos += creditosClase;
	        this.puntosCalidad += puntosCalidadClase;
	        this.GPA = puntosCalidad / creditos;
	    }
	    
	    public static void main(String[] args) {
	    	int cre, puntCal;
	    	System.out.println("\nINFORMACION NORMAL: ");
	        Estudiante estudiante1 = new Estudiante("Mary Jones", 14, 46, 0);
	        System.out.println("\nEstudiante1: ");
	        System.out.println("	Nombre: " + estudiante1.nombre);
	        System.out.println("	Creditos: " + estudiante1.creditos);
	        System.out.println("	Puntos de calidad: " + estudiante1.puntosCalidad);
	        System.out.println("	GPA: " + estudiante1.getPromedioPonderado());
	        
	        Estudiante estudiante2 = new Estudiante("John Stiner", 60, 137, 0);
	        System.out.println("\n\nEstudiante2: ");
	        System.out.println("	Nombre: " + estudiante2.nombre);
	        System.out.println("	Creditos: " + estudiante2.creditos);
	        System.out.println("	Puntos de calidad: " + estudiante2.puntosCalidad);
	        System.out.println("	GPA: " + estudiante2.getPromedioPonderado());
	        
	        Estudiante estudiante3 = new Estudiante("Ari Samala", 31, 69, 0);
	        System.out.println("\n\nEstudiante3: ");
	        System.out.println("	Nombre: " + estudiante3.nombre);
	        System.out.println("	Creditos: " + estudiante3.creditos);
	        System.out.println("	Puntos de calidad: " + estudiante3.puntosCalidad);
	        System.out.println("	GPA: " + estudiante3.getPromedioPonderado());
	        
	        System.out.println("\nAgrege los creditos de la nueva clase: ");
	        cre = sn.nextInt();
	        System.out.println("\nAgrege los puntos de calidad de la nueva clase: ");
	        puntCal = sn.nextInt();
	        estudiante1.agregarClase(cre, puntCal);
	        estudiante2.agregarClase(cre, puntCal);
	        estudiante3.agregarClase(cre, puntCal);

	        System.out.println("\nINFORMACION ACTUALIZADA: ");
	        System.out.println("\nEstudiante1: ");
	        System.out.println("	Nombre: " + estudiante1.nombre);
	        System.out.println("	Creditos: " + estudiante1.creditos);
	        System.out.println("	Puntos de calidad: " + estudiante1.puntosCalidad);
	        System.out.println("	GPA: " + estudiante1.getPromedioPonderado());
	        
	        System.out.println("\n\nEstudiante2: ");
	        System.out.println("	Nombre: " + estudiante2.nombre);
	        System.out.println("	Creditos: " + estudiante2.creditos);
	        System.out.println("	Puntos de calidad: " + estudiante2.puntosCalidad);
	        System.out.println("	GPA: " + estudiante2.getPromedioPonderado());
	        
	        System.out.println("\nINFORMACION: El estudiante 3 tiene una nueva clase");
	        System.out.println("Datos de la clase:");
	        System.out.println("-Creditos: 13");
	        System.out.println("-Puntos de Calidad: 52");
	        estudiante3.agregarClase(13, 52);
	        System.out.println("\nEstudiante3: ");
	        System.out.println("	Nombre: " + estudiante3.nombre);
	        System.out.println("	Creditos: " + estudiante3.creditos);
	        System.out.println("	Puntos de calidad: " + estudiante3.puntosCalidad);
	        System.out.println("	GPA: " + estudiante3.getPromedioPonderado());
	    }
}
