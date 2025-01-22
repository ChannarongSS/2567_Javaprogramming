import java.util.*;
public class DemoCar {

	public static void main(String[] args) {
		//Test constructors and ()
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		car.display();
		
		Spacing();
		System.out.println("Updated Car Details:");
		car.setcompanyname("Toyota");
		car.setModelName("Corolla");
		car.setYear(2015);
		car.display();
		
		car.setYear(1800);
		car.setcompanyname("");
		car.setModelName("");
		
	}
	
	public  static void Spacing() {
		System.out.println();
	}

}
