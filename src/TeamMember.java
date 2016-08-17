

	abstract public class TeamMember
	{
	   protected String name;
	   protected String school;
	   protected int yearsExperiance;
	   protected int skill;

	   public TeamMember(String eName, String eSchool, int eYexperiance, int eSkill)
	   {
	      name = eName;
	      school = eSchool;
	      yearsExperiance = eYexperiance;
	      skill = eSkill;
	   }

	   public String toString()
	   {
	      String result = "Name: " + name + "\n";

	      result += "School: " + school + "\n";
	      result += "Experiance(Years): " + yearsExperiance + "\n";
	      result += "Skill: " + skill;

	      return result;
	   }

	 
	   
	   public void improveSkill() throws InterruptedException
	   {
		   skill++;
		   skill++;
		   for (int i=0; i<30; i++)
			{
				System.out.print("**");
				Thread.sleep(50);
			}
			System.out.println();
			System.out.println("Player Improved!! ("+skill+")");
			}
	   
	   
	   public int getSkill()
	   {
		   return skill;
	   }
	}
	
	
	

