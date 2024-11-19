interface Printable{
	void print();

}

interface Showable{

	void show();
}

class Document implements Printable,Showable{

	public void print(){

		System.out.println("Printing doc");
	}
	public void show(){

		System.out.println("Showing doc");
	}
	
}

public class Main2{
	public static void main(String args[]){

		Document doc=new Document();
		doc.print();
		doc.show();
	}

}