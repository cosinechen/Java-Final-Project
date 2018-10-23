import java.io.*;
import java.util.*;

class PageAll
{	
	void show() throws IOException
	{
		Scanner s=new Scanner(System.in);
		Scanner inputStream = null;
		inputStream = new Scanner(new FileInputStream("data.txt"));
		
		ArrayList<String> myarray1 = new ArrayList<String>();
		ArrayList<String> myarray2 = new ArrayList<String>();
		ArrayList<String> myarray3 = new ArrayList<String>();
		ArrayList<String> myarray4 = new ArrayList<String>();
		ArrayList<String> myarray5 = new ArrayList<String>();
		
		while(inputStream.hasNext())
		{	
			String b1 = inputStream.next(); 
			myarray1.add(b1);
			String b2 = inputStream.next(); 
			myarray2.add(b2);
			String b3 = inputStream.next(); 
			myarray3.add(b3);
			String b4 = inputStream.next(); 
			myarray4.add(b4);
			String b5 = inputStream.next(); 
			myarray5.add(b5);
		}
		 
		int i = myarray1.size();
		
		String[] myArray1 = (String[]) myarray1.toArray(new String[0]);
		String[] myArray2 = (String[]) myarray2.toArray(new String[0]);
		String[] myArray3 = (String[]) myarray3.toArray(new String[0]);
		String[] myArray4 = (String[]) myarray4.toArray(new String[0]);
		String[] myArray5 = (String[]) myarray5.toArray(new String[0]);
		
		int n=0;
		while(true)
		{				
			System.out.println(myArray1[n]+"\t"+myArray2[n]+"\t"+myArray3[n]+"\t"+myArray4[n]+"\t"+myArray5[n]);
			n++;
			if(n%10==0)
			{
				System.out.println("Next page?(1.yes 2.no)");
				int a = s.nextInt();
				if(a==2)
				break;
			}
				if(n>=i) break;
		}
				
		System.out.println("Do you want to go back to Mainmenu?");
		System.out.println("1.Yes	2.No");
		
		int num=s.nextInt();
		if(num==1)
		{}
		else if(num==2)
		{
			show();
		}
		else
			System.out.println("Wrong number.");
		
	}
}		