package demo;

public class StdAssign {
	int rollno;
	String name;
	char grade;
	double e,m,s, total_marks, average_marks;
	
	StdAssign(double eng,double math,double sci)
	{
		eng=e;
		math=m;
		sci=s;
	}
	
	void total()
	{
		total_marks=e+m+s;
		System.out.println("Total marks are :"+total_marks );
	}
	void average()
	{
		average_marks=total_marks/3;
		System.out.println("Average marks are :"+average_marks );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdAssign s1=new StdAssign(97.0,96.5,93.3);
		s1.total();
		s1.average();
		

	}

}
