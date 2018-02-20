package demo;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="city chandigarh is beautiful";
		int i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				s=s.replace(s.charAt(i),'*');
			}
		}
		System.out.println(s);

	}

}
