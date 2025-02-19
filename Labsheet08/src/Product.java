
public class Product {
	private String productId;
	private int  productunit;
	private double  productprice;
	
	public void setId (String pid) {
		productId = pid ;
		
		
	}
	
	public String getid() {
		return this.productId;
		
	}
	
	public void setUnit(int unit) {
		productunit = unit;
		
	}
	
	public int getUnit() {
		return this.productunit;
		
	}
	
	public void setprice(double price) {
		productprice = price;
	}
	
	public double getprice() {
		return this.productprice;
		
	}
	
	public double calculate() {
		double Tax = productunit *  productprice;
		return Tax;
		
	}
	
}



