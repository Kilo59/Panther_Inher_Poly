
public class Safety extends Player
	{

	   public Safety(String eName, String eSchool, int eYexperiance,
	                    int eSkill, int playerNum)
	   {
	      super(eName, eSchool, eYexperiance, eSkill, playerNum);

	   }
	 
	   
	   public void improveSkill() throws InterruptedException   //example of polymorphism			
	   {													//Safeties improve skill more rapidly than other 
		   if (skill < 80)									//players at first but more level off
		   {												//and develope more slowly after level 80
			   skill = skill +2;							//optimal strategy would be to only improve the 2 panthers safeties 
			}												//once and then only improve 2 Cornerbacks subsequently. 
		   
		   skill++;
		   for (int i=0; i<30; i++)
			{
				System.out.print("**");
				Thread.sleep(50);
			}
			System.out.println();
			System.out.println("Player Improved!! ("+skill+")");
			}
		   
	   
		}