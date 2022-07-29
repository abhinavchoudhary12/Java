package core_java;
class Add{
	int i,j,k;
	void addition(int i,int j) {
	try{
		System.out.println("this is exception method");
		this.i=i;
		this.j=j;
		k=i/j;
		
		System.out.println("%d".formatted(k));
	}catch(ArithmeticException e)
	{
		System.out.println("divide by zero");
	}
}
}
public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before calling");
    Add a=new Add();
    a.addition(12,0);
	}

}
