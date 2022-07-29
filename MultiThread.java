package core_java;
class Thread1 extends Thread{
	Thread1()
	{
		super("thread A");
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("thread is "+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
class Thread2 extends Thread{
	Thread2()
	{
		super("thread B");
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("thread is "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Thread1 t=new Thread1();
    Thread2 t1=new Thread2();
    t.start();
    t1.start();
    
	}

}
