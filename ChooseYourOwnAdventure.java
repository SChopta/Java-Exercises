import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO  MITCHELL'S TINY ADVENTURE!");
System.out.println("You are in a creepy house! Would you like to go " + "upstairs" + " or into the " + "kitchen?");		
		Scanner input = new Scanner(System.in);
		String floorlv = input.nextLine();
		if(floorlv.equalsIgnoreCase("kitchen"))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side \nthere is, as you'd expect, a refrigerator. You may open the " + "refrigerator" + "\nor look in a " + "cabinet.");
		}
		else {
			System.out.println("Upstairs you see a hallway. At the end of the hallway is the master bedroom. There is also a bathroom off the hallway. Where would you like to go?");
		}
		
		String hallway = input.nextLine();
		if(hallway.equalsIgnoreCase("bedroom"))
		{
			System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The \nbed is unmade. In the back of the room, the closet door is ajar. Would \n you like to open the door?(yes or no?)");
		}
		else
		{
			System.out.println("Oh dear there's a zombie in the bathroom. Game over.");
		}
		
		String opendoor1=input.nextLine();
		if(opendoor1.equalsIgnoreCase("no"))
		{
			System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements.");
		}
			
			
		String refrigerator1 = input.nextLine();
		if(refrigerator1.equalsIgnoreCase("refrigerator"))
		{
			System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. \nWould you like to eat some of the food? ( "+ "yes"+" or" + " no"+" )");
		}
		else
		{
			System.out.println("You open the cabinet and a mummy drags your in...the end.");
		}
		String yesno = input.nextLine();
		
		if(yesno.equalsIgnoreCase("yes"))
		{
			
		}
		
		else
		{
			System.out.println("You die of starvation eventually...");
		}
		
		
	}

}
