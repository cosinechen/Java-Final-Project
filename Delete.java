import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.lang.NullPointerException;

class Delete
{
	void set() throws IOException
	{
		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		Scanner s=new Scanner(System.in);
		String line,Token;
		String newline="";
		String delimiter="\t";
		System.out.println("Which person do you want to delete?");
		String p=s.next();
		
		while((line=br.readLine())!=null)
		{
			StringTokenizer tokens = new StringTokenizer(line,delimiter);
			
				for(int i=0;i<5;i++)
				{	
					Token=tokens.nextToken();
					if(tokens.countTokens()==4&&Token.equals(p))
					{	
						line = "";
					}
					else{}
						
				}
				if(!line.equals(""))
					newline=newline+line+"\r\n";
		}
		FileWriter fw=new FileWriter("data.txt");
		fw.write(newline);
		System.out.println(newline);
		
		fw.close();
		
		System.out.println("Do you want to go back to Mainmenu?");
		System.out.println("1.Yes	2.No");
		
		int num=s.nextInt();
		if(num==1)
		{}
		else if(num==2)
		{
			set();
		}
		else
			System.out.println("Wrong number.");
		
		fr.close();
		
	}
}