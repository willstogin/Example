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
	
	
	
	
	/** 
	 * Tells whether or not the alarm is ringing.
	 * @return boolean: whether the alarm is ringing.
	 */
	public boolean isRinging( ) { return ringing; }
	
	/**
	 * Gets the current time in string form
	 * @return String: "hour:minute"
	 */
	public String getTime( ) {
		return String.format("%d:%d", current.getHour(), current.getMinute());
	}
	
	/**
	 * Gets the alarm time in string form
	 * @return String: "hour:minute"
	 */
	public String getAlarm() {
		return String.format("%d:%d", alarm.getHour(), alarm.getMinute());
	}
	
	/**
	 * Sets the current time to be the hour and minute specified.
	 * @param hour
	 * @param minute
	 */
	public void setTime(int hour, int minute) {
		current.setHour(hour);
		current.setMinute(minute);
	}
	
	/**
	 * Sets the alarm time to be the hour and minute specified
	 * @param hour int
	 * @param minute int
	 */
	public void setAlarm(int hour, int minute) {
		alarm.setHour(hour);
		alarm.setMinute(minute);
	}
	
	
	
	
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
