import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.*;

class ShowSort
{
	void display() throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1.Name 2.Birthday 3.Telephone 4.Classification 5.E-mail");
		System.out.println("What sort do you want to use?");
		int thesort=s.nextInt();
		System.out.printf("1.Increasing arrangement\r\n2.Descending arrangement\r\n");
		int doing=s.nextInt();
	
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

		String[] myNewArray1 = new String[i];
		String[] myNewArray2 = new String[i];
		String[] myNewArray3 = new String[i];
		String[] myNewArray4 = new String[i];
		String[] myNewArray5 = new String[i];

		for(int n=0;n<i;n++)
		{
			String a1=myArray1[n];
			String a2=myArray2[n];
			String a3=myArray3[n];
			String a4=myArray4[n];
			String a5=myArray5[n];
			
			myNewArray1[n]=a1;
			myNewArray2[n]=a2;
			myNewArray3[n]=a3;
			myNewArray4[n]=a4;
			myNewArray5[n]=a5;
		}
		
			Arrays.sort(myNewArray1);
			Arrays.sort(myNewArray2);
			Arrays.sort(myNewArray3);
			Arrays.sort(myNewArray4);
			Arrays.sort(myNewArray5);
		
		if(thesort==1)
		{
			System.out.println("*Name");
			if(doing==1)
			{	
				for(int j=0;j<i;j++)
				{
				System.out.println(myNewArray1[j]);
				}
			}
			else if(doing==2)
			{
				Arrays.sort(myNewArray1, Collections.reverseOrder());
				for(int j=0;j<i;j++)
				{
					System.out.println(myNewArray1[j]);
				}
			}
			else
				System.out.println("Wrong number.");
		}
		if(thesort==2)
		{
			System.out.println("*Birthday");
			if(doing==1)
			{	
				for(int j=0;j<i;j++)
				{
				System.out.println(myNewArray2[j]);
				}
			}
			else if(doing==2)
			{
				Arrays.sort(myNewArray2, Collections.reverseOrder());
				for(int j=0;j<i;j++)
				{
					System.out.println(myNewArray2[j]);
				}
			}
			else
				System.out.println("Wrong number.");
		}
		if(thesort==3)
		{
			System.out.println("*Telephone");
			if(doing==1)
			{
				for(int j=0;j<i;j++)
				{
				System.out.println(myNewArray3[j]);
				}
			}
			else if(doing==2)
			{
				Arrays.sort(myNewArray3, Collections.reverseOrder());
				for(int j=0;j<i;j++)
				{
					System.out.println(myNewArray3[j]);
				}
			}
			else
				System.out.println("Wrong number.");
		}
		if(thesort==4)
		{
			System.out.println("*Classification");
			if(doing==1)
			{
				for(int j=0;j<i;j++)
				{
				System.out.println(myNewArray4[j]);
				}
			}
			else if(doing==2)
			{
				Arrays.sort(myNewArray4, Collections.reverseOrder());
				for(int j=0;j<i;j++)
				{
					System.out.println(myNewArray4[j]);
				}
			}
			else
				System.out.println("Wrong number.");
		}
		if(thesort==5)
		{
			System.out.println("*E-mail");
			if(doing==1)
			{
				for(int j=0;j<i;j++)
				{
				System.out.println(myNewArray5[j]);
				}
			}
			else if(doing==2)
			{
				Arrays.sort(myNewArray5, Collections.reverseOrder());
				for(int j=0;j<i;j++)
				{
					System.out.println(myNewArray5[j]);
				}
			}
			else
				System.out.println("Wrong number.");
		}
		
		System.out.println("Do you want to go back to the Mainmenu?");
		System.out.println("1.Yes	2.No");
		int num=s.nextInt();
		if(num==1)
		{}
		else if(num==2)
		{
			display();
		}
		else
			System.out.println("Wrong number.");
	}
}