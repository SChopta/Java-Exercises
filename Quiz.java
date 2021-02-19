import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		System.out.println("Q1) What is the capital of Alaska?"+ "\n1) Melbourne"+ "\n2)Anchorage"+"\n3)Juneau");
		int answer1=input.nextInt();
		if(answer1==3)
		{
			score++;
			System.out.println("That's right!\n");
		}
		else {
			System.out.println("That's incorrect.");
		}
		
		System.out.println("Q2) Can you store the value" +" cat " + "in a variable of type int?"+ "\n1) Yes"+ "\n2)No");
		
		int answer2=input.nextInt();
		
		if(answer2==2)
			{  
			score++;
			System.out.println("Yes, That's correct!");
			}
		else {
			System.out.println("Sorry," + " cat "+ "is a string. ints can only store numbers." );
		}
		
		System.out.println("Q3) What is the result of 9+6/3? \n1) 5\n2) 11\n3) 15/3");
		
		int answer3 = input.nextInt();
		
		if(answer3==2)
		{
			score++;
			System.out.println("That's correct!");
		}
		else {
			System.out.println("That's incorrect.");
		}
			
		System.out.println("Your score is " + score + " out of 3.");
		
	}

}
