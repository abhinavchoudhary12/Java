package core_java;
class Over2{
	int sum(int x,int y)
	{
		
		return x+y;
	}
	int sum(int x,int y,int z)
	{
		return x+y+z;
	}
}
public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Over2 o=new Over2();
     System.out.println(o.sum(12,13));
     System.out.println(o.sum(12,13,14));
	}

}
