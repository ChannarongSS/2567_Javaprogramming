
public class Car {
	//private to Car
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	
	//Default Constructor
	Car (){
	/*	companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;*/
		this("Unknow","Unknow",2000,0.0);
	}
	
	//Parameterize constructor
	Car(String companyName,String modelName, int year,double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		//Default ปีที่ปลิต 2000 
		this.year = year <1886? 2000:year;
		this.mileage = mileage;
	}
	
	// getters and setters method 
	public void setcompanyname(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName; 
		}else {
			System.out.println("Error : Invalid company or model name!");
		}
	}
	
	// getters and setters method setModelName
	public void  setModelName(String  ModelName) {
		if( ModelName != null && ! ModelName.trim().isEmpty()) {
			this.modelName = ModelName; 
		}else {
			System.out.println("Error : Invalid company or model name!");
		}
	}
	
		
	// getters and setters method setModelName
	public void  setYear(int year) {
			if(year < 1886) {
				System.out.println("Error: Invalid year!");
			}else {
			    this.year = year; 
			}
		}
	
	public double getmileage() {
		return mileage;
	}
	
			
	public void display() {
		System.out.println("Company Name: " +companyName );
		System.out.println("Model Name: " +modelName );
		System.out.println("year: " +year );
		System.out.println("Mileage: " +mileage );
	}
}
