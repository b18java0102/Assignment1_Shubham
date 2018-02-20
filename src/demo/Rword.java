package demo;

public class Rword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="",b="";
        String s="City Chandigarh is Beautiful";
        int i,j=0;
        for(i=0;i<s.length();i++)
        {
        
            if(s.charAt(i)==' '|| i==s.length()-1)
            {
                if(i==s.length()-1)
                a=s.substring(j,i+1);
                else
                    a=s.substring(j,i);
                System.out.println("a="+a);
            for(int k=a.length()-1;k>=0;k--)
            {
                b=b+a.charAt(k);
            }
            b=b+" ";
            System.out.println(b);
            j=i+1;
            }
            
            
        }
    }

}
