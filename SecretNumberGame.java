import java.util.Scanner;
public class SecretNumberGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int luckyNumber = 7;
		System.out.println("This is the worst guessing game ever!!!");
		System.out.println("I'm thinking of a number from 1-10. Try to guess it. I bet you can't!");
		int guessNumber = input.nextInt();
		if(guessNumber==luckyNumber)
		{
			System.out.println("LOL great you got it! Good job you win! There is no prize though, because I'm cheap.");
		}
		else if(guessNumber!=luckyNumber)
		{
			System.out.println("Nope that's not the number, too bad! The real secret number was actually "+ luckyNumber);
		}
	}

}
