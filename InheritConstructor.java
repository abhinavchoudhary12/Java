package core_java;
class F1{
	F1()
	{
		System.out.println("i am in f1");
	}
}
class F2 extends F1{
	F2()
	{
		System.out.println("i am in f2");
	}
}
public class InheritConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     F2 f=new F2();
	}

}
