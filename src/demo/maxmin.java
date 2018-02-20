package demo;
import java.util.Scanner;
public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int i,j;
        int max=a[0];
        System.out.println("Enter elements in array");
        for(i=0;i<a.length;i++)
        {
        	a[i]=s.nextInt();
        	
        }
        for(j=1;j<a.length;j++)
        {
        	if(a[j]>max)
        	{
        		max=a[j];
        	}
        }
        System.out.print("Maximum element :"+max);
	}

}
