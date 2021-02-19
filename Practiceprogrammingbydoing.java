import java.util.Scanner;
public class Practiceprogrammingbydoing {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("Hello what is your name?");
		String name = input.nextLine();
		System.out.println("Ok " + name + ", how old are you?");
		int age = input.nextInt();
		
		if(age<16)
		{
			System.out.println("You can't drive.");
			 if(age<18)
			 {
				 System.out.println("You can't vote.");
				 
				 if(age<25)
				 {
					 System.out.println("You can't rent a car.");
				 }
				 
				
				 
			 }
			 
		
		}
		
	}

}
