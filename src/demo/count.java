package demo;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="city chandigarh is beautiful";
		int v=0,c=0,sp=0,i,d=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				v++;
			}
			else if(s.charAt(i)!=' ')
			{
				c++;
			}
			/*else if(s.charAt(i)==0)
			{
				d++;
			}*/
			else
			{
				sp++;
			}
		}
		System.out.println("no. of vowels are: "+v);
		System.out.println("no. of consonants are: "+c);
		System.out.println("no. of spaces are: "+sp);
		

	}

}
