package Task4;


	import java.util.Stack;
	import java.util.Scanner;

	public class IntegerStack {
	   
	    private Stack<Integer> stack;

	    // Constructor to initialize the stack
	    public IntegerStack() {
	        stack = new Stack<>();
	    }

	   
	    public void pushElement(int element) {
	        stack.push(element);
	        System.out.println("Element " + element + " pushed onto the stack.");
	    }

	    
	    public void popElement() {
	        if (!stack.isEmpty()) {
	            int poppedElement = stack.pop();
	            System.out.println("Element " + poppedElement + " popped from the stack.");
	        } else {
	            System.out.println("Stack is empty. Cannot pop element.");
	        }
	    }

	    
	    public void displayStack() {
	        if (!stack.isEmpty()) {
	            System.out.println("Current stack: " + stack);
	        } else {
	            System.out.println("Stack is empty.");
	        }
	    }

	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        IntegerStack integerStack = new IntegerStack();

	        while (true) {
	           
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Push element onto stack");
	            System.out.println("2. Pop element from stack");
	            System.out.println("3. Display stack");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    // Push element
	                    System.out.print("Enter an integer to push onto the stack: ");
	                    int elementToPush = scanner.nextInt();
	                    integerStack.pushElement(elementToPush);
	                    break;
	                case 2:
	                    // Pop element
	                    integerStack.popElement();
	                    break;
	                case 3:
	                    // Display stack
	                    integerStack.displayStack();
	                    break;
	                case 4:
	                    // Exit
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
