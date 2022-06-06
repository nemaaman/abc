public class Main {
	static int countDigits(int number) {
	
		if (number>=1 && number<=9)
			return 1;
		else if (number>=10 && number<=99)
			return 2;
		else if (number>=100 && number<=999)
			return 3;
		else 
			return -1;
	}
	public static void main(String[] args) {
		System.out.println("This is the main class");
		int x=741;
		if(countDigits(x)!=-1)
			System.out.println(countDigits(x)+"digits");
		else 
			System.out.println("Multiple digited number");
	}
}