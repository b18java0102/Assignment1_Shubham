package demo;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st no");
		x=s.nextInt();
		System.out.println("Enter 2nd no");
		y=s.nextInt();
		sum(x,y);

	}
	static void sum(int a,int b)
	{
		System.out.println("sum is : "+(a+b));
	}

}

