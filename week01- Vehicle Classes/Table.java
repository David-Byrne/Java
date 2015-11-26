package week1;

public class Table {
	
	private int noOfLegs = 4;
	private int height = 100;
	private int scratches = 3;
	private double value = 250;
	
	public void elevate(int increment) {
        height = height + increment;   
   }

	public void lower(int decrement) {
        height = height - decrement;
   }
	
	public void changeLegs(int newValue)
	{
		noOfLegs = newValue;
	}
	
	public void numOfScratches(int newValue)
	{
		scratches = newValue;
	}
	
	public void depreciate(int decrease)
	{
		value = value - decrease;
	}
	
	public void printStates() {
    	System.out.println("Number of legs: "+noOfLegs+"\tCurrent height: "+height+
    			"\tNumber of scratches: "+scratches+"\tValue "+value);
    }
}
