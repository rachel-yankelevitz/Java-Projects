public class CarLoan {
	public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

	    if (loanLength <= 0 || interestRate <= 0) { // check to see if interest rate and loan length are valid
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) { // make sure this financially makes sense
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment; // actual loan amount 
            int months = loanLength * 12; // years converted to months
            int monthlyBalance = remainingBalance / months; // monthly payment NOT including interest rate
            int interest = (monthlyBalance * interestRate) / 100; // monthly interest amount
            int monthlyPayment = monthlyBalance + interest;
            System.out.print("monthly mortgage is: " + monthlyPayment);
        }
    }
}