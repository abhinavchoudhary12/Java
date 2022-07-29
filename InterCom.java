package core_java;
class Customer{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("trying to withdraw amount.....");
		if(this.amount<amount)
		{
			System.out.println("insufficient amount in account");
			System.out.println(".............................");
			try {
				wait();
			}catch(Exception e)
			{
				System.out.println("exception 1");
			}
			
			
		}
		System.out.println("amount is withdrawn...");
		this.amount-=amount;
		System.out.println("remaining amount is "+this.amount);
	}
	synchronized void deposit(int amount)
	
	{
		System.out.println("trying to deposit the amount");
		this.amount+=amount;
		System.out.println("amount deposited....");
		System.out.println("remaining amount is "+this.amount);
		System.out.println(".............................");
		try {
			notify();
		}catch(Exception e)
		{
			System.out.println("exception 2");
			
		}
	}
	
}
public class InterCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Customer c=new Customer();
    new Thread(){
    	public void run()
    	{
    		c.withdraw(12000);
    	}
    }.start();
    new Thread(){
    	public void run()
    	{
    		c.deposit(10000);
    	}
    }.start();
	}

}
