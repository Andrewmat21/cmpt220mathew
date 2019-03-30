
public class Goal 
{
	int minute;
	Player player = new Player();
	
	Goal()
	{
		this.minute = 0;
		this.player = null;
	}

	public int getMinute()
	{
		return this.minute;
	}

	public Player getPlayer()
	{
		return this.player;
	}

	public void setMinute(int min)
	{
		this.minute = min;
	}

	public void setPlayer(Player p)
	{
		this.player = p;
	}
}

