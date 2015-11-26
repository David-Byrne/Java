package week10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LeagueStatsTest {
	LeagueStats leg = new LeagueStats();
	@Before
	public void setUp() throws Exception {
		
		League leg1 = new League("leg1");
		
		Division div1 = new Division("div1");
		Division div2 = new Division("div2");
		
		Team team1 = new Team("team1", 1);
		Team team2 = new Team("team2", 1);
		Team team3 = new Team("team3", 2);
		Team team4 = new Team("team4", 4);
		
		Player pla1 = new Player(18, 1, 0);
		Player pla2 = new Player(19, 5, 3);
		Player pla3 = new Player(20, 11, 10);
		Player pla4 = new Player(17, 1, 1);
		Player pla5 = new Player(18, 4, 4);
		Player pla6 = new Player(19, 10, 12);
		Player pla7 = new Player(23, 1, 0);
		Player pla8 = new Player(25, 2, 2);
		Player pla9 = new Player(27, 9, 13);
		Player pla10 = new Player(16, 1, 2);
		Player pla11 = new Player(20, 6, 8);
		Player pla12 = new Player(24, 11, 23);
		
		team1.add(pla1);
		team1.add(pla2);
		team1.add(pla3);
		team2.add(pla4);
		team2.add(pla5);
		team2.add(pla6);
		team3.add(pla7);
		team3.add(pla8);
		team3.add(pla9);
		team4.add(pla10);
		team4.add(pla11);
		team4.add(pla12);
		
		div1.add(team1);
		div1.add(team2);
		div2.add(team3);
		div2.add(team4);
		
		leg1.add(div1);
		leg1.add(div2);
		
		leg.add(leg1);
	}

	@Test
	public void TestGetNumDivisions() {
		int numDivs = leg.getNumDivisions();
		
		assertEquals(numDivs, 2);
	}
	
	@Test
	public void TestGetNumTeams() {
		int numTeams = leg.getNumTeams();
		//System.out.println(numTeams);
		assertEquals(numTeams, 4);
		
	}
	
	@Test
	public void TestGetNumGoalsForDivision() {
		double numGoals = leg.getNumGoalsForDivision("div1");
		assertEquals(numGoals, 30, 0.1);
	}
	
	@Test
	public void TestGetNumGoalsForTeam() {
		double numGoals = leg.getNumGoalsForTeam("team1");
		assertEquals(numGoals, 13, 0.1);
		
	}
	
	@Test
	public void TestGetAvgAgeOfTeam() {
		double avgAge = leg.getAvgAgeForTeam("team1");
		assertEquals(avgAge,19, 0.1);
	}

}
