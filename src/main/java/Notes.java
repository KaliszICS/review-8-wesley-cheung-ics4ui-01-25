
class Notes {
	public static void main(String[] args) {

		//else if

		int num;
		num = 9;

		if (num > 10) { // num > 10
			System.out.println("if");
		}
		else if (num > 8) { // num <= 10 && num > 8
			System.out.println("else if 1");
		}
		else if (num > 4) { // num <= 10 && num <= 8 && num > 4
			//num <= 8 && num > 4
			System.out.println("else if 2");
		}
		else { // nun <= 10  && num <= 8 && num <= 4
			//num <= 4
			System.out.println("else");
		}

		//

		if (num > 10) { //num > 10
			System.out.println("if");
		}
		else if (num > 12) { //num <= 10 && num > 12
			//UNREACHABLE ELSE IF STATEMENT
			System.out.println("else if");
		}
			//could have more as many else ifs as i need
		else {
			System.out.println("else");
		}

		//Try to order your ifs, else ifs in the order of smallest set of data to largest set of data
	
		//nested ifs - putting an if inside another if

		if (num > 8) {
			System.out.println("first if statement ran");
			if (num < 10) { //if num > 8 && num < 10
				System.out.println("both ifs ran");
			}
			else if (num == 15) { //num == 15 && num > 8
				System.out.println("num is 15");
			}
			else { // num >= 10 && num != 15 && num > 8
				System.out.println("if and else ran");
			}
		}

		//repeated condition - nest each of them
		//Step by step checks
		//code between the conditions

		// if () {
		// 	if () {
		// 		if () {
		// 			if () {
		// 				if () {
		// 					if () {

		// 					}
		// 				}
		// 			}
		// 		}
		// 	}
		// }

		//break into functions
		//combine conditions
		//Guard clauses can be used to avoid nested ifs.  Look it up!
	}
}
