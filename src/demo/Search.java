package demo;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		String s1="City chandigarh is beautiful";
	Scanner s=new Scanner(System.in);
		boolean flag;
        System.out.print("Enter word to search");
       String s2=s.nextLine();
        String a[]=s1.split(" ");
        for(int i=0;i<a[i].length();i++)
        {
        	if(a[i].equals(s2))
        	{
        		flag=true;
        		System.out.println("found");
        		break;
        	}
        	else
        	{
        		flag=false;
        		System.out.println("Not found");
        		
        		break;
        	}
        }
	}

}
