package demo;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,n;
		int temp;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no");
		n=s.nextInt();
		temp=n;
		while(temp>0)
		{
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("not palindrome");
		}
		

	}

}
