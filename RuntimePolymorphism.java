class P{
	void x(){
		System.out.println("I run in Parent Class.\n");
	}
}


class p1 extends P{
	public void x(){
		System.out.println("I run in Child Class- p1.\n");
	}
}



public class RuntimePolymorphism{
	public static void main(String[] args){
		p1 obj = new p1();
		
		obj.x();
	}
}