
public class ResizableCircle extends Circle implements Resizable{
	
	ResizableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public void  resize(int Percent) {
		this.radius *= Percent / 100.0;
	}
	
	
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]";
	}
	
	
	
	
	
}
