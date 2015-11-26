package week1;

public class Car {

    private int speed = 0;
    private int gear = 1;
    private int radio = 0;
 
    public void changeGear(int newValue) {
         gear = newValue;
    }
 
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
 
    public void slowDown(int decrement) {
         speed = speed - decrement;
    }
    
    public void changeRadioSt(int newStation)
    {
    	radio = newStation;
    }
 
    public void printStates() {
         System.out.println("Speed: "+speed+"\tGear: "+gear+"\tRadio Station: "+radio);
    }
}
