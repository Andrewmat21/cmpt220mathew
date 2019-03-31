
public class SoccerTest 
{

	public static void main(String[] args) 
	{
		Goal[] homeGoals = new Goal[10];
		SoccerMatch s = new SoccerMatch(null, null, "Green", "Red");
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player p5 = new Player();
		Player p6 = new Player();
		Player p7 = new Player();
		Player p8 = new Player();
		Player p9 = new Player();
		Player p10 = new Player();
		Player p11 = new Player();
		Player p12 = new Player();
		Player p13 = new Player();
		Player p14 = new Player();
		Player p15 = new Player();
		Player p16 = new Player();
		Player p17 = new Player();
		Player p18 = new Player();
		Player p19 = new Player();
		Player p20 = new Player();
	
		Player[] homePlayers = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10}; 
		Player[] visitorPlayers = {p11, p12, p13, p14, p15, p16, p17, p18, p19, p20};
		
		Goal g1 = new Goal();
		g1.setMinute(5);
		g1.setPlayer(p1);
		// JA
		s.addHomeGoal(g1);
		Goal g2 = new Goal();
		s.addVisitorGoal(g2);
		
		System.out.println("Who won the match?: " + s.getWinner());
	}

}
