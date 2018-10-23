import java.util.Scanner;
import java.io.IOException;

public class MainMenu
{
	void choose() throws IOException{
	System.out.println("--------------------------------------------------------");
	System.out.println("Please enter the number,choose the features you want.");
	System.out.println("1.Set up a data.");
	System.out.println("2.Display all the datas.");
	System.out.println("3.Display for a classification.");
	System.out.println("4.Inquire a data.");
	System.out.println("5.Modify a data.");
	System.out.println("6.Delete a data.");
	System.out.println("7.Display all the datas by~.");
	System.out.println("8.Display all datas by pagination.");
	System.out.println("9.Display for a classification by pagination.");
	System.out.println("10.Reforming sort.");
	System.out.println("11.Check the telephone category.");
	//System.out.println("12.Join the loving list.");
	System.out.println("--------------------------------------------------------");
	
	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	
	
	if(num==1)
	{
		SetUp set=new SetUp();
		set.create();
		choose();
	}
	else if(num==2)
	{
		ShowAll show = new ShowAll();
		show.show();
		choose();
	}
	else if(num==3)
	{
		ShowSort show = new ShowSort();
		show.display();
		choose();
	}
	else if(num==4)
	{
		Inquire inquire=new Inquire();
		inquire.search();
		choose();
	}
	else if(num==5)
	{
		Modify set=new Modify();
		set.fix();
		choose();
	}
	else if(num==6)
	{
		Delete delete=new Delete();
		delete.set();	
		choose();
	}
	else if(num==7)
	{
		ShowAllbyitem show = new ShowAllbyitem();
		show.display();
		choose();
	}
	else if(num==8)
	{
		PageAll show = new PageAll();
		show.show();
		choose();
	}
	else if(num==9)
	{
		PageSort show = new PageSort();
		show.show();
		choose();
	}
	else if(num==10)
	{
		Reforming show = new Reforming();
		show.display();
		choose();
	}
	else if(num==11)
	{
		CheckTel tel = new CheckTel();
		tel.check();	
		choose();
	}
	/*
	else if(num==12)
	{
		MyLove love=new MyLove();
		love.set();	
		choose();
	}
	*/
	choose();
	}
}