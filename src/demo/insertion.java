package demo;
import java.util.Scanner;
public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int[] arr;
		int i,j,k,temp,n;
		arr=new int[10];
		Scanner s=new Scanner(System.in);

		System.out.println("Enter no. of elements in array");
		n=s.nextInt();
		System.out.println("Enter elements in array");
		for(i=0;i<arr.length;i++)
		{
		arr[i]=s.nextInt();

		for(j=0;j<=i;j++)
		{
		if(arr[i]<arr[j])
		{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		for(k=0;k<n;k++)
		{
		System.out.print(arr[k]+"\t");
		}
		}

	}

}
