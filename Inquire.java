import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

class Inquire
{
	void search() throws IOException
	{
		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		Scanner s=new Scanner(System.in);
		String line,Token;
		String delimiter="\t";
		System.out.println("Which sort do you want to see?");
		System.out.println("Name or Telephone");
		String find=s.next();
		if(find.equalsIgnoreCase("Name"))
		{
			System.out.println("Enter the name.");
			String a=s.next();
			System.out.println("Name\t\tBirthday\t\tTelephone\tClassification\t\tE-mail");
			
			while((line=br.readLine())!=null)
			{
			StringTokenizer tokens = new StringTokenizer(line,delimiter);
			
				for(int i=0;i<5;i++)
				{	
					Token=tokens.nextToken();
					if(tokens.countTokens()==4&&Token.equals(a))
					System.out.println(line);
				
					/*else if(!(Token.equals(a)))
					{
					System.out.println("Can't find the object.");
					}*/
					
				}	
			
			}
			
		}
		else if(find.equalsIgnoreCase("Telephone")||find.equalsIgnoreCase("Tel")||find.equalsIgnoreCase("Phone"))
		{	
			System.out.println("Enter the phone number.");
			String b=s.next();
			System.out.println("Name	Birthday	Telephone	Classification	E-mail");
			while((line=br.readLine())!=null)
			{
			StringTokenizer tokens = new StringTokenizer(line,delimiter);
			
				for(int i=0;i<5;i++)
				{	
					Token=tokens.nextToken();
					if(tokens.countTokens()==2&&Token.equals(b))
					System.out.println(line);
					/*else if(!(Token.equals(b)))
					{
					System.out.println("Can't find the object.");
					}*/
				}	
			}	
		}
		else 
		{
			System.out.println("Can't find the sort.");
		}
		System.out.println("Do you want to go back to Mainmenu?");
		System.out.println("1.Yes	2.No");
		
		int num=s.nextInt();
		if(num==1)
		{}
		else if(num==2)
		{
			search();
		}
		else
			System.out.println("Wrong number.");
		
		fr.close();
		
	}
}