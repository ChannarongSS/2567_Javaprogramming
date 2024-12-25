import javax.swing.*;
public class Lad501_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptwasfound = false;
		
		String dept = JOptionPane.showInputDialog("Enter a department name");
		for (int i= 0;i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])){
				deptwasfound = true;
			}
		}//and of for()
		
		if (deptwasfound) {
			JOptionPane.showInternalMessageDialog(null, dept+ " was found in the list");
		}else {
			JOptionPane.showInternalMessageDialog(null, dept+ " was not found in the list");
		}//and of if()
		
	}
}
