import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		// Gets input from user
		Scanner consoleIn = new Scanner(System.in);
		String nextLine;

		System.out.println("Hi, I'm an alarm clock! You can: ask me for time and stuff!");
		System.out.println("Ask me what time it is!");
		
		nextLine = consoleIn.nextLine();
		
		System.out.println("You asked for: " + nextLine);
	}

}
