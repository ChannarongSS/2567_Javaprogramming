
public class Student {
	// private two attribute
	private String name;
	private double[] scores;
	
	// method to set student details
	public void setStudentDetails(String stdName, double[] stdscores) {
		name = stdName;
		scores = stdscores;
	}
	//method to calculateAverageScore
	public double calculateAverageScore() {
		double total = 0;
		/*for(int i=0;i<scores.length;i++) {
		System.out.print(scores[i]+" "); 			
	}*/
	for(double _score : scores) {
		System.out.print(_score+" "); 
		}
	
		return total/scores.length;//return average o of scores
		
	}
	
	//Method to get qrade based on acerage scores
	public String getgrade() {
		double average = calculateAverageScore();
		if (average >= 90 ) {
			return "A";
		}else if(average >= 80 ) {
			return "B";
		}else if(average >= 70 ) {
			return "C";
		}else if(average >= 60 ) {
			return "D";
	    }else {
		    return "F";
	    }
	}
	
	// 
	public void displayStudentDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Scores: ");
		/*for(int i=0;i<scores.length;i++) {
		System.out.print(scores[i]+" "); 			
	}*/
	for(double _score : scores) {
		System.out.print(_score+" "); 
	}
		
		System.out.println("\nAverage Score: "+ calculateAverageScore());
		System.out.println("Grade: "+getgrade());
		
	}
}
