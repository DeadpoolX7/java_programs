class Inheritance{
	int a;
	int b;
	int c;
	
	//constructor
	public Inheritance(int a, int b){
		this.a = a;
		this.b = b;
	}

	//Add method
	public int add(){
		return this.a + this.b;
	}
	//Sub method
	public int sub(){
		return this.a - this.b;
	}
	
}

class InheritanceSon extends Inheritance{
	int c;
	public InheritanceSon(int a, int b, int c){
		super(a,b);
		this.c = c;		
	}

	//mul method
	public int mul(){
		return this.a * this.b * this.c;
	}


}

public class Main{
		//Driver code
	public static void main(String[] args){
		System.out.println("Let's see Inheritance example\n");

		InheritanceSon obj = new InheritanceSon(6,5,7);
		
		System.out.println("Add method in parentClass "+obj.add());
		System.out.println("Sub method in parentClass "+obj.sub());
		
		System.out.println("Mul method in childClass "+obj.mul());
		
	}
}