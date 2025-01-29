public class LoanCalculator {
	private String productname;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String stdname, double stdprice, double stdRate, int stdyear) {
	this.productname = stdname;
	this.price = stdprice;
	this.interestRate = stdRate;
	this.years = stdyear;
	
	}
	
	public double calculateMonthlyPayment() {
		double Monthly = interestRate/100/12;
		int numyear = years *12;
		
		double payMent = (price * Monthly * Math.pow(1 + Monthly, numyear)) / ((Math.pow(1 + Monthly, numyear))-1) ;
		return payMent;
		
	}
	
	public void displayLoanDetails() {
		System.out.println("product: " + productname);
		System.out.println("price: " + price);
		System.out.println("Interest Rate: " + interestRate+"%");
		System.out.println("Loan periof: " + years + " years");
		System.out.printf("Monthly Payment: %.2f\n" , calculateMonthlyPayment());
		
	}
}