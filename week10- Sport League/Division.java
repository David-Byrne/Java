package week10;

import java.util.ArrayList;

public class Division {

	private ArrayList<Team> teams;
	private String name;
	
	public Division(String name) {
		this.name = name;
		this.teams = new ArrayList<Team> ();
	}
	

	public void add(Team team) {
		this.teams.add(team);
		
	}

	public int getNumTeams() {
		
		return this.teams.size();
	}


	public double getNumGoalsForTeam(String string) {
		double numGoals = 0;
		String name = "";
		for (Team team: this.teams)
		{
			name = team.getName();
			if (string.equals(name))
			{
				numGoals += team.getNumGoals();
			}
		}
		return numGoals;
	}


	public double getNumGoalsForDivision() {
		double numGoals = 0;
		for (Team team: this.teams)
		{
			
			numGoals += team.getNumGoals();
		}
		return numGoals;
		
	}


	public String getName() {
		return this.name;
	}


	public double getAvgAgeForTeam(String string) {
		double avgAge = 0;
		String name = "";
		for (Team team: this.teams)
		{
			name = team.getName();
			if (string.equals(name))
			{
				avgAge += team.getAvgAge();
			}
		}
		return avgAge;
	}


	

}
