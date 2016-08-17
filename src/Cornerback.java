

	public class Cornerback extends Player
	{
	  boolean zoneCoverage;
	  boolean manCoverage;

	   public Cornerback(String eName, String eSchool, int eYexperiance,
	                    int eSkill, int playerNum)
	   {
	      super(eName, eSchool, eYexperiance, eSkill, playerNum);

	  
	   }
	   
	   void setZoneCoverage(boolean zoneCoverage)
	   {
		   this.zoneCoverage = true;
	   }
	   
	   void setManCoverage (boolean manCoverage)
	   {
		   this.manCoverage = true;
	   }
	   
	   void resetCoverage(boolean zoneCoverage, boolean manCoverage)
	   {
		   this.manCoverage = false;
		   this.zoneCoverage = false;
	   }
	   
	   public boolean getZcover()
	   {
			return zoneCoverage;	
	   }
	   
	   public boolean getMcover()
	   {
			return manCoverage;	
	   }
	
	}


