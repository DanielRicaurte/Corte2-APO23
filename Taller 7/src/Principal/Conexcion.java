package Principal;

import PuntoCuatro.Resta;
import PuntoTres.Suma;

public class Conexcion {

	public static void main(String[] args) {
		//puntoTres();
		puntoCuatro();
	}
	
	public static void puntoTres() {
		Suma sm = new Suma();
		sm.operación();
	}
	public static void puntoCuatro() {
		Resta rs = new Resta();
		//rs.puntoA();//Error de Sintaxis.
		rs.puntoB();
		rs.puntoC();
	}
	
}
