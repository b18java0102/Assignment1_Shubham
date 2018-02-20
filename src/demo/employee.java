package demo;
import java.util.Scanner;
public class employee {
	int eid;
	String ename;
	final static String company="bebo";
	Scanner s=new  Scanner(System.in);
	employee()
	{
		System.out.println("Enter id");
		eid=s.nextInt();
		System.out.println("Enter name");
		ename=s.next();
		
	}
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(employee.company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee();
		employee e2=new employee();
		e1.display();
		e2.display();
	}

}
