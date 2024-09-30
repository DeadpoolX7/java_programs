import java.util.Scanner;
class Bank{
	Integer simpleInterest(Integer p, Integer r, Integer t){
		return (p*r*t)/100;
	}
	Integer amount(Integer si, Integer p){
		return si + p;
	}
}

class Program14 extends Bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		try{
		//For Principle
		System.out.println("Enter principle: ");
		Integer principle = Integer.valueOf(sc.nextLine());

		//For Rate
		System.out.println("Enter Rate: ");
		Integer rate = Integer.valueOf(sc.nextLine());

		//For Time
		System.out.println("Enter Time: ");
		Integer time = Integer.valueOf(sc.nextLine());

		Program14 obj = new Program14();
		
		Integer si = obj.simpleInterest(principle,rate,time);
		System.out.println("Simple Interest: "+si);
		System.out.println("Amount: "+obj.amount(si,principle));

		}catch(Exception e){
			System.out.println(e);
		}finally{
			sc.close();
		}
		
	}	


}