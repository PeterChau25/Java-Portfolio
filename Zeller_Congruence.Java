import java.util.Scanner;
public class Zeller_Congruence

{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the year: e.g., 2012 ");
      int yr = input.nextInt();
      
      Scanner input1 = new Scanner(System.in);
      System.out.print("Enter the month: 1-12) ");
      int m = input1.nextInt();
      
      if (m == 1 || m == 2) {
          m = m + 12;
          yr = yr - 1;
         }
      Scanner input2 = new Scanner(System.in);
      System.out.print("Enter the day of the month: 1-31) ");
      int q = input2.nextInt();
      int j = yr / 100;
      int k = yr % 100;
      
      int h = ( q + (26 * ( m + 1 )/ 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;  //Zellers congruence
      
      switch (h) // display the day of week it is 
         {
            case 0: System.out.println ("Day of the week is Saturday"); break;
            case 1: System.out.println ("Day of the week is Sunday"); break;
            case 2: System.out.println ("Day of the week is Monday"); break;
            case 3: System.out.println ("Day of the week is Tuesday"); break;
            case 4: System.out.println ("Day of the week is Wednesday"); break;
            case 5: System.out.println ("Day of the week is Thursday"); break;
            case 6: System.out.println ("Day of the week is Friday");
         }
   }
}


      
