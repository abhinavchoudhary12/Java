package core_java;

class Bnd<T extends Number>           
{
	T obj;
	void setValue(T obj)
	{
		this.obj=obj;

	}
	void display()
	{
		System.out.println("value is "+obj);
	}
	
}
public class BoundType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bnd <Integer> in=new Bnd<>();
     Bnd <Double> d=new Bnd<>();
//     Bnd <String> s=new Bnd<>();                   //in bound type we ristricts the type parameter here only subclass of number can be send
                                                     //string cannot be send as a type parameter
     
     in.setValue(12);
     d.setValue(12.0);
     //s.setValue("abhinav");
     in.display();
     d.display();
     //s.display();
     
	}

}
