public class Property {
  
 private int price = 0 ;
 private int rent = 0;
 private String name = "";
 private Boolean avail = true;
        ArrayList board = new ArrayList();
        board.add(new Property(0,0,null));
        board.add(new Property(12,5,"PE"));
        board.add(new Property(12,10, "Health"));
        board.add(new Property(0,0,null));
        board.add(new Property(0,0,null));
        board.add(new Property(20,15, "Geometry"));
        board.add(new Property(20,15, "Trigonometry"));
        board.add(new Property(24,20, "Calculus"));
        board.add(new Property(0,0,null));
        board.add(new Property(28,25,"Biology"));
        board.add(new Property(28,25,"Chemistry"));
        board.add(new Property(31,30, "Physics"));
	board.add(new Property(0,0,null));
        board.add(new Property(36,35, "Intro to Compsci"));
        board.add(new Property(40, 39, "AP Compsci"));
ArrayList NotOwned = board;
 
 public Property(int prc, int rnt, String nam){
   price = prc;
   rent = rnt;
   name = nam;
 }
 
 public int getPrice(){
   return price;
 }
 
 public int getRent(){
   return rent;
 }
 
 public Boolean getAvail(){
   return avail;
 }
 
 public void setAvail(Boolean boo){
   avail = boo;
 }
 
 public void toRent(Player play){
   play.setMoney(play.getMoney() - rent);
 }
 
 public String toString(){
   return name + "costs" + price + "and rents for" + rent;
 }
}
