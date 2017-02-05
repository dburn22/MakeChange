package Labs;

import java.util.Scanner;

public class MakeChangeProject {
	public static void main(String[] args) {
		//created a new scanner
		Scanner kb = new Scanner(System.in);


		float i1, t1;
		float change;
		String single[] = new String[8];
		single[7] = "penny";
		single[6] = "Nickel";
		single[5] = "Dime";
		single[4] = "Quarter";
		single[3] = "Dollar";
		single[2] = "Five Dollar bill";
		single[1] = "Ten dollar bill";
		single[0] = "Twenty dollar bill";

		String plural[] = new String[8];
		plural[7] = "Pennies";
		plural[6] = "Nickels";
		plural[5] = "Dimes";
		plural[4] = "Quarters";
		plural[3] = "Dollars";
		plural[2] = "Fives";
		plural[1] = "Tens";
		plural[0] = "Twenties";

		int[] numBills = new int[8];
		int[] values = { 2000, 1000, 500, 100, 25, 10, 5, 1 };

		boolean continueTransaction = true;

		while (continueTransaction) {

			System.out.println("How much was that item, in dollars and cents please" + "?");
			i1 = kb.nextFloat();
			System.out.println("Ok the item was $" + i1);
			System.out.println("How much money did you pay with?");
			t1 = kb.nextFloat();

			if (t1 > i1) {
				change = (t1 -= i1) * 100;
				for (int i = 0; i < values.length; i++) {
					if (change >= values[i]) {
						int numOfBills = (int) (change / values[i]);
						change = change % values[i];

						if (numOfBills > 1) {
							System.out.println("Your change is: " + numOfBills + plural[i]);
						} else if (numOfBills == 1) {
							System.out.println("Your change is: " + numOfBills + single[i]);

						}

					}

				}
			} else if (t1 < i1) {
				System.err.println("Get outta my store!!!!");

			} else {
				System.out.println("You get no change!");
			}

			System.out.println("Do you want to buy anything else?");
			char answer = kb.next().toLowerCase().charAt(0);
			if (answer == 'n') {
				continueTransaction = false;
			}

		}
		//
		//
		// for (int i = 0; i <= 100; i++){
		// if ((i % 25) == 0)
		// System.out.println(" test");
		// if(change >= 1.00);
		// String []denom = new String [5];
		// denom[0] = "pennies";
		// denom[1] = "Nickels";
		// denom[2] = "Dimes";
		// denom[3] = "Quarters";
		// denom[4] = "Dollar(s)";
		// System.out.println("Your change is: "+ change +denom[4]);

		// if(change == .25 && change == .50 && change ==.75)
		// System.out.print( " Your change is: " +denom[3]);
		// //if(change % 0.5)
		// System.out.print( " Your change is: " +denom[2]);
		// if((change % 0.5)==0);
		// System.out.print( " Your change is: " +denom[1]);
		// if((change % 0.5)==0);
		// System.out.print( " Your change is: " +denom[0]);
		// }
	}

}
// for (int i= 0; i < 100; i++);
// int i = (int)change;
// if(change < 0.90)
// System.out.println("Your change is: " + change + denom [0]);

/*
 * System.out.println(" test");
 *
 * for (int i= 0; i < 100; i++);
 *
 * if ((change % 2) == 0 && (change % 5) == 0) System.out.println(" test");
 */

// for (int i = 0; i < 100; i++)
// if ((i % t1) == 0 && (i % i1) == 0)
// System.out.println("Your change is: " + i);

/*
 * public static void int changeMethod(){ int[] pennies = new int[100]; return
 * int;
 *
 * }
 *
 * /*int i;
 *
 * for (i = 0; i <= 5; i++) { // System.out.println(i);
 *
 * if ((i % 9) == 0 && (i % 5) == 0) System.out.println(" ");
 *
 * else if ((i % 3) == 0) System.out.println(" Fizz");
 *
 * else if ((i % 5) == 0) System.out.println(" BUZZ");
 *
 * else System.out.println(" " + i);
 */

