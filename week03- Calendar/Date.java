package week3.lab2;

public class Date {
	
	private String today;
	private String dayNum;
	private String monthName;
	private int thisYear;
	
	public Date(Day day, Month month, Year year)
	{
		today = day.getDay();
		dayNum = Integer.toString(day.getDayNum());
		switch (dayNum)
		{
		case("1"): dayNum = dayNum + "st";
			break;
		case("2"): dayNum = dayNum + "nd";
			break;
		case("3"): dayNum = dayNum + "rd";
			break;
		default: dayNum = dayNum + "th";
		}
		monthName = month.getMonth();
		thisYear = year.getYear();
	}
	
	public void printName()
	{ 
		System.out.println("The date is "+ today +", the "+dayNum+" of "+monthName+" "+thisYear);
	}
}
