import java.util.Scanner;
public class BMICategories {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your height in metres: ");
		double height = input.nextDouble();
		
		System.out.println("Input your weight in pounds: ");
		double weight = input.nextDouble();
		
		double BMI = (weight/height);
		System.out.println("Your BMI is: "+ BMI );
		
		if(BMI<15.0)
		{
			System.out.println("very severely underweight");
		}
		else if(BMI<=16.0 &&BMI>=15.0)
		{
			System.out.println("severely underweight");
		}
		else if(BMI<=18.4 &&BMI>=16.1)
		{
			System.out.println("Underweight");
		}
		else if(BMI>=18.5 && BMI<=24.9)
		{
			System.out.println("Normal Weight");
		}
		else if(BMI<=29.9&&BMI>=25.0)
		{
			System.out.println("Overweight");
		}
		else if(BMI>=30&&BMI<=34.9)
		{
			System.out.println("Moderately Obese");
		}
		else if(BMI>=39.9&&BMI<=35)
		{
			System.out.println("Severely Obese");
		}
		
		
	}

}
