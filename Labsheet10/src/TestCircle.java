
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(5.0);
		
		System.out.println(c1);
		String frmResilt =  String.format("%.2f", c1.getPerimeter());
		System.out.println("Perimetr: "  + frmResilt);
		System.out.printf("Area: %.2f" ,  c1.getArea());
		
		
		
		
		
		
		
	}

}
