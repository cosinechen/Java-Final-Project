import java.io.*;
import java.util.*;

class PageSort
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
		
		while(true)
		{	
			System.out.println("1.Name 2.Birthday 3.Telephone 4.Classification 5.E-mail");
			int num = s.nextInt();
		
		if(num==1)
		{
			int n=0;
			while(true)
			{				
				System.out.println(myArray1[n]);
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
			System.out.println("Continue checking?(1.yes 2.no)");
			int ans = s.nextInt();
			if(ans==2) break;
		}
		
		else if(num==2)
		{
			int n=0;
			while(true)
			{
				System.out.println(myArray2[n]);
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
			System.out.println("Continue checking?(1.yes 2.no)");
			int ans = s.nextInt();
			if(ans==2) break;
		}	
		else if(num==3)
		{
			int n=0;
			while(true)
			{
				System.out.println(myArray3[n]);
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
			System.out.println("Continue checking?(1.yes 2.no)");
			int ans = s.nextInt();
			if(ans==2) break;
		}
		else if(num==4)
		{
			int n=0;
			while(true)
			{
				System.out.println(myArray4[n]);
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
			System.out.println("Continue checking?(1.yes 2.no)");
			int ans = s.nextInt();
			if(ans==2) break;
		}
		else if(num==5)
		{
			int n=0;
			while(true)
			{
				System.out.println(myArray5[n]);
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
			System.out.println("Continue checking?(1.yes 2.no)");
			int ans = s.nextInt();
			if(ans==2) break;
		}
		
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