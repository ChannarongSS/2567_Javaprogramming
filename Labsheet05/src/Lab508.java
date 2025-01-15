import javax.swing.*;
public class Lab508 {
	
	//and Methot checkIndex
	public static boolean checkIndex(int[] nums,int index) {
		return index >= 0 && index < nums.length;
	}
	
	//and Methot currentData
	public static int currentData(int[] nums,int index) {
			return nums[index];
		
	}
	
	//and Methot prevData
	public static int prevData(int[] nums,int index) {
		return nums[index-1];		
	}
	
	//and Methot intnextData 
	public static int intnextData(int[] nums,int index) {
		return nums[index+1];
		
		
	}
	

	public static void main(String[] args) {
		int[] nums = { 25, 78, 41, 22, 36, 85, 37 };
		
		//Input
		int index = Integer.parseInt(JOptionPane.showInputDialog(null, "Input index of array:"));
		while (!checkIndex(nums,index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog(null,"Input index of array, again:"));
		}
		
		String number = "Current data, nums["+index+"] is " +currentData(nums , index)+"\n";
		number += (checkIndex(nums, index -1 ) ? "Previous data, nums["+ (index -1 ) + "] is " + prevData(nums, index) : "No previous data") +"\n";
		number += (checkIndex(nums, index +1) ? "Next data, nums["+ (index + 1) + "] is"+ intnextData(nums, index) : "No Next data") + "\n";
		
		//showMessage
		JOptionPane.showMessageDialog(null, number);
	}

}