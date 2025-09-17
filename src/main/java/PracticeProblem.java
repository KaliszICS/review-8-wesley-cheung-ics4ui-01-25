public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String input) {
		input = input.toLowerCase();
		int length = input.length();
		if (length < 1) {
			return "s";
		} else if (length < 2) {
			if (input.substring(0).equals("y")) {
				return "ies";

			} else {
				return "s";
			}
			
		} else if (length < 3) {
			if (input.substring(0).equals("ey")) {
				return "eys";

			} else if (input.substring(1).equals("y")) {
				return "ies";
			} else {
				return "s";
			}
		} else {
			if (input.substring(length-2).equals("ey")) {
				return "eys";
			} else if (input.substring(length-1).equals("y")) {
				return "ies";
			} else if (input.substring(length-3).equals("ife")) {
				return "ives";
			} else {
				return "s";
			}
		}
		
	}
	public static int min(int num1, int num2, int num3) {
		return(Math.min(Math.min(num1,num2),num3));
	}
	public static boolean isLeapYear(int num1) {
		if (num1 % 4 == 0) {
			if (num1 % 100 == 0) {
				if (num1 % 400 == 0) {
					return true;
				}	else {
					return false;
				}
			}	else {
				return true;
			}
		}	else {
			return false;
		}
	}

}
