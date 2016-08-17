
public class Player extends TeamMember{

	 protected int playerNumber;
	  
	   public Player(String eName, String eSchool, int eYexperiance,
	                   int eSkill, int playerNum)
	   {
	      super(eName, eSchool, eYexperiance, eSkill);

	      playerNumber = playerNum;
	   
	   }
	   
	   public String toString()
	   {
	      String result = super.toString();

	      result += "\nPlayer Number: " + playerNumber;

	      return result;
	   }

}
