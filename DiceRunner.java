public class DiceRunner{

	public static void main(String[]args){

		// Test 1

		Die dice1 = new Die();
		Die dice2 = new Die();

		int rolls = 0;

		System.out.println("Roll " + rolls + ":\n");
		System.out.println("\t" + dice1);
		System.out.println("\t" + dice2);

		while(dice1.getValue != 1 && dice2.getValue != 1){

			dice1.roll();
			dice2.roll();

			System.out.println("Roll " + rolls + ":\n");
			System.out.println("\t" + dice1);
			System.out.println("\t" + dice2);

		}

	}

}