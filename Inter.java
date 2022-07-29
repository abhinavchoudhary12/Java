package core_java;
@FunctionalInterface
interface A
{
	void printMe();
}
class B implements A{
	public void printMe() {
		System.out.println("i am interface");
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B a =new B();
    a.printMe();
	}

}
