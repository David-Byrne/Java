package week3.lab2;

// This is a special method called a Constructor. 
//It is called when you create new Object - in this case, of type Day

public class Day {
	private int day;
	private int month;
	private int dayTotal;
	private String name; //e.g. Tuesday
	private String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	public Day(int dy, int mth ){
		day = dy;
		month = mth;
		dayTotal = (30*(month-1))+day;//finds number of days passed in the year
		name = days[(dayTotal%7)];
	}
	
	public String getDay()
	{
		return name;
	}
	
	public int getDayNum()
	{
		return day;
	}
}
