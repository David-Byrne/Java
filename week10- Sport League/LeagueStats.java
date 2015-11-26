package week10;

public class LeagueStats {

	League leg;
	
	public void add(League leg1) {
		this.leg = leg1;
	}

	public int getNumDivisions() {
		return (this.leg.getNumDivisions());
	}

	public int getNumTeams() {
		return leg.getNumTeams();
	}

	public double getNumGoalsForTeam(String string) {
		return (this.leg.getNumGoalsForTeam(string));
		
	}

	public double getNumGoalsForDivision(String string) {
		return this.leg.getNumGoalsForDivision(string);
	}

	public double getAvgAgeForTeam(String string) {
		return this.leg.getAvgAgeForTeam(string);
	}

}
