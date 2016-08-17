
public class Team 
{

	public TeamMember[] teamMemberList;
	
	   public Team()
	   {
	      teamMemberList = new TeamMember[4];

	      teamMemberList[0] = new Cornerback("CB: Josh Norman", "Coastal Carolina",
	         4, 84, 24);
	      
	      teamMemberList[1] = new Cornerback("CB: Charles Tillman", "Louisiana-Lafayette",
	 	     13, 81, 31);
	    
	      teamMemberList[2] = new Safety("SS: Roman Harper", "Alabama",
	         10, 79, 41);

	      teamMemberList[3] = new Safety("FS: Kurt Coleman", "Ohio State",
	 	         6, 79, 20);
	      
	 
	   }
	   public void roster () throws InterruptedException
	   {
	      
	      for (int count=0; count < teamMemberList.length; count++)
	      {
	         System.out.println(teamMemberList[count]);

	         for (int i=0; i<60; i++)
				{
					System.out.print("*");
					Thread.sleep(15);
				}
				System.out.println();
	      }
	
	      
	      
	      
	      
	   }
}
