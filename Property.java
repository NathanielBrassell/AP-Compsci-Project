public class Property{
  
 private int price 0 ;
 private int rent = 0;
 private String name = "";
 private Boolean Avail = true;
 
 public int getPrice(){
   return price;
 }
 
 public int getRent(){
   return rent;
 }
 
 public String toString(){
   return name + "costs" + price + "and rents for" + rent;
 }
}
