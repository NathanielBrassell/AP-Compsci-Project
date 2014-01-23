import java.util.ArrayList;

public class Player{

        int money;
        ArrayList propOwned;
		String _name;
		
        public Player(String name){
		_name = name;
		int money = 150;
		ArrayList propOwned = new ArrayList();
        }
        
		public String getName(){
		return _name;}
        public int getMoney(){
                return money;
        }
        
        public void setMoney(int m){
                money = m;
        }
        
        

}
