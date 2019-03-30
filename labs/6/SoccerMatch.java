import java.util.Date;

public class SoccerMatch 
{
	Date startTime;
	Date endTime;
	String location;
	String home;
	String visitor;
	Player[] homePlayers = new Player[11]; 
	Player[] visitorPlayers = new Player[11];
	Goal[] homeGoals = new Goal[10];
	Goal[] visitorGoals = new Goal[10];
	int myHomePlayersSize;
	int myVisitorPlayersSize;
	int myHomeGoalsSize;
	int myVisitorGoalsSize;
	
	SoccerMatch()
	{
		this.startTime = null;
		this.endTime = null;
		this.location = "";
		this.home = "";
		this.visitor = "";
	}

	SoccerMatch(Date startTime, Date endTime, String home, String visitor)
	{
		this.startTime = startTime;
		this.startTime = endTime;
		this.home = home;
		this.visitor = visitor;
	}

	public void addHomePlayer(Player p)
	{
		if (myHomePlayersSize < homePlayers.length)
		{
			homePlayers[myHomePlayersSize++] = p;
		}
		
	}

	public void addVisitorPlayer(Player p)
	{
		if (myHomePlayersSize < homePlayers.length)
		{
			visitorPlayers[myVisitorPlayersSize++] = p;
		}
	}
		
	public String getWinner()
	{
		if(myHomeGoalsSize > myVisitorGoalsSize)
		{
			return home;
		}
	
		else if (myHomeGoalsSize < myVisitorGoalsSize)
		{
			return visitor;
		}
	
		else 
			return "Tie";
	}

	public void addHomeGoal(Goal g)
	{
		homeGoals[myHomeGoalsSize++] = g;
	}

	public void addVisitorGoal(Goal g)
	{
		visitorGoals[myVisitorGoalsSize++] = g;
	}

	public Goal[] getHomeGoals()
	{
		return homeGoals;
	}

	public Goal[] getVisitorGoals()
	{
		return visitorGoals;
	}
}

