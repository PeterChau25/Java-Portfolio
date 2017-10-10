
public class Random_Card_From_deck
{
   public static void main(String[] args)
   {
      int list = (int)(Math.random()* 13);
      int suit = (int)(Math.random() * 4);
      
      System.out.print("The card you picked is ");
		switch(list) // Get card name
		   {
			   case 0: System.out.print("Ace"); break;
			   case 1: System.out.print(list); break;
			   case 2: System.out.print(list); break;
			   case 3: System.out.print(list); break;
			   case 4: System.out.print(list); break;
			   case 5: System.out.print(list); break;
			   case 6: System.out.print(list); break;
			   case 7: System.out.print(list); break;
			   case 8: System.out.print(list); break;
			   case 9: System.out.print(list); break;
			   case 10: System.out.print("Jack"); break;
			   case 11: System.out.print("Queen"); break;
			   case 12: System.out.print("King");
         }
		System.out.print(" of ");
		switch (suit) // Get suit
		{
			case 0: System.out.println("Clubs"); break;
			case 1: System.out.println("Diamonds"); break;
			case 2: System.out.println("Hearts"); break;
			case 3: System.out.println("Spades"); 
		}
	}
}