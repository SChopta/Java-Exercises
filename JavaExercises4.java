import java.util.Scanner;

public class JavaExercises4 {

	public static void main(String[] args) {
		/*
		 * Write a Java program and compute the sum of the digits of an integer. Go to
		 * the editor Input Data: Input an integer: 25 Expected Output
		 * 
		 * The sum of the digits is: 7
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");
		char[] letters = scanner.nextLine().toCharArray();
		System.out.println("Reverse string: ");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);

		}
		System.out.print("\n");

		/*
		 * Write a Java program to count the letters, spaces, numbers and other
		 * characters of an input string. Go to the editor Expected Output
		 * 
		 * The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 letter: 23
		 * space: 9 number: 10 other: 6
		 */

		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}

	public static void count(String x) {
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		System.out.println("The string is: \"Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33\";");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);

		/*
		 * Write a Java program to create and display unique three-digit number using 1,
		 * 2, 3, 4. Also count how many three-digit numbers are there. Go to the editor
		 * Expected Output
		 * 
		 * 123 124 ...
		 * 
		 * 431 432 Total number of the three-digit-number is 24
		 */
		// the count function counts letters, spaces, characters, numbers of an input
		// String.
		
		int amount = 0;
		for(int i =1; i<= 4; i++) {
			for(int j =1; j<=4; j++) {
				for(int k = 1; k<=4; k++) {
					if(k !=i && k !=j && i !=j) {
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);
		//you can use nested for loops to generate random numbers in a set range.
	}

}
