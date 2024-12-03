class Threaddemo extends Thread{
	Threaddemo(){
		System.out.println("Thread : "+Thread.currentThread().getName()+", " + "State : New");
	}
	public void run(){

		System.out.println("Thread : "+Thread.currentThread().getName()+", " + "State : Running");
		for(int i=4; i>0;i--){
			System.out.println("Thread : "+Thread.currentThread().getName()+", " + i);
		}
		System.out.println("Thread : "+Thread.currentThread().getName()+", " + "State : Dead");
	}
	public void start(){
		System.out.println("Thread : "+Thread.currentThread().getName()+", " + "State : start");
		super.start();
	}
}
	public class Testthread{
	public static void main(String args[]){
		Threaddemo t1=new Threaddemo();
		Threaddemo t2=new Threaddemo();
		t1.start();
		t2.start();
		System.out.println("Thread : "+Thread.currentThread().getName()+", " + "State : Dead");
	}
}