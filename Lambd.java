package core_java;
@FunctionalInterface
interface Lamb{
	void printMe();
}
public class Lambd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Lamb l=()->{
    	System.out.println("hello lambda");
    };
    
    l.printMe();
	
	}
}
