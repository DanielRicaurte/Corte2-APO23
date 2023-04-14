package puntoUno;

public class Punto1 {
	int numSides;
	boolean regular;

	public Punto1(int numSides, boolean regular) {
		this.numSides = numSides;
		this.regular = regular;
	}

	public Punto1() {
		this.numSides = 1;
		this.regular = false;
	}

	public int getNumSides() {
		return this.numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public boolean isRegular() {
		return this.regular;
	}

	public void setRegular(boolean regular) {
		this.regular = regular;
	}

}
