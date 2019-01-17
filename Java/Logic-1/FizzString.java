/*
 * Given a string str, if the string starts with "f" return "Fizz".
 * If the string ends with "b" return "Buzz". If both the "f" and
 * "b" conditions are true, return "FizzBuzz". In all other cases,
 * return the string unchanged.
 */
public String fizzString(String str) {
	 String result = "";
	 
	 if(str.charAt(0) == 'f') result += "Fizz";
	 if(str.charAt(str.length()-1) == 'b') result += "Buzz";
	 
	 if(result.length() != 0) return result;
	 return str;
 }
