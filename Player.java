import cs1.Keyboard;
import java.util.ArrayList;

public class Player{

	int money = 20;
	int position = 0;
	String name = "";
	String piece = "";
	Arraylist propOwned = new Arraylist();
	
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
		canBuy(ret);
		return ret;
	}
	
	public void canBuy(Property prop){
		boolean ret = false
		if (money >= prop.getPrice()){
			ret =  true;
		}
		willBuy(ret, prop);
	}
	
	public void willBuy(Boolean boo, Property prop){
		System.out.println("Do you wish to buy" + prop.getName() + "?");
		String reply = Keyboard.readWord();
		if (reply.equals("yes"){
			money -= prop.getPrice();
			prop.setAvail(false);
			propOwned.add(prop);
		}
	}
}
