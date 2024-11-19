interface MyInterface{

public void method1();
public void method2();


}

class Demo implements MyInterface{

	public void method1(){

	System.out.println("Implementation of method1");
	}

	public void method2(){

	System.out.println("Implementation of method2");
	}
	
	public static void main(String args[]){

		MyInterface obj=new Demo();
		obj.method1();

	}


}