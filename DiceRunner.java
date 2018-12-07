public class DiceRunner{

	public static void main(String[]args){

		// Test 1

		Die dice1 = new Die();
		Die dice2 = new Die();

		int rolls = 0;

		System.out.println("Initial Values:\n");
		System.out.println("\t" + dice1);
		System.out.println("\t" + dice2);
		System.out.println();

		while(dice1.getValue() != 1 || dice2.getValue() != 1){

			rolls++;

			dice1.roll();
			dice2.roll();

			System.out.println("Roll " + rolls + ":\n");
			System.out.println("\t" + dice1);
			System.out.println("\t" + dice2);
			System.out.println();

		}

		System.out.println("\n" + rolls + " rolls were needed to get snake eyes.");

		// Test 2

		DiceHolder container = new DiceHolder();
		for(int i = 0; i < 10; i++){
			Die temp = new Die((int)(Math.random() * 6) + 6));
			if(temp == 1)
				container.add(temp);
			System.out.println(container);
		}

	}

}