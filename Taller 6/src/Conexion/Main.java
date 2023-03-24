package Conexion;

import PuntoOcho.*;
import PuntoSiete.*;

public class Main {

	public static void main(String[] args) {
		//puntoSiete();
		puntoOcho();
	}
	
	public static void puntoSiete() {
		Calificacion cf = new Calificacion();
		cf.pruebas();
	}
	public static void puntoOcho() {
		Algebra ag = new Algebra();
		ag.menu();
	}
}
