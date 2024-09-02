class MyProgram{
	private	int x;
	private	int y;
	
	//Default Constructor
	public MyProgram(){
		this.x = 0;
		this.y = 0;
		System.out.println("Default contructor invoked\n");
	}
	//Parameterized constructor
	public MyProgram(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Parameterized contructor invoked\n");
	}

	//Addition method
	public int add(){
	return this.x + this.y;
	}
	//Subtraction method
	public int sub(){
	return this.x - this.y;
	}
	public static void main(String[] args){
		MyProgram obj1 = new MyProgram();

		System.out.println("let's invoke default constructor one "+ obj1.add());
		System.out.println("let's invoke default constructor one "+ obj1.sub());

		MyProgram obj2 = new MyProgram(9,8);

		System.out.println("let's invoke parametrized constructor one "+ obj2.add());
		System.out.println("let's invoke parameterized constructor one "+ obj2.sub());
	}

}