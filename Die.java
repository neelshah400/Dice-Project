public class Die{

	private int sides;
	private int value;

	public Die(){

		sides = 6;
		roll();

	}

	public Die(int sides){

		this.sides = sides;
		roll();

	}

	public int getSides(){

		return sides;

	}

	public int getValue(){

		return value;

	}

	public void roll(){

		value = (int)(Math.random() * sides) + 1;

	}

	public String toString(){

		return "Number of Sides: " + sides + ", Value: " + value;

	}

}