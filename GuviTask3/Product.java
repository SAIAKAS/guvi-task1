package GuviTask3;


	class Product implements Taxable {
	    private int pid;
	    private double price;
	    private int quantity;

	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    @Override
	    public double calcTax() {
	        // Calculate sales tax based on the price of a single product
	        return price * SALES_TAX;
	    }

	    public String toString() {
	        return "Product ID: " + pid + ", Price: $" + price + ", Quantity: " + quantity;
	    }
	}
