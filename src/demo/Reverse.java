package demo;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int i=0,j,n,m,temp;
        int a[]=new int[4];
        System.out.print("Enter Number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(n>0)
        {
         m=n%10;
         a[i]=m;
         i++;
         n=n/10;
         
        }
        for(i=0;i<4;i++)
        {
          for(j=0;j<3;j++)
          {
             if(a[j]>a[j+1])
             {
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
          }
        }
        System.out.print("sorted no is:");
        for(i=0;i<4;i++)
        {
            System.out.print(a[i]);
        }
    }
}

	
