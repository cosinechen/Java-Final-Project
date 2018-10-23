import java.io.*;
import java.util.*;
import java.lang.*;

class CheckTel
{
	void check() throws IOException
	{
		Scanner s=new Scanner(System.in);
		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		String delimiter="\t| ";;
		
		while((line=br.readLine())!=null)
		{
			StringTokenizer tokens = new StringTokenizer(line,delimiter);
			
			String b=tokens.nextToken();
			String c=tokens.nextToken();
			String d=tokens.nextToken();
			String e=tokens.nextToken();
			String f=tokens.nextToken();
					
					int a=Integer.parseInt(d);
					if(tokens.countTokens()==2)
					{	
						if(d.substring(0,1).equals("02")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Taipei.");}
						else if(d.substring(0,1).equals("03")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Taoyuan or Hsinchu or Hualien or Ilan.");}
						else if(d.substring(0,2).equals("037")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Miaoli.");}
						else if(d.substring(0,1).equals("04")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Taichung or Changhua.");}
						else if(d.substring(0,2).equals("049")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Nantou.");}
						else if(d.substring(0,1).equals("05")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Chiayi Yunlin.");}
						else if(d.substring(0,1).equals("06")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Tainan or Penghu.");}
						else if(d.substring(0,1).equals("07")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Kaohsiung.");}
						else if(d.substring(0,1).equals("08")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Pingtung.");}
						else if(d.substring(0,2).equals("082")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Kinmen or Wuqiu or Dongsha/Nansha Islands.");}
						else if(d.substring(0,2).equals("089")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Taitung.");}
						else if(d.substring(0,3).equals("0836")){
							System.out.println(d);
							System.out.println("Maybe the phone is from Matsu.");}
						else if(d.substring(0,1).equals("09")&&d.length()==10){
							System.out.println(d);
							System.out.println("Maybe it is celephone number.");}
						else 
							System.out.println("Other areas or wrong numbers.");
					}
						
				
		}
		
		System.out.println("Do you want to go back to Mainmenu?");
		System.out.println("1.Yes	2.No");
		
		int num=s.nextInt();
		if(num==1)
		{}
		else if(num==2)
		{
			check();
		}
		else
			System.out.println("Wrong number.");
		
		fr.close();
	}
}
/*02 Taipei
03 Taoyuan Hsinchu Hualien Ilan
037 Miaoli
04 Taichung Changhua
049 Nantou
05 Chiayi Yunlin
06 Tainan Penghu
07 Kaohsiung
08 Pingtung
082 Kinmen Wuqiu Dongsha/Nansha Islands
089 Taitung
0836 Matsu
if tel.length=10
tel.substring(0,1).equals("09")
cellphone*/