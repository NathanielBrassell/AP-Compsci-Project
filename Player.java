import java.util.ArrayList;

public class Player{

	int money = 20;
	int position = 0;
	String name = "";
	String piece = "";
	Arraylist propOwned = new Arraylist();
	
	public int rollDice(){
		int rand1 = (int)(Math.random() * 6) + 1;
		int rand2 = (int)(Math.random() * 6) + 1;
		int rand3 = rnad1 + rand2;
		return rand3;
	}
	
	public Object move(Arraylist board){
		int position += rollDice();
		ret = board[position];
		canBuy(ret);
		return ret;
	}
	
	public Boolean canBuy(Property prop){
		if (money >= prop.getRent());
	}
	
	
