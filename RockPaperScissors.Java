
//Plays rock paper scissor with the computer 
import java.util.Scanner;
public class rock_paper_scissors
{
   public static void main(String[] args)
    {
      int random = (int)(Math.random () * 3); // generate a random number between 0 and 1 or 2
           
      Scanner input = new Scanner(System.in);
      System.out.println("enter scissor (0), rock (1), paper (2): ");
      int guess = input.nextInt(); //gets user input
      
      System.out.print("The computer plays ");
      switch (random)//generate computers choice
      { 
         case 0: System.out.print("Sissor."); break;
         case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}
      
       boolean win = (guess == 0 && random == 2)|| //checks who wins 
							  (guess == 1 && random == 0) ||(guess == 2 && random == 1); 
       if (win){
            System.out.println("\nyou win!");
        }
      else if ( guess == random){ //compares the input to the randomly generated number
        System.out.println("\nDraw");
        }
      else
         System.out.println("\nComputer wins");
    }
}
