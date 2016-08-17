import java.util.Scanner;


public class TeamManager {

	public static void main(String[] args) throws InterruptedException {
		
		Cornerback Norman = new Cornerback("Josh Norman", "Coastal Carolina", 4, 84, 24);
		Cornerback Tillman = new Cornerback("Charles Tillman", "Louisiana-Lafayette", 13, 81, 31);
		Safety Coleman = new Safety("Kurt Coleman", "Ohio State", 6, 79, 20);
		Safety Harper = new Safety("Roman Harper", "Alabama", 10, 79, 41);
		
		Offense ATL = new Offense("Atlana Falcons", 77) ;
		Offense TB = new Offense("Tampa Bay Buccaneers", 74);
		Offense NO = new Offense("New Orleans Saints", 78);
		Defense CAR = new Defense("Carolina Panthers", 80);
		
		GameScorer game1 = new GameScorer();
		GameScorer game2 = new GameScorer();
		GameScorer game3 = new GameScorer();
		//GameScorer game4 = new GameScorer();
		
		Scanner scan = new Scanner (System.in);
		
		String stars = "************************************************************"; //60
		String TeamName = "Carolina Panthers";
		String OpeningStatement = "You are the "+TeamName+ " secondary coach.";
		String JobDescription = "It is your job to coach up your team's Cornerbacks and Safeties. \n"
							+ "The season is almost over. We still play each of our division rivals once.\n"
							+ "3 total games left. If we win more than we lose we will be division Champions!";
		String Help = "Learn more?(Type '1' for No | '3' for Yes)";
		String coveragePrompt = "Zone or Man coverage?('1' for Zone | '2' for Man | '3' for more info)";
		String cornerHelp = "The Conerback posistion is primarly responsible for\n"
						+ "covering the opposing team's Wide Receivers, protecting\n"
						+ "against the pass, making tackles in the backfield and\n"
						+ "sometimes assisting in the blitz.";
		String safetyHelp = "The Safety(ies) line up 10-15yards in front of the line\n"
						+ "of scrimmage and are resposible for covering the back side\n"
						+ "of the field. They are the last line of defense.";
		String ssHelp =	"The 'Strong Safety' lines up on the 'Strong side' of the\n"
						+ "field (where the opposing team's Tight End lines up).\n"
						+ "He usually plays closer to the line of scrimmage than\n"
						+ "the Free Safety, and assists in stopping the run.";
		String fsHelp =	"The 'Free Safety' is primarily responsible for watching the\n"
						+ "Quarterback, moving to help cover recievers or moving in\n"
						+ "to tackle the Quaterback if he runs the ball himself.";
		String zoneCoverHelp = "In 'zone' coverage the defensive back is assigned a section of\n"
						+ "the field and tries to prevent plays made by any offensive player\n"
						+ "that enters that 'zone'. In some situations 'zone' coverage is a\n"
						+ "safer scheme against deep plays at the expense of giving up short\n"
						+ "yardage plays.";
		String manCoverHelp = "In 'man to man' coverage (or 'single' coverage) the cornerback\n"
						+ "is assigned a particular reciever and follows him during the\n"
						+ "the play. Man to man coverage can be a high risk, high reward\n"
						+ "strategy. Elite cornerbacks often play close, man to man coverage\n"
						+ "and try to stick as close to their assignments as possible. ";
		String yourTeam = "These are your players.";
		
		
		int userChoice, 
			sleepTime = 100;
		int playerChoice;
		int coachingSkill = 3;
		int wins = 0;
		int losses = 0;
		int gameScore = 0;
			
		
		//System.out.println(stars);	//60*
		//for (int i=0; i<10; i++)
		//{
		//	System.out.print("******");
		//	Thread.sleep( sleepTime * 1);
		//}
		System.out.println();
		System.out.println(OpeningStatement);
		System.out.println(JobDescription);
		System.out.println(Help);				//Gives basic primary and an NFL Teams "Secondary" otherwise continues  
		userChoice = scan.nextInt();			
		//scan.nextLine();
		if (userChoice == 3)
			{
			System.out.println(cornerHelp);
			starSleep();
			System.out.println();
			System.out.println(safetyHelp);
			starLong();
			System.out.println();
			System.out.println(ssHelp);
			starSleep();
			System.out.println();
			System.out.println(fsHelp);
			starSleep();
			System.out.println();
			}
		System.out.println(stars);
		System.out.println(yourTeam);
		
		Team panthers = new Team();
		panthers.roster();
		
		for(int games = 1; games < 4; games++)
		{
			int coachingReps = 0;
			
			while (coachingReps<coachingSkill)
				{
				System.out.println("Who do you want to coach up? |Improves their skill before the next game|\n"
									+ "(Enter the player's number)\n(Or '0' to skip)");
				playerChoice = scan.nextInt();
				if (playerChoice == (24))
					Norman.improveSkill();
				else
					if (playerChoice == (31))
						Tillman.improveSkill();
					else
						if (playerChoice == (41))
							Harper.improveSkill();	
						else
							if (playerChoice == (20))
								Coleman.improveSkill();
							else
								if (playerChoice == 0)
									coachingReps = coachingReps+5;
								else
								{
								System.out.println("That player is not on your team. Pick a player on your team.");
								System.out.println("Cornerbacks: Norman(24) and Tillman(31)\n"
												+ "Strong Safety: Harper(41)\n"
												+ "Free Safety: Coleman(20)");
								coachingReps--;
								}
				coachingReps++;
				}
			
			String OpposingTeam = "NFC South Team"; //create Opposing Team class with Return TeamName string
			
			int opposingStrength = 0;
			int opposingRating = 75;
			
			switch(games)
			{
				case 1 :
					OpposingTeam = ATL.toString();
					opposingRating = ATL.getRating();
					opposingStrength = opposingRating-75;
					game1.setOppTeam(opposingStrength);
					break;
				case 2 :
					OpposingTeam = TB.toString();
					opposingRating = TB.getRating();
					opposingStrength = opposingRating-75;
					game2.setOppTeam(opposingStrength);
					break;
				case 3 : 
					OpposingTeam = NO.toString();
					opposingRating = NO.getRating();
					opposingStrength = opposingRating-75;
					game3.setOppTeam(opposingStrength);
					break;
			}
			
			
			System.out.println(stars);
			System.out.println("It's game time!!!");
			System.out.println("You're up against the " + OpposingTeam+"!");
			System.out.println("They have an overall rating of "+opposingRating);
			System.out.println("Time to set your coverage.");
			
			
			do 
			{	
				Norman.setZoneCoverage(false);		//reset coverage to false
	            Tillman.setZoneCoverage(false);
				System.out.println(coveragePrompt);
				userChoice=scan.nextInt();
				switch(userChoice)
			      {
			         case 1 :
			            System.out.println("Zone Coverage");
			            Norman.setZoneCoverage(true);
			            Tillman.setZoneCoverage(true);
			            break;
			         case 2 :
			        	System.out.println("Man to Man Coverage");
			        	Norman.setManCoverage(true);
			        	Tillman.setManCoverage(true);
			        	break;
			         case 3 :		//help
			            System.out.println(zoneCoverHelp);
			            System.out.println(manCoverHelp);
			            break;
			      }
			      System.out.println("*****");
			}
			while(userChoice == 3);
			
			int coverBonus=0;
			int myCombinedRating;
			int combinedCorner = Norman.getSkill() + Tillman.getSkill();
			
			
			if (opposingRating < 75 && Norman.getMcover() == true)	//Determines the skill of users Corners
				if (combinedCorner >= 170)							//if high enough and man2man assigned
					{												//applies bonus otherwise applies negative bonus
					coverBonus = 15;
					System.out.println("Our Corners can handle them.");
					}
				else
					{
					coverBonus = -25;
					System.out.println("This team could give us trouble!");
					}
			else
				{
				if (Norman.getMcover() == true)
					if (combinedCorner >= 175)
					{
						coverBonus = 10;
						System.out.println("They are good but our Corners can handle them.");
					}
					else
					{
						coverBonus = -50;
						System.out.println("This team could give us a lot of trouble!");
					}
				}
			
			myCombinedRating = (Norman.getSkill()+Tillman.getSkill()+Harper.getSkill()+Coleman.getSkill()) - 300;
			myCombinedRating = myCombinedRating + coverBonus;
			//System.out.println("Coverage:"+Norman.getMcover()+"&"+Tillman.getMcover());
			//System.out.println(myCombinedRating+"-"+opposingStrength);
			
			starShort();
			System.out.println();
			
			switch(games)
			{
			case 1 :
				game1.setUserTeam(myCombinedRating);
				game1.playBall();
				gameScore = game1.getUserScore() - game1.getOppScore();
				break;
			case 2 :
				game2.setUserTeam(myCombinedRating);
				game2.playBall();
				gameScore = game2.getUserScore() - game2.getOppScore();
				break;
			case 3 : 
				game3.setUserTeam(myCombinedRating);
				game3.playBall();
				gameScore = game3.getUserScore() - game3.getOppScore();
				break;
			}
		
			if (gameScore > 0)
				{
				wins++;
				System.out.println("WE WON!!!!");
				}
			else
			{
				losses++;
				System.out.println("WE LOST!!!!");
			}
				
			System.out.println("Our record is :"+wins+"-"+losses);
			
		
		
		
		}	//end loop
		
		starSleep();
		System.out.println();
		
		if (wins > losses)
			System.out.println("You've helped the " + CAR.toString()+" become Division Champions!!!");
		else
			System.out.println("Our offense could use some work but a the  " + CAR.toString()+ " are known\n"
					+ "for defense. We should have done better. Next time make sure your DBs are prepared\n"
					+ "for your defesive schemes.");
		
		
		starShort();
		System.out.println();
		System.out.println(Norman.toString());
		System.out.println();
		System.out.println(Tillman.toString());
		System.out.println(stars);
		System.out.println(Harper.toString());
		System.out.println(stars);
		System.out.println(Coleman.toString());
		starLong();
	}

	public static void starSleep() throws InterruptedException
	{
		for (int i=0; i<60; i++)
		{
			System.out.print("*");
			Thread.sleep(50);
		}
	}
	
	public static void starShort() throws InterruptedException
	{
		for (int i=0; i<60; i++)
		{
			System.out.print("*");
			Thread.sleep(25);
		}
	}
	
	public static void starLong() throws InterruptedException
	{
		for (int i=0; i<60; i++)
		{
			System.out.print("*");
			Thread.sleep(100);
		}
	}
	
	
	
}
