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
		
		// Make the AlarmClock
		AlarmClock myAlarmClock = new AlarmClock();

		System.out.println("Hi, I'm an alarm clock! You can: ask me for time and stuff!");
		 
		
		
		while (keepGoing) {
			
			// For getting inputs
			int tmpMin;
			int tmpHr;
			
			// If the alarm clock is ringing, don't do anything until it is stopped
			if (myAlarmClock.isRinging()) {
				System.out.println("RRRRRRRRRIIIIIIINNNNNNNGGG!!!!\nEnter \"Stop\" to stop the ringing:");
				if (consoleIn.nextLine() == "Stop")
					myAlarmClock.stopAlarm();
			}
			
			
			System.out.println("What would you like to do?");
			nextLine = consoleIn.nextLine();
			
			switch (nextLine) {
			case GET_TIME:
				System.out.println("The current time is: " + myAlarmClock.getTime());
				break;
			case SET_TIME:
				System.out.println("Enter the hour: ");
				tmpHr = consoleIn.nextInt();
				System.out.println("Enter the minute: ");
				tmpMin = consoleIn.nextInt();
				myAlarmClock.setTime(tmpHr, tmpMin);
				break;
			case SET_ALARM:
				System.out.println("Enter the hour: ");
				tmpHr = consoleIn.nextInt();
				System.out.println("Enter the minute: ");
				tmpMin = consoleIn.nextInt();
				myAlarmClock.setAlarm(tmpHr, tmpMin);
				break;
			case GET_ALARM:
				System.out.println("The alarm is set for: " + myAlarmClock.getAlarm());
				break;
			case EXIT:
				// make keepGoing false to break out of the while
				keepGoing = false;
				break;
			case STEP:
				myAlarmClock.tick();
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
		consoleIn.close();
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
