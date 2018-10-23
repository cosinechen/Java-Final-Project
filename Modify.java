import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

class Modify
{
	void fix() throws IOException
	{
		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		Scanner s=new Scanner(System.in);
		String line,Token;
		String newline="";
		String delimiter="\t";
		System.out.println("Which person do you want to modify?");
		String p=s.next();
		
		while((line=br.readLine())!=null)
		{
			StringTokenizer tokens = new StringTokenizer(line,delimiter);
			
				for(int i=0;i<5;i++)
				{	
					Token=tokens.nextToken();
					if(tokens.countTokens()==4&&Token.equals(p))
					{	
						System.out.println("What do you want to modify?");
						String thing=s.next();
						System.out.println("What do you want to substitute it?");
						String newthing=s.next();
						line = line.replaceAll(thing,newthing);
						
					}
					/*else{
						System.out.println("The name is wrong.");
					}*/
						
				}
				newline=newline+line+"\r\n";
		}
		
		FileWriter fw=new FileWriter("data.txt");
		//System.out.println(newline);
		fw.write(newline);
		fw.close();
		
		System.out.println("Do you want to go back to Mainmenu?");
		System.out.println("1.Yes	2.No");
		
		int num=s.nextInt();
		if(num==1)
		{}
		else if(num==2)
		{
			fix();
		}
		else
			System.out.println("Wrong number.");
		
		fr.close();
		
	}
}