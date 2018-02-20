package demo;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        int a[][]=new int[2][2];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements in array");
        for(i=0;i<a.length;i++)
        {
        	for(j=0;j<a[i].length;j++)
        	{
        		a[i][j]=s.nextInt();
        		
        	}
        	
        }
        for(i=0;i<a.length;i++)
        {
        	for(j=0;j<a[i].length;j++)
        	{
        	   
        		System.out.print(a[i][j]+"\t");
        	}
        	System.out.println();
        	
        }
        System.out.println("Transpose of matrix is:");
        for(i=0;i<a.length;i++)
        {
        	for(j=0;j<a[i].length;j++)
        	{
        		System.out.print(a[j][i]+"\t");
        		
        	}
        	System.out.println();
        }




	}

}
