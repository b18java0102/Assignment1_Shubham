package demo;

public class binarys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,4,5,6,7,8,9,10};

		int loc=a.length/2;
		int mid=a[loc];
		int x=6;


		if(x==mid)
		{
			System.out.print("element found");}

		else if(x<mid)
		{
		for(int i=0;i<loc;i++)
		{
		if(x==a[i])
		{
		System.out.print("element found");
		break;
		}
		}
		}

		else if(x>mid)
		{
		for(int i=loc+1;i<a.length;i++)
		{
		if(x==a[i])
		{
		System.out.print("element found");
		break;
		}
		}
		}



	}

}
