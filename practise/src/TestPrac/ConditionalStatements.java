package TestPrac;
import java.util.Scanner;

public class ConditionalStatements {
	
public static void main(String args[])
{
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter y/n:");
	char resp = s1.nextLine().charAt(0);
	if (resp == 'y')
	{
		System.out.println("You Entered Yes");
	}
	else
	{
		System.out.println("You Eneterd No");
	}
	s1.close();
}

		
	}


