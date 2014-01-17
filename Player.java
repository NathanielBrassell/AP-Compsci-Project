import java.util.ArrayList;

public class Player{

	int money = 20;
	int position = 0;
	String name = "";
	String piece = "";
	Arraylist propOwned = new Arraylist();
	
	public Player(String nam, String pece){
		name = nam;
		peice = pece;
	}
	
	public int getMoney(){
		return money;
	}
	
	public void setMoney(int m){
		money = m;
	}
	
	public int rollDice(){
		int rand1 = (int)(Math.random() * 6) + 1;
		int rand2 = (int)(Math.random() * 6) + 1;
		int rand3 = rnad1 + rand2;
		return rand3;
	}
	
	public Object move(Arraylist<Property> board){
		int position += rollDice();
		ret = board[position];
		if (ret.getAvail() == false){
			ret.rent(this)
		}
		return ret;
	}
	
	public Buy(Property prop)
}
