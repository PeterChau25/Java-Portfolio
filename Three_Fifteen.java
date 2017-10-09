//Written by:    Tai Chun Chau, Juan Peralta
//Assignment:    Lab02-Page 111 3.15
//Class:         CoSci 290
//Date:          10/9/17
//Description:   Revise Listing 3.8, Lottery.java to generate 3 digit instead of two

//Lottery game with 3 random digit
import java.util.Scanner;
public class Three_Fifteen
{
    public static void main(String[] args) 
    {
      int lottery = (int)(Math.random() * 1000); //generate random 3 digit number
      
      // Prompt the user to enter a guess  
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your lottery pick (three digits): ");
      int guess = input.nextInt();
      
      // Get digits from lottery
      int lotteryDigit1 = lottery / 100;
      int lotteryDigit2 = (lottery / 10 ) % 10;
      int lotteryDigit3 = lottery % 10;
      
      // Get digits from guess
      int guessDigit1 = guess / 100;
      int guessDigit2 = (guess / 10) % 10;
      int guessDigit3 = guess % 10;
      
      System.out.println("The lottery number is " + lottery);
      
      // Check the guess
      if (guess == lottery)
         System.out.println("Exact match: you win $10,000");
      
      // check to see if the guess but disregards order
      else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2 ||
           guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3 ||
           guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1 ||
           guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1 ||
           guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
         
      else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
               || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
               || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
               System.out.println("Match one digit: you win $1,000");
      else 
         System.out.println("Sorry, no Match");
    }
}
