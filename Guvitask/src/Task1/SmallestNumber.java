package Task1;

public class SmallestNumber {
public static void main(String[] args) {
	int num1 = 20;
	int num2 = 85;
	int num3 = 25;
	
	int smallest;
	
	if (num1 <=num2 && num1 <=num3) {
		smallest = num1;
		
	} else if (num2 <=num1 && num2 <=num3) {
		smallest = num2;
	}
	else {
		smallest = num3;
	}
	System.out.println("the smallest number is:" + smallest);
}
}
