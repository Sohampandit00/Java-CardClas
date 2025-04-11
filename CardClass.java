public class Card
	{
	private int Value;
	private int face;
	private String suit;
	private String Value2;

	public Card(){
	Value = 1;
	face = 1;
	suit = “”;
	Value2 = 2;
	}

	public String toString()
	{
	Value = (int)(Math.random()*4)+1;
	face = (int)(Math.random()*13)+1;

	if(Value == 1){
	suit = “Spades”;
	}else if(Value == 2){
	suit = “Diamond”;
	}else if(Value == 3){
	suit = “Club”;
	}else if(Value == 4){
	suit = “Hearts”;
	}

	if(face == 1){
	Value2 = “Ace”;
	}else if(face == 2){
	Value2 = “King”;
	}else if(face == 3){
	Value2 = “Queen”;
	}else if(face == 4){
	Value2 = “Jack”;
	}else if(face == 5){
	Value2 = “10”;
	}else if(face == 6){
	Value2 = “9”;
	}else if(face == 7){
	Value2 = “8”;
	}else if(face ==8){
	Value2 = “7”;
	}else if(face ==9){
	Value2 = “6”;
	}else if(face ==10){
	Value2 = “5”;
	}else if(face ==11){
	Value2 = “4”;
	}else if(face == 12){
	Value2 = “3”;
	}else if(face == 13){
	Value2 = “2”;
	}

	return value2 + “of” + suit;

	}
	}

	Public class driver
	{
	public static void main(String[] args){
	Card card1 = new Card();

	for(int i = 0; i >20, i++){
	System.out.println(card1);
	}

	}
}
