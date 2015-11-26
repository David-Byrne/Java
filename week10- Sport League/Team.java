package week10;

import java.util.ArrayList;

public class Team {

	private String name = new String();
	private int trophies;
	private ArrayList<Player> players;
	
	public Team(String string, int trophs) {
		this.name = string;
		this.trophies = trophs;
		this.players = new ArrayList<Player> ();
	}

	public void add(Player pla) {
		this.players.add(pla);
		
	}

	public String getName() {
		return this.name;
	}

	public int getNumGoals() {
		int numGoals = 0;
		for (Player player : this.players)
		{
			numGoals += player.getNumGoals();
		}
		return numGoals;
	}

	public double getAvgAge() {
		int avgAge = 0;
		for (Player player : this.players)
		{
			avgAge += player.getAge();
		}
		return avgAge/this.players.size();
	}

}
