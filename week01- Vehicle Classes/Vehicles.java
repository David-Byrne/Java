package week1;

public class Vehicles {
	
	public static void main(String[] args) {
		Aeroplane boeing = new Aeroplane();
		Car mondeo = new Car();
		Table teaTable = new Table();
		
		System.out.println(boeing.getClass());
		boeing.printStates();
		boeing.speedUp(100);
		boeing.changeAltitude(1000);
		boeing.printStates();
		boeing.slowDown(70);
		boeing.changeAltitude(0);
		boeing.increaseAirMiles(2000);
		boeing.slowDown(30);
		boeing.printStates();
		
		System.out.println("\n"+mondeo.getClass());
		mondeo.printStates();
		mondeo.changeRadioSt(2);
		mondeo.speedUp(20);
		mondeo.changeGear(2);
		mondeo.speedUp(20);
		mondeo.changeGear(3);
		mondeo.speedUp(30);
		mondeo.changeGear(4);
		mondeo.speedUp(30);
		mondeo.changeGear(5);
		mondeo.speedUp(40);
		mondeo.printStates();
		
		System.out.println("\n"+teaTable.getClass());
		teaTable.printStates();
		teaTable.changeLegs(3);
		teaTable.elevate(10);
		teaTable.numOfScratches(4);
		teaTable.depreciate(50);
		teaTable.printStates();
	}

}
