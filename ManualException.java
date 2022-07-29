package core_java;
class ExMan{
	void age(int x) throws Exception
	{
		if(x<18)
		{
			throw new Exception("cant vote under age!");
		}
		else
		{
			System.out.println("can vote");
		}
	}
}
public class ManualException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     ExMan e=new ExMan();
     e.age(15);
	}

}
