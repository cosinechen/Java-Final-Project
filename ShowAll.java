import java.io.*;
import java.util.*;

class ShowAll
{
	void show() throws IOException
	{
		Scanner s=new Scanner(System.in);
		
		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		System.out.println("Name\t\tBirthday\tTelephone\tClassification\tE-mail");
		while((line=br.readLine())!=null)
		{	
			System.out.println(line);
		}
		
		fr.close();
	}
}