package core_java;
class ExGen<T,U>{
	T obj;
	U obj1;
	void Sum(T obj,U obj1)
	{
		this.obj=obj;
		this.obj1=obj1;
		if(obj instanceof Number &&obj1 instanceof Number)
		{
			Double sum= Double.parseDouble(obj.toString())+Double.parseDouble(obj1.toString());
		    System.out.println("sum is "+sum);
		}
		else
		{
		System.out.println("concat of a and b are "+obj.toString()+obj1.toString());	
		}
	}
}
public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ExGen <Integer,Double> a=new ExGen<>();
	 a.Sum(12, 2.0);
	 ExGen <String,Integer> a1=new ExGen<>();
	 a1.Sum("hello", 12);
	}

}
