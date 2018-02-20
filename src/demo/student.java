package demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class student {
	static int idn=1;
	int id;
	String name;
	final static String course="java";
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	student()throws IOException
	{
		id=idn++;
		System.out.println("Enter name");
		name=br.readLine();
		
	}
	student(int id,String name)throws IOException
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		//System.out.println(this);
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		student s1=new student();
		
		s1.display();
		student s2=new student(1,"kimmi");
		s2.display();

	}

}
