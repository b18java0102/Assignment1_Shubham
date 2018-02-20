package demo;

public class oloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="*****";
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print(s);
			s.replace(s.charAt(i),' ');
			System.out.println();
			
		}
		

	}

}
