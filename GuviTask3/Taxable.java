package GuviTask3;

public interface Taxable { 
    double SALES_TAX = 0.07;  // 7% sales tax
    double INCOME_TAX = 0.105; // 10.5% income tax

    double calcTax(); // Abstract method to calculate tax
}

