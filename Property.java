public class Property{
  
 private int price 0 ;
 private int rent = 0;
 private String name = "";
 private Boolean avail = true;
 
 public Property(int prc, int rnt, String nam){
   price = prc;
   rent = rnt;
   name = nam;
 }
 
 public Property(String nam, String type){
   name = nam;
   if (type.equals("Chance")){
     
   }
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
