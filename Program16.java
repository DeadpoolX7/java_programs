//Interface Inheritance

interface ParentInterface{
	 void printNum();
	
}
interface ChildInterface extends ParentInterface{
	 void printDetails();	
}

class Test implements ChildInterface{
	
	public void printNum(){
		
		for(int i = 1; i<= 10; i++){
			System.out.println(i);

		}	
	}
	public void printDetails(){
		String name = "DeadPool";
		int age = 27;
		boolean student = false;
		System.out.println(name+" "+age+" "+student);
	}
}

public class Program16{
	public static void main(String[] args){
		Test obj = new Test();
		obj.printNum();
		obj.printDetails();
	
	}	
}
