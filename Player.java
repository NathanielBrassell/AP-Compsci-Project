import java.util.ArrayList;

public class Player{

        private int money;
        private ArrayList Owned;
	private String _name;
		
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
        
        public String getOwned(){
        	String ret;
        	if (Owned.size() == 0){
        		return "None";
        	}
        	for (x = 0; x < Owned.size(); x++){
        		ret += Owned.get(x).getName();
        	}
        	return ret;
        }
}
