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
		String nextLine;

		System.out.println("Hi, I'm an alarm clock! You can: ask me for time and stuff!");
		System.out.println("Ask me what time it is!");
		
		nextLine = consoleIn.nextLine();
		
		System.out.println("You asked for: " + nextLine);
	}
	
	
	
	
	/* *************************** COMMANDS ******************************* */
	private final String GET_TIME = "time?";
	
	private final String SET_TIME = "set time";
	
	private final String GET_ALARM = "alarm?";
	
	private final String SET_ALARM = "set alarm";
	
	private final String EXIT = "exit";
	
	private final String STEP = "wait";
	
	
	

}
