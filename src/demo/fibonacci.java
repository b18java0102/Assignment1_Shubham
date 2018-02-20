package demo;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=0,b=1,c,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		n=s.nextInt();
		System.out.print("Fibonacci series: "+a+" "+b+" ");
		for(i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
