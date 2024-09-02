class MathOperations{

	public int add(int a, int b){
		return a+b;
	}
	
	public double add(double a, double b){
		return a + b;
	}

	public int add(int[] numbers){
		int sum = 0;
		for(int num : numbers){
			sum += num;	
		}
		return sum;
	}
	
	public static void main(String[] args){
		MathOperations MathsOps = new MathOperations();

		System.out.println("Addition of integers: "+MathsOps.add(5,7));

		System.out.println("Addition of double numbers: "+MathsOps.add(8.2,2.5));
		
		System.out.println("Addition of an Array of numbers: "+ MathsOps.add(new int[]{1,2,3,4,5}));
	}
}