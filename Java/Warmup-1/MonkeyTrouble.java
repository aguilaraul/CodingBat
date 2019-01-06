/*
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
 * if each is smiling. We are in trouble if they are both smiling or if neither
 * of them is smiling. Return true if we are in trouble
 */
public class MonkeyTrouble {
	public static void main(String[] args) {
		System.out.println(monkeyTrouble(true, true)); //true
		System.out.println(monkeyTrouble(false, false)); //true
		System.out.println(monkeyTrouble(true, false)); //false
		System.out.println(monkeyTrouble(false, true)); //false
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile && bSmile || (!aSmile && !bSmile));
	}
}
