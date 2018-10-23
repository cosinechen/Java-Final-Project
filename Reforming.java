import java.io.*;
import java.util.*;

class Reforming
{
	void display() throws IOException
	{
		Scanner s=new Scanner(System.in);
		
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
		
		String[] row1 = new String[i];
		String[] row2 = new String[i];
		String[] row3 = new String[i];
		String[] row4 = new String[i];
		String[] row5 = new String[i];
		
		for(int k=0;k<i;k++)
		{
			String str = myNewArray1[k];
			for(int j=0;j<i;j++)
			{
				String str1 = myArray1[j];
				if(str.equals(str1))
				{
					row2[k] = myArray2[j];
					row3[k] = myArray3[j];
					row4[k] = myArray4[j];
					row5[k] = myArray5[j];
				}
			}
		}
		String str=null ; 
		try{ 
		FileInputStream fis=new FileInputStream("data.txt"); 
		byte data[]=new byte[fis.available()]; 
		fis.read(data); 
		str=new String(data); 
		fis.close(); 
		}
		catch(IOException ex){
			
		} 
		
		try{ 
		FileWriter fw=new FileWriter("data.txt");
		if(doing==1)
		{
			for(int k=0;k<i;k++)
			{
				fw.write(myNewArray1[k]+"\t\t"+row2[k]+"\t\t"+row3[k]+"\t"+row4[k]+"\t\t"+row5[k]+"\r\n");
			}	
			fw.close();
		}
		else if(doing==2)
		{
			Arrays.sort(myNewArray1, Collections.reverseOrder());
			
			for(int a=0;a<i;a++)
			{
				String str2 = myNewArray1[a];
				for(int b=0;b<i;b++)
				{
					String str1 = myArray1[b];
					if(str2.equals(str1))
					{
						row2[a] = myArray2[b];
						row3[a] = myArray3[b];
						row4[a] = myArray4[b];
						row5[a] = myArray5[b];
					}
				}
			}
					
			for(int k=0;k<i;k++)
			{
				fw.write(myNewArray1[k]+"\t\t"+row2[k]+"\t\t"+row3[k]+"\t"+row4[k]+"\t\t"+row5[k]+"\r\n");
			}	
			fw.close();	
		}	
		}
		catch(IOException ex){} 
		
		System.out.println("Do you want to go back to Mainmenu?");
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