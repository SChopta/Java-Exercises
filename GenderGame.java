import java.util.Scanner;
public class GenderGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your gender?: ");
		String gender = input.next(); 
		System.out.println("First name: ");
		String firstName = input.next();
		System.out.println("Last name: ");
		String lastName = input.next();
		System.out.println("Age: ");
		int age = input.nextInt();
		
		if(gender.equals("m"))
		{
			if(age>=20)
			{
				System.out.println("I shall call you Mr. " + lastName);
				
			}
			else if(age<20)
			{
				System.out.println("The I shall call you " +firstName+lastName);
			}
		}
		
		if(gender.equals("f"))
		{
			if(age>=20)
			{
				System.out.println("Are you married, " + firstName +" (y or n)?");
				String maritalStatus = input.next();
				
			if(maritalStatus.equals("y"))
			{
			 System.out.println("I shall call you Mrs. "+ lastName );
			}
		
			else if(maritalStatus.equals("n")) 
			{
				System.out.println("Then I shall call you Ms. " + lastName);
			}
		else if(age<20)
		{
				System.out.println("Then I shall call you "+ firstName + "" + lastName);
			}
			
			}
			
		}
	}

}
/*
	https://github.com/CRadu/exercises_java/blob/master/src/main/java/programmingByDoing/ifStatements/GenderGame.java	
	for solution can't understand the last portion of if statement
*/
