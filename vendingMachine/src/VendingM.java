import java.util.Scanner;

public class VendingM {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		vendingMachine();
	}
	
	public static void vendingMachine() {
		// step1 choose the product
	
				int productNum = 0;
				int amountOfProduct = 0;
		        double enterMoney = 0.0;
				double sum = 0.0; // user pay
				boolean finishedAddingMoney = false;
				// step1: enter money
				System.out
						.println("Enter money. \nMachine is only aceppting $5 and $1 bill,\n 0.25/quarter, 0.10/dime, 0.05/nickle, and 0.01/penny.\n Enter 0 when you are done.");
				do {
					enterMoney = input.nextDouble();
					if (enterMoney == 0.0) {
						System.out.println("Finished adding money. Total added = $ "
								+ sum);
						finishedAddingMoney = true;
					} else if ((enterMoney == 5.0 || enterMoney == 1.0
							|| enterMoney == 0.25 || enterMoney == 0.1
							|| enterMoney == 0.05 || enterMoney == 0.01)) {
						sum = sum + enterMoney;
						System.out.println("Added " + enterMoney + "  "
								+ "total added now is :" + sum + "\n Enter 0 when you are done.");
					} else {
						System.out.println("you did not enter correct amount");
						System.out
								.println("\nMachine is only aceppting $5 and $1 bill,\n 0.25/quarter, 0.10/dime, 0.05/nickle, and 0.01/penny.\n Enter 0 when you are done.");
					}

				} while (finishedAddingMoney == false);
				//step2: choose product
				// fix validate input between 1-5 using loop
				double itemPrice = 0.0;
				do {
					System.out
							.println("Pick the product:\n0. Cancel \n1. Coke $1.00\n2. Sprite $1.50\n3. cookie $2.00\n4.tea $1.75\n5.bread $2.00");
					productNum = input.nextInt();
				} while (!(0<= productNum && productNum <= 5));
		       		// set the item price
				
				 //set the number of selections
			if(productNum!=0){
				do {
					System.out.println("Enter the amount of the product you selected.");
					amountOfProduct = input.nextInt();
					if (amountOfProduct<5){
					System.out.println("The amount of product" + productNum + "you selected is " + amountOfProduct);
				    }else 
					System.out.println("the maxium amount of product is 4, please re-enter the amount");
				} while (!(0<=amountOfProduct && amountOfProduct < 5));
			}	
				if (productNum == 1) {
					itemPrice = 1.00 * amountOfProduct;
					System.out.println("Please put $ " + itemPrice + "into the machine ");
				} else if (productNum == 2) {
					itemPrice = 1.50 * amountOfProduct;
					System.out.println("Please put $ " + itemPrice + "into the machine ");
				} else if (productNum == 3) {
					itemPrice = 2.00 * amountOfProduct;
					System.out.println("Please put $ " + itemPrice + "into the machine ");
				} else if (productNum == 4) {
					itemPrice = 1.75 * amountOfProduct;
					System.out.println("Please put $ " + itemPrice + "into the machine ");
				} else if (productNum == 5){
					itemPrice = 2.00 * amountOfProduct;
					System.out.println("Please put $ " + itemPrice + "into the machine ");
				} else {
					System.out.println("You cancelled purchase!");
				}


				// for (double pay = input.nextDouble(); pay != 0; ) {
				// sum += pay;
				// System.out.println("Total " + sum);
				// }

//				double pay = input.nextDouble();
//				while (pay != 0) {
//					sum = sum + pay;
//					System.out.println("Total amount is " + "$" + sum + "\n"
//							+ "Enter 0 when you done");
//					pay = input.nextDouble();
//				}
				// System.out.println("Bye");
				change(sum,itemPrice);
			}
	
	public static void change(double sum, double itemPrice) {

		// step3: change
		// get change
		double change = 0.0;
		change = sum - itemPrice;
		// test enough money
		while (change < 0) {
			System.out
					.println("it is not enough money to buy this item, please put more money.");
			double extraPay = input.nextDouble();
			sum = sum + extraPay;
			change = sum - itemPrice;
			System.out.println("the total money you put is "+ "$" + sum);
		}
		// give the change
		if (change == 0) {
			System.out.println("please get your product.");
		} else if (change > 0) {
			System.out.println("Please get your product.");
			System.out.println("Please get your change." + "$" + change);
			System.out.println("Quarter: " + change / 0.25 +"\n" + "dime:"
					+ (change % 0.25) / 0.1 +"\n"+ "nickle"
					+ ((change % 0.25) % 0.1) / 0.05 +"\n" + "penies:"
					+ (((change % 0.25) % 0.1) % 0.05) / 0.01);

		}

	}
	
}
