import java.util.ArrayList;

public class DiceHolder{

	private ArrayList<Die> container;

	public DiceHolder(){

		container = new ArrayList<>();

	}

	public int addDie(Die die){

		if(container.size() < 6){
			container.add(die);
			return 1;
		}
		return -1;

	}

	public void shake(){

		for(int i = 0; i < container.size(); i++){
			/*int shake = (int)(Math.random()*6)+1;
			int temp = container.get(i);
			container.set(i,container.get(shake));
			container.set(container.get(shake),temp);*/
			container.get(i).roll();
		}

	}

	public String toString(){

		String statement = "";
		for(int i = 0; i < container.size(); i++)
			statement += container.get(i) + "\n";
		return statement;

	}
}

