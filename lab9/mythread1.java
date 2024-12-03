
public class MyThread1 extends Thread{
	public void run()
		{
			System.out.println("r1 ");
			try {
			Thread.sleep(500);
			}
		catch (InterruptedException ie)
		{
	
		}
		System.out.println("r2 ");
		}
		
		public static void main(String[] args)
{

		MyThread1 t1= new MyThread1(); 
		MyThread1 t2= new MyThread1();
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
}
}