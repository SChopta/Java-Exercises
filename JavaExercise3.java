import java.util.Scanner;

public class JavaExercise3 {

	private static final double radius = 7.5;

	public static void main(String[] args) {

		/*
		 * 11. Write a Java program to print the area and perimeter of a circle. Go to
		 * the editor Test Data: Radius = 7.5 Expected Output Perimeter is =
		 * 47.12388980384689 Area is = 176.71458676442586
		 */
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;

		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);

		// 12. Write a Java program that takes three numbers as input to calculate and
		// print the average of the numbers
		Scanner input = new Scanner(System.in);

		System.out.println("Input your first number: ");
		int num1 = input.nextInt();

		System.out.println("Input your second number: ");
		int num2 = input.nextInt();

		System.out.println("Input your third number: ");
		int num3 = input.nextInt();

		int average = (num1 + num2 + num3) / 3;
		System.out.println("The average of all the numbers is: " + average);

		/*
		 * 13. Write a Java program to print the area and perimeter of a rectangle. Go
		 * to the editor Test Data: Width = 5.5 Height = 8.5
		 */

		double area1 = (5.5 * 8.5);
		double perimeter1 = (5.5 * 2) + (8.5 * 2);
		System.out.println("The area is: " + area1 + " The perimeter is: " + perimeter1);

		// 15. Write a Java program to swap two variables. Go to the editor
		int a, b, temp;
		a = 15;
		b = 27;
		System.out.println("Before swapping : a, b = " + a + ", " + +b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : a, b = " + a + ", " + +b);

		/*
		 * 16. Write a Java program to print a face. Go to the editor Expected Output
		 */
		System.out.println(" +\"\"\"\"\"+  ");
		System.out.println("[| o o |]  ");
		System.out.println(" |  ^  |  ");
		System.out.println(" | '-' | ");
		System.out.println(" +-----+");

		/*
		 * Write a Java program to compare two numbers. Go to the editor Input Data:
		 * Input first integer: 25 Input second integer: 39 Expected Output
		 * 
		 * 25 != 39 25 < 39 25 <= 39
		 * 
		 */
		int number1;
		int number2;

		System.out.println("Input first integer: ");
		number1 = input.nextInt();

		System.out.println("Input second integer: ");
		number2 = input.nextInt();

		if (number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		/*
		 * print...s = format string d=format decimal integers f=format floating point
		 * numbers t=formats date/time values In a formatted string (mostly likely used
		 * in the context of printf()), %d means that an int value is expected at that
		 * position in the string, but that the value will be specified in the following
		 * comma-separated parameters. For example, doing this:
		 * printf("%d + %d = %d", 1, 2, 3);
		 */
		
		if(number1 !=number2)
			System.out.printf("%d !=%d\n", number1, number2 );
		
		if(number1 < number2)
			System.out.println("%d < =%d\\n\", number1, number2");
		
		if(number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		
		if (number1 >=number2)
			System.out.printf("%d >=%d\n", number1, number2);
	}

}
