package week3.lab2;

public class Month {
	
	private int monthNum;
	private String monthName;
	private String months[] = {"January", "February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public Month(int mth )
	{
		mth = ((mth-1)%12) +1;//error checking so it doesn't crash if they enter a value > 12
		monthNum = mth;
		monthName = months[monthNum-1];
	}
	
	public String getMonth()
	{
		return monthName;
	}
}
