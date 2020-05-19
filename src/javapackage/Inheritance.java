package javapackage;

public class Inheritance {

	public static void main(String[] args) {
		
		Child c = new Child (); 
		System.out.println("Compile time polymorphism");		
		c.start();
		c.stop();
		c.fuel();
		c.safety();

Parent p = new Child (); 
		System.out.println("Dynamic time polymorphism");		
		p.start();
		p.stop();
		p.fuel();
		p.strength();
	}

}
