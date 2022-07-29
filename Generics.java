package core_java;

class Gen<T>           
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
public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Gen <Integer> in=new Gen<>();
     Gen <String> s=new Gen<>();                   //we can pass any non primitive data types
                                                   //like Character,Byte,Double etc
     
     in.setValue(12);
     s.setValue("abhinav");
     in.display();
     s.display();
     
	}

}
