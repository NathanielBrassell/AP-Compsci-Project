import java.util.ArrayList;

public class Player{

        private int money;
        private ArrayList <Property> Owned = new ArrayList();
        private String _name;
                
        public Player(String name){
                _name = name;
                money = 150;
        }
        
                public String getName(){
                return _name;}
        public int getMoney(){
                return money;
        }
        
        public void setMoney(int m){
                money = m;
        }
		
		public void addOwned(Property P){
			Owned.add(P);}
			
		public void clearOwned(){
			Owned.clear();}
			
        
        public String getOwned(){
                String ret = "";
                if (Owned.isEmpty()){
                        return "Nothing";
                }
                for (int x = 0; x < Owned.size(); x++){
						Property temp = Owned.get(x);
                        ret += temp.getName() + " , "; 
                }
                return ret;
        }
}
