import java.util.ArrayList;
public class Property {
  
 private int price ;
 private int rent;
 private String type;
 private String name;
 private Boolean avail;
 private Player OwnedBy = null;
 
 
 
 public Property(String nam){
  name = nam;
  avail = false;
  }
  
 public Property(int prc, int rnt, String nam){
   price = prc;
   rent = rnt;
   name = nam;
   avail = true;
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
 
 public String getName(){
   return name;
 }
 
 public void setAvail(Boolean boo){
   avail = boo;
 }
 
 public void setOwner(Player p){
	OwnedBy = p;
 }
	
public Player getOwner(){
	return OwnedBy;
}	
 
 public String toString(){
   return name + "costs" + price + "and rents for" + rent;
 }
}
