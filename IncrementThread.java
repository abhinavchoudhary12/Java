package core_java;


class Inc{
	int a;
	void Increment()
	{
		a++;
	}
	
}
public class IncrementThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
    Inc in=new Inc();
    Thread t=new Thread(()->{
    for(int i=0;i<1000;i++)
    {
    	in.Increment();
    }
    });
    Thread t1=new Thread(()->{
        for(int i=0;i<1000;i++)
        {
        	in.Increment();
        }
    });
    t.start();
    t1.start();
    t.join();
    t1.join();
    System.out.println("value of a is "+in.a);
	}

}
