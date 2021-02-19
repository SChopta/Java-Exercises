import java.util.Scanner;

public class JavaExercises2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 6. Write a Java program to print the sum (addition), multiply, subtract,
		 * divide and remainder of two numbers. Go to the editor Test Data: Input first
		 * number: 125 Input second number: 24 Expected Output : 125 + 24 = 149 125 - 24
		 * = 101 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5
		 */

		System.out.println("Input your first number: ");
		int num1 = input.nextInt();
		System.out.println("Input your second number: ");
		int num2 = input.nextInt();
		System.out.println("The sum of both numbers is " + num1 + num2);
		System.out.println("When both numbers are subtracted the product is: " + (num1 - num2));
		System.out.println("Multiplying both numbers gives us: " + num1 * num2);
		System.out.println("Dividing both numbers gives us: " + num1 / num2);
		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

		/*
		 * 7. Write a Java program that takes a number as input and prints its
		 * multiplication table upto 10. Go to the editor Test Data: Input a number: 8
		 * Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80
		 */
		int mynumber = input.nextInt();
		for(int i = 0; i<10; i++) {
			System.out.println(mynumber + " x " + (i+1) + " = " + (mynumber*i));
		}
		
		/*
		 * 8. Write a Java program to display the following pattern. Go to the editor
			Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
		 */
		
		System.out.println(	"  J    a   v     v  a ");
		System.out.println(	"  J   a a   v   v  a a   ");
		System.out.println("J  J  aaaaa   V V  aaaaa  ");
		System.out.println( "JJ  a     a   V  a     a");
		input.close();
		
		/*
		 * 9. Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
		 * Expected Output 2.138888888888889
		 */
		
		System.out.println((25.5*3.5-3.5*3.5)/(40.5 - 4.5));
		
		
			
	}
	
		
	
}
