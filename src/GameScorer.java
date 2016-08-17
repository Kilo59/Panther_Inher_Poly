import java.util.Random;

public class GameScorer {

	int userRating;
	int userRand;
	int oppRating;
	int oppRand;
	int oppScore;
	int userScore;
	
	final int randVariable = 40;
	int userRandVar = randVariable;
	int oppRandVar = randVariable;
	
	Random rand = new Random();
	
	public GameScorer() {
		// TODO Auto-generated constructor stub
	}

	void setUserTeam(int userRating)
	{
		this.userRating = userRating;
	}
	
	void setOppTeam(int oppRating)
	{
		this.oppRating = oppRating;
	}
	
	public int getUserRating()
	{
		return userRating;
	}
	
	public int getOppRating()
	{
		return oppRating;
	}
	
	public int getUserScore()
	{
		return userScore;
	}
	
	public int getOppScore()
	{
		return oppScore;
	}
	
	
	//simulates the games being played. Takes CB and Safety ratings and compares them to opposing Offensive Rating
	//if one rating is higher than another that team's rating is increased until it is enough to "score"
	//after scoring both teams ratings are reduced (not evenly) in attempt to give the loosing team a chance to "come back"
	void playBall() throws InterruptedException 
	  { 
	
		int oppBonusScore = 0;
		int userBonusScore = 0;
	//System.out.println("UserRating:"+userRating);	
	//System.out.println("OppRating:"+oppRating);
		if (oppRating > userRating)
			oppBonusScore = 7;
			oppRandVar = oppRandVar + 3;
		
		if (userRating > oppRating)
			userBonusScore = 7; 
			userRandVar = userRandVar + 3;
		
	for (int i = 0; i < 7; i++)
	{
		userRand = rand.nextInt(userRandVar);
		oppRand = rand.nextInt(oppRandVar);
		userRating = userRating + userRand;
		oppRating = oppRating + oppRand;
		//System.out.println("End of the Quarter: Carolina " +userScore+" to "+ oppScore);
		//System.out.println(i+"Rating:"+userRating+"-"+oppRating);
		//System.out.println(i+"Score:"+oppScore+"-"+userScore);
		
		if (oppRating > userRating+15)
	    	{
			oppScore = oppScore + 7;
			//System.out.println(i+"+7 Opp");
			oppRating = oppRating -30;
			userRating = userRating -10;
			}
	    else
	    	if (oppRating > userRating+10)
	    		oppScore = oppScore + 6;
	    	else
	    		if (oppRating > userRating+5)
	    			oppScore = oppScore +3;
	    		else
	    			if (oppRating > userRating)
	    				oppRating = oppRating + 5;
	    			else
	    				if (oppRating < userRating-15)
	    					{
	    					userScore = userScore + 7;
	    					//System.out.println(i+"+7 User");
	    					oppRating = oppRating -10;
	    					userRating = userRating -30;
	    					}
	    				else
	    					if (oppRating < userRating-10)
	    						userScore = userScore +3;
	    					else
	    						if (oppRating < userRating)
	    							oppRating = oppRating -10;
	    						else 
	    							if (oppRating == userRating)
	    								oppRating = oppRating -5;
		
		System.out.println("\t\tCarolina "+userScore+"-"+oppScore);
		Thread.sleep(750);
	}
		
		//at the end of the game the following code attempts to end the game with a somewhat realistic score
		//by applying or taking away from the score based on what the score is at this point
		userScore = userScore + userBonusScore;
		oppScore = oppScore + oppBonusScore;
		if	(oppScore < 14)
			{
			oppScore = oppScore + 6;
			if (userScore > 22)
				oppScore = oppScore +2;
			}
		
		if (userScore == oppScore)
			userScore = userScore + 3;
		
		if (oppScore > 30)
		{
			oppScore = oppScore - oppBonusScore;
			userScore = userScore + 7;
		}
		
		System.out.println("\t\tCarolina "+userScore+"-"+oppScore);
		Thread.sleep(1000);
		System.out.println("Final score: Carolina "+userScore+"-"+oppScore);
	
	  }
	
	
}
