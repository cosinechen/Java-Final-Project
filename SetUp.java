import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class SetUp
{
	void create() throws IOException{
	System.out.println("Name	Birthday	Telephone	Classification	E-mail");
	PrintWriter outputStream=null;
	try
	{
		outputStream = new PrintWriter (new FileOutputStream("data.txt",true));
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Error opening the file.");
		System.exit(0);
	}
	Scanner k = new Scanner(System.in);
	
	String name=k.next();
	for(int i=0;i<name.length();i++)
	{
		if(name.charAt(i)>=65&&name.charAt(i)<=90||name.charAt(i)>=97&&name.charAt(i)<=122)
		{
		}
		else
		{
			System.out.println("The name can't include other character.");
			System.exit(0);
		}
	}
	
	String birth=k.next();
	int birthday=Integer.parseInt(birth);
	int month=birthday/100;
	int day=birthday%100;
	for(int i=0;i<birth.length();i++)
	{
		if(birth.charAt(i)>=48&&birth.charAt(i)<=57)
		{
			if(month>0&&month<=12&&day>0&&day<=31)
			{
				if(month==1||month==3||month==5||month==7||month==8||month==10||month==12&&day<=31)
				{
				
				}
				else if(month==4||month==6||month==9||month==11&&day<=30)
				{
				
				}
				else if(month==2&&day<=29)
				{
				
				}
				else
				{	
				System.out.println("The day is out of range."); 
				}
			}
			else
			{	
				System.out.println("The day is out of range."); 
			}
		}
		else
		{
			System.out.println("The month and day are out of the correct range.");
			System.exit(0);
		}
	}
	
	String telephone=k.next();
	for(int i=0;i<telephone.length();i++)
	{
		if(telephone.charAt(i)>=40&&telephone.charAt(i)<=41||telephone.charAt(i)>=48&&telephone.charAt(i)<=57)
		{
			
		}
		else
		{
			System.out.println("The tel must be number or ( )");
			System.exit(0);
		}
	}
	
	String category=k.next();
	for(int i=0;i<category.length();i++)
	{
		if(category.charAt(i)>=65&&category.charAt(i)<=90||category.charAt(i)>=97&&category.charAt(i)<=122)
		{
			
		}
		else
		{
			System.out.println("The classification must be letters.");
			System.exit(0);
		}
	}
	
	String email=k.next();
	for(int i=0;i<email.length();i++)
	{
		if(email.matches("(([A-Za-z0-9]+\\.?)+([A-Za-z0-9]+_?)+)+[A-Za-z0-9]+@([a-zA-Z0-9]+\\.)+(com|edu|gov)(\\.(tw|ch|hk))?"))
		{
		}
		else
		{
			System.out.println("Please enter the correct e-mail format.");
			create();
			//System.exit(0);
		}
	}
	outputStream.printf(name+"\t\t"+birth+"\t\t"+telephone+"\t"+category+"\t\t"+email+"\r\n");
	outputStream.close();
	}
}