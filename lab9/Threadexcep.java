class Threadmess extends Thread {
	private String message;
	private int interval;
	
	public Threadmess(String message , int interval){

		this.message=message;
		this.interval=interval;
	}
	public void run(){
		while(true){
		try{
			System.out.println(message);
			Thread.sleep(interval);
			
	}catch(InterruptedException e){
		
		System.out.println("Thread interuted");
			}
		}
	}
}

public class Threadexcep{
	public static void main(String args[]){

		Thread t1=new Threadmess("BMS college ",10000);
		Thread t2=new Threadmess("CSE",2000);
		t1.start();
		t2.start();
	}

}