import java.util.Scanner;

/**
 * Contains main method for running the alarm clock I/O
 * @author William
 *
 */
public class Main {

	/**
	 * This runs first when the project is run
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Gets input from user
		Scanner consoleIn = new Scanner(System.in);
		String nextLine = "";
		boolean keepGoing = true;

		System.out.println("Hi, I'm an alarm clock! You can: ask me for time and stuff!");
		 
		
		
		while (keepGoing) {
			
			System.out.println("What would you like to do?");
			nextLine = consoleIn.nextLine();
			
			switch (nextLine) {
			case GET_TIME:
				//TODO
				System.out.println("You asked for: " + nextLine);
				break;
			case SET_TIME:
				// TODO
				System.out.println("You asked for: " + nextLine);
				break;
			case SET_ALARM:
				//TODO 
				System.out.println("You asked for: " + nextLine);
				break;
			case GET_ALARM:
				// TODO
				System.out.println("You asked for: " + nextLine);
				break;
			case EXIT:
				// make keepGoing false to break out of the while
				keepGoing = false;
				System.out.println("You asked for: " + nextLine);
				break;
			case STEP:
				// TODO
				System.out.println("You asked for: " + nextLine);
				break;
			case HELP:
				//TODO print out help instructions

				System.out.println("You asked for: " + nextLine);
				break;
			default:
				System.out.println("I don't know how to do that.\nEnter " + HELP + "for a list of commands");
				
			}
			
		}
		
		System.out.println("Goodbye!");
	}
	
	
	
	
	/* *************************** COMMANDS ******************************* */
	private static final String GET_TIME = "time?";
	
	private static final String SET_TIME = "set time";
	
	private static final String GET_ALARM = "alarm?";
	
	private static final String SET_ALARM = "set alarm";
	
	private static final String EXIT = "exit";
	
	private static final String STEP = "wait";
	
	private static final String HELP = "help";
	
	

}
