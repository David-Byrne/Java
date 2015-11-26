package week10;

public class Player {

	private int age;
	private int numGoals;
	private int position;
	
	public Player(int age, int pos, int goals) {
		
		this.age = age;
		this.numGoals = goals;
		this.position = pos;
	}

	public int getNumGoals() {
		return this.numGoals;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

}
