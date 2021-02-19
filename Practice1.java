import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) 
	{
		//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
		//Expected Output :
		//Hello
		//Alexandra Abramov
		
		Scanner input = new Scanner(System.in);
		
		/*2. Write a Java program to print the sum of two numbers. Go to the editor
		Test Data:
		74 + 36
		Expected Output :
		110*/
		System.out.println("Input the first number ");
		int num1 = input.nextInt();
		System.out.println("Input the second number: ");
		int num2 = input.nextInt();
		System.out.println("The sum of the two numbers is ");
		int sum = num1 + num2;
		System.out.println(sum);
		
		/*3. Write a Java program to divide two numbers and print on the screen. Go to the editor
		Test Data :
		50/3
		Expected Output :
		16*/
		
		System.out.println("Input the first number you want to divide ");
		int dividenum = input.nextInt();
		System.out.println("Input the second number you want to divide by ");
		int dividenum2 = input.nextInt();
		int output = dividenum/dividenum2; 
		System.out.println("The output is " + output);
		
		/*
		 * 4. Write a Java program to print the result of the following operations. Go to the editor
		Test Data:
		a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3
		Expected Output :
		43
		1
		19
		13*/
		
		int a = -5 + 8 *6;
		int b = (55+9) % 9;
		int c = 20 + -3*5/8;
		int d = 5 + 15/3*2 -8% 3;
		System.out.println("The expected output is " + "\n" + a + "\n" + b + "\n" + c + "\n" + d);
	
		/*5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
		Test Data:
		Input first number: 25
		Input second number: 5
		Expected Output :
		25 x 5 = 125*/
		 
		System.out.println("Input the first number ");
		int firstnum = input.nextInt();
		System.out.println("Input the second number ");
		int secondnum = input.nextInt(); 
		int output1 = firstnum * secondnum;
		System.out.println("The product of both numbers is " + output1);
	}
	
}
