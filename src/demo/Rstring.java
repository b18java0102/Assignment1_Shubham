package demo;

public class Rstring {

	public static void main(String[] args) {
		String s1="City chandigarh is beautiful";
		String s2="";
		int i;
		for(i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.print(s2);

	}

}
