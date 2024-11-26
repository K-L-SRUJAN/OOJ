class WrongAgeExcep extends Exception{

	public WrongAgeExcep (String message){
		super(message);
	}
}

class Father {

	public int fage;
	public Father (int fage) throws WrongAgeExcep{
		if(fage<0){
			throw new WrongAgeExcep("Age can not be less than 0");
		
		}
		this.fage=fage;
	}

}

class Son extends Father{

	public int sage;
	public Son(int sage, int fage) throws WrongAgeExcep{
		super(fage);
		if(sage<0){
			throw new WrongAgeExcep("Age can not be less than 0");
		}
		if(sage>=fage){
			throw new WrongAgeExcep("Sons age can not be greater or equal to father age");
		}
		this.sage=sage;
	}
}

class Main{
	public static void main(String args[]){
	// 	try{

	// 		Father f=new Father(40);
	// 		Son s=new Son(10,40);
	// 		System.out.println("Father age : "+f.fage+" Son age : "+s.sage);
	// 	}catch (WrongAgeExcep e){System.out.println("Error : "+e.getMessage());}

	// try{

	// 		Father f=new Father(-5);
			
	// 		System.out.println("Father age : "+f.fage);
	// 	}catch (WrongAgeExcep e){System.out.println("Error : "+e.getMessage());}

	try{

			Father f=new Father(40);
			Son s=new Son(50,40);
			System.out.println("Father age : "+f.fage+" Son age : "+s.sage);
		}catch (WrongAgeExcep e){System.out.println("Error : "+e.getMessage());}
	}

}
