/**
 * Clock with time and an alarm that can both be set. 
 * If the alarm and time are the same, the clock is ringing.
 * @author William
 *
 */
public class AlarmClock {

	/** Whether or not the alarm is going off */
	private boolean ringing;

	/** The time that the alarm will go off */
	private Time alarm;
	/** The current time that the clock is set to */
	private Time current;

	
	/**
	 * Set up for the class (called when you make a new alarm clock)
	 */
	public AlarmClock() {
		ringing = false;
		alarm = new Time();
		current = new Time();
	}
	
	
	
	
	
	public boolean isRinging( ) { return ringing; }
	
	
	
	
	
	
	
	
	
	private class Time {
		
		public Time() {
			setHour(0);
			setMinute(0);
		}
		
		private int hour;
		private int minute;
		
		public void setHour(int newHour) { hour = newHour % 12; }
		public int getHour() { return hour; }
		
		public void setMinute(int newMinute) { minute = newMinute % 60; }
		public int getMinute() { return minute; }
	}
	
}
