
public class Player 
{
	String name;
	int goals;
	String team;
	
	Player()
	{
		this.name = "";
		this.goals = 0;
		this.team = "";
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setTeam(String team)
	{
		this.team = team;
	}
	
	public void setGoals(int goals)
	{
		this.goals = goals;
	}
	public String getName()
	{
		return this.name;
	}

	public int getGoals()
	{
		return this.goals;
	}

	public String getTeam()
	{
		return this.team;
	}

}
