
class Mythread extends Thread{

	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(" Child Thread ");
			}
	}
}	
class mainThread{

	public static void main(String args[ ]){
		Mythread mt = new Mythread();
		mt.start();
		for(int i=0; i<10; i++){
		System.out.print(" Main Thread ");
}
}
}