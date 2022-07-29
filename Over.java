package core_java;
class C{
	void printMe(){
		System.out.println("parent class");
	}
}
class D extends C{
	void printMe() {
		System.out.println("over ridding");
	}
}
public class Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    D b =new D();
    b.printMe();
	}

}
