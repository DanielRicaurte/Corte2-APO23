package puntoTres;

public class Animal {
	    int weight, height;
	    double speed;

	    Animal() {
	        weight = 50;
	        height = 4;
	        speed = 2; 
	    }

	    Animal(int w, int h, int s) {
	        weight = w;
	        height = h;
	        speed = s;
	    }

	    public double getTime(double miles) { 
	        return miles / speed;
	    }

	    public int getWeight() {
	        return weight;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public double getSpeed() {
	        return speed;
	    }

	    public static void main(String[] args) {
	        Animal animal1 = new Animal(); 
	        Animal animal2 = new Animal(40, 7, 4); 

	        System.out.println("El animal 1 tiene una velocidad de " + animal1.getSpeed() + ".");
	        System.out.println("El animal 2 tiene una velocidad de " + animal2.getSpeed() + ".");
	    }
	

}
