/*Name: Yara Hawwari
 * Class ID: 400
 * Assignment 3
 * Description: Making changes to calculator class for 
 * 				Assignment 2 and committing it to Github
 */
package CSE360Assign2;

public class Calculator { // Second version of the calculator.java file with changes

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () { // Returns the current total
		return total;
	}
	
	public void add (int value) { // Adds the parameter to the total value
		total = total + value;
	}
	
	public void subtract (int value) { // Subtracts the parameter from the total value
		total = total - value;
	}
	
	public void multiply (int value) { // Multiplies the total by the parameter
		total = total * value;
	}
	
	public void divide (int value) { // Divides the total by the parameter
		if(total == 0)
			total = 0;
		else
			total = total/value;
	}
	
	public String getHistory () {
		return "";
	}
}
