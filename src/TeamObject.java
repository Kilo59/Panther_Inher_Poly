
public abstract class TeamObject 
{
	protected String teamName;
	protected int rating;
	
	public TeamObject(String eTeamName, int eRating) 
	{	
		 teamName = eTeamName;
	      rating = eRating;
	}

	public int getRating()
	   {
		   return rating;
	   }
	
	 public String toString()
	   {
	      String result = teamName;
	      return result;
	   }
	
	
}
