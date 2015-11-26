package week1;

public class Aeroplane {

	private int speed = 0;
    private double altitude = 0;
    private double airMiles = 35600;
	
 
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
 
    public void slowDown(int decrement) {
         speed = speed - decrement;
    }
    
    public void changeAltitude(double newValue)
    {
    	altitude = newValue;
    }
    
    public void increaseAirMiles(double increase)
    {
    	airMiles += increase;
    }
 
    public void printStates() {
    	System.out.println("Speed: "+speed+"\tAltitude: "+altitude+"\tAir miles traveled: "+airMiles);
    }
}
