import java.util.Scanner;
import java.io.IOException;

public class Demo
{
	public static void main(String[] args) throws IOException
	{	
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter your account number.");
		String IDnum=k.nextLine();
		System.out.println("Please enter your password.");
		String passwd=k.nextLine();
		if(IDnum.equals("cis")&&passwd.equals("1234"))
		{
			MainMenu menu=new MainMenu();
			menu.choose();
		}
			
		else
		{
			System.out.println("Your account number or password is wrong.");
			System.exit(0);
		}
	}
}