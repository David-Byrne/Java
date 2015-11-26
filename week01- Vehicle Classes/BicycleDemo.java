package week1;

class BicycleDemo {
	
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        bike1.printStates();
        Bicycle bike2 = new Bicycle();
        bike2.printStates();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(45);
        bike1.speedUp(10);
        bike1.changeGear(6);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}