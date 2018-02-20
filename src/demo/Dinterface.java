package demo;

interface MyInterface
{
   int x=12;
   void method1();
   void method2();
   static void methodx()
   {
     System.out.println("Static method");  
   }

}

interface NewInterface extends MyInterface
{
   void method3();
 
}

abstract class XYZ implements NewInterface
{
   public void method1()
  {
      System.out.println("implementation of method1");
  }
}


class Dinterface extends XYZ
{
public void method2()
  {
      System.out.println("implementation of method2");
  }
public void method3()
  {
      System.out.println("implementation of method3");
  }

  public static void main(String arg[])
  {
     Dinterface p= new Dinterface();
      p. method1();
      p.method2();  
      MyInterface.methodx();
     
  }
}




