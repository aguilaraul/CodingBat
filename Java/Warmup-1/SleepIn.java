/*
 * The parameter weekday is true is it is a weekday, and the parameter
 * vacation is true if we are on vacation. We sleep in if it is not a weekday
 * or we're on vacation. Return true if we sleep in.
 */
public class SleepIn {
	public static void main(String[] args) {
		System.out.println(sleepIn(false, false));
		System.out.println(sleepIn(true, false));
		System.out.println(sleepIn(false, true));
		System.out.println(sleepIn(true, true));
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return (!weekday || vacation);
	}
}
