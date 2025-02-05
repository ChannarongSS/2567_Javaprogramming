
public class sales extends Employee {
	
	private double sales;
	
	sales(String id,String name,double salary,double sales){
		super(id,name,salary); //เรียกใช้ parameter constructor จาก superclass
		this.sales = sales;		
	}
	
	sales(String id,String name,double sales){
		super(id,name); //เรียกใช้ parameter constructor จาก superclass
		this.sales = sales;		
	}
	
	public double getCommission() {
		if(this.sales < 10000) {
			return 0;
		}else if(this.sales < 50000) {
			return (this.sales-10000) * 10/100;			
		}else {
			return (this.sales - 50000) * 15/100;
		}		
	}
	
	public String toString() {
		return super.getName() + " (" + super.getId() + ")"
				+" get commission " + this.getCommission()+" B." ;
	}

}