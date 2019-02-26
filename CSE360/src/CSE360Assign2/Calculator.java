/*Name: Yara Hawwari
 * Class ID: 400
 * Assignment 3
 * Description: Making changes to calculator class for 
 * 				Assignment 2 and committing it to Github
 */
package CSE360Assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	
	public void add (int value) {
		total = total +value;
	}
	
	public void subtract (int value) {
		total = total-value;
	}
	
	public void multiply (int value) {
		total = total*value;
	}
	
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total/value;
	}
	
	public String getHistory () {
		return "";
	}
}
