
public class Rectangle {
	/*
    private float length;
    private float width;

    //
    Rectangle(){
    	length = 1.0f;
    	width = 1.0f;*
    	
    }*/
	private float length=1.0f;
    private float width = 1.0f;
    Rectangle(){}
    
    Rectangle(float length,float width){
    	this.length = length;
    	this.width = width;
    }
    
    //getter and setter method
    public float getlength() {
    	return this.length;
    }
    
    public void setlength (float length) {
    	this.length = length;
    }
    
    public float getwidth() {
    	return this.width;
    }
    
    public void setwidth (float width) {
    	this.width = width;
    }
    
    //Method to calculate area
    public double getArea() {
    	return this.length * this.width;
    }
    
    //Method to calculate perimeter
    public double getPerimeter () {
    	return  2 * this.length + this.width;
    }
    
    //method t o display
    public String showData () {
    	return "Rectangle[ length = " + this.length + ",width = " + this.width+"]";
    }
    
    //method t o display using toString()
    public String toString () {
    	return "Rectangle[ length = " + this.length + ",width = " + this.width+"]";
    }
    
    
}
