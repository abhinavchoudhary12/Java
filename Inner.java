package core_java;
class Outter{
	void display()
	{
		System.out.println("outer");
	}
	class Inner{
		void display()
		{
			System.out.println("inner");
			
		}
	}
}
public class Inner {

	public static void main(String[] args) {
		// first metthod
    // Inner1 o =new Inner1();
    // Inner1.Outer i= o.new Outer();
    // i.display();
		// second method
		
	Outter.Inner o=new Outter().new Inner();
	o.display();
	Outter o1=new Outter();
	o1.display();
	}

}
