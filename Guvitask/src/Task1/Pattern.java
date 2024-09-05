package Task1;

public class Pattern  {
    public static void main(String[] args) {
        int I = 5; // Number of rows
        int J = 5; // Number of columns

       // to print the pattern i,j,k equals to greater than 5
        if (I >= 5 && J >= 5) {
            for (int i = 1; i <= I; i++) {
                for (int j = 1; j <= J; j++) {
                
                    System.out.print(Math.max(6 - i, 6 - j));
                }
                System.out.println(); 
            }
        } else {
            System.out.println("I and J must both be greater than or equal to 5.");
        }
    }
}
	    




