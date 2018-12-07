// Group

public class DiceRunner{

	public static void main(String[]args){

		// Test 1

		System.out.println("TEST 1:\n");

		Die dice1 = new Die();
		Die dice2 = new Die();

		int rolls = 0;

		System.out.println("Initial Values:\n");
		System.out.println(dice1);
		System.out.println(dice2);
		System.out.println();

		while(dice1.getValue() != 1 || dice2.getValue() != 1){

			rolls++;

			dice1.roll();
			dice2.roll();

			System.out.println("Roll " + rolls + ":\n");
			System.out.println(dice1);
			System.out.println(dice2);
			System.out.println();

		}

		System.out.println("\n" + rolls + " rolls were needed to get snake eyes.");
		System.out.println();

		// Test 2

		System.out.println("TEST 2:\n");

		DiceHolder container = new DiceHolder();

		System.out.println("Filling the Dice Holder:\n");

		for(int i = 0; i < 10; i++){
			if(container.addDie(new Die((int)(Math.random() * 16) + 4)) == 1)
				System.out.println(container);
			else
				break;
		}

		System.out.println("Shaking the Dice Holder:\n");
		container.shake();
		System.out.println(container);

	}

}