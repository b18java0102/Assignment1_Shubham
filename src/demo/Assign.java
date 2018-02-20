package demo;


		class Base{
			String s = "Base";
			String show()
			{
			return s;  
			}
			}    
		class Derived extends Base
		{
			String s = "Derived";
			String show()
			{
			return s;  
			}
		} 
			public class Assign
			{ 
			       void print(Base b)
			       {  
			          System.out.println(b.show());
			       }   void print(Derived d){
			          System.out.println(d.show());
			          
			       }  
			       public static void main(String[] args)
			       {
			Assign t = new Assign();
			Base b = new Base();
			Derived d=new Derived();
			t.print(b); 
			t.print(d);

	}

}
