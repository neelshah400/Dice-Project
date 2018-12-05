import java.util.*;
public class DiceHolder{
	private ArrayList <Die> container;

	public DiceHolder(){
		container = new ArrayList <> ();
	}
	public int addDie(Die die){
		container.add(die);
		if(container.size() > 6){
			container.remove(die);
			return -1;
		}
		else
		return 1;
	}
	public void shake(){
		for(int i = 0; i < container.size(); i++){
			int shake = (int)(Math.random()*6)+1;
			int temp = container.get(i);
			container.set(i,container.get(shake));
			container.set(container.get(shake),temp);
		}
	}
	public String toString(){
		for(int i = 0; i < container.size();i++)
		return ""+container.get(i)+" \n";
	}
}

