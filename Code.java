public class Code{
	
 	int position;
  String piece;
  String type;
  int money;
  int price;
  int rent;
  Arraylist propertiesOwned = new ArrayList();
  Arraylist board = new Arraylist();
  public final static Arraylist properties = new Arraylist;
  
  public Code(String typ, String pece, int pric, int pos, int ren){
  	type = typ;
  	
  	if ( type.equals("Prop")){
  		price = pric;
  		rent = ren;
  	}
  	
  	else(){
  		piece = pece;
  		money = 20;
  		position = pos;
  	}
  }
	
  public int rollDice(){
    int rand = (int)(Math.random() * 6) + 1;
    int rand2 = (int)(Math.random() * 6) + 1;
    int rand3 = rand + rand2;
    return rand3;
  }
	
public void Move{
	position += rollDice;
} 

public 
	
public void main(String [] args){
	
  for (int x = 0; x < 17; x++){
  	int temp_price = x + 1;
  	int temp_rent = x + 2;
  	
} 
