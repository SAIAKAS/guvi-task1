package Task1;

public class Reverse {
	public static void main(String[] args) {
		
		int num = 876 , reverse = 0;
		
		for (;num !=0; num/=10) {
			int digit = num%10;
			reverse = reverse*10+ digit;
			
		}
		System.out.println("Reversed Number:" + reverse);
	}

}
