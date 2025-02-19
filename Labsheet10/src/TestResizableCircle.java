
public class TestResizableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		String frm = String.format("%.2f" , rc.getPerimeter());
		System.out.println("Perimeter: "  + frm);
		System.out.printf("Area: %.2f " ,  rc.getArea());
		Line();
		rc.resize(50);
		System.out.println("After resiza(50%) : " + rc);
		System.out.println("Perimeter: "  + frm);
		System.out.printf("Area: %.2f" ,  rc.getArea());
	
		
	}
	
	public static void Line() {
		for(int i=0; i<50; i++) 
			System.out.print(" ");
		System.out.println();
		
	}
	
}
