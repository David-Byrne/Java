package week10;

import java.util.ArrayList;

import week8.lab8.DataType;


public class League {
	
	private ArrayList<Division> divisions;
	private String name;
	
	public League(String name) {
		this.name = name;
		this.divisions = new ArrayList<Division> ();
	}
	
	public void add(Division div)
	{
		this.divisions.add(div);
	}

	public int getNumDivisions() {
		return this.divisions.size();
	}

	public int getNumTeams() {
		int numTeams = 0;
		for (Division div: this.divisions)
		{
			numTeams += div.getNumTeams();
		}
		return numTeams;
	}


	public double getNumGoalsForTeam(String string) {
		double numGoals = 0;
		for (Division div: this.divisions)
		{
			numGoals += div.getNumGoalsForTeam(string);//adds 0 to it unless it's the team we're looking for
		}
		return numGoals;
	}

	public double getNumGoalsForDivision(String string) {
		double numGoals = 0;
		for (Division div: this.divisions)
		{
			name = div.getName();
			if (string.equals(name))
			{
				numGoals += div.getNumGoalsForDivision();
			}
		}
		return numGoals;
	}

	public double getAvgAgeForTeam(String string) {
		double avgAge = 0;
		for (Division div: this.divisions)
		{
			avgAge += div.getAvgAgeForTeam(string);//adds 0 to it unless it's the team we're looking for
		}
		return avgAge;
	}
	

}
