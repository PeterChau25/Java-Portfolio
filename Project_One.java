import java.util.Scanner;
public class Project_One
{
   public static void main(String[] args)
   {
      String name = "";
      String missingInfo = "";
      String mainInput, customerInput;
      
      Scanner keyboard = new Scanner(System.in);
      do
      {
         displayMainMenu();
         mainInput = keyboard.nextLine();
         if(mainInput.equals("1"))
         {
            do
            {
               displayCustomerMenu();
               customerInput = keyboard.nextLine();
            
               if(customerInput.equals("1"))
                  name = getName();
            }while(!(customerInput.equals("2")));
         }
         else if (mainInput.equals("2"))
         {
            if(isOrderComplete(name))
               displayOrder(name);
            else
               displayErrors(name);
         }
       }while (!(mainInput.equals("3")));
    }
    private static String getName()
    {
      String name = "";
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter customer name: ");
      name = keyboard.nextLine();
      return name;
    }
    private static void displayMainMenu()
    {
         System.out.println();
         System.out.println("1. Input Customer Information\n" +
                            "2. Destination Selection\n" + 
                            "3. Options\n" + 
                            "4. Payment methods\n" +
                            "5. Display Order Confirmation\n" +  
                            "6. Exit");
         System.out.print("\nYour selections: ");
     }
     private static void displayCustomerMenu()
     {
         System.out.println();
         System.out.println("1. Name\n" +
                            "2. Phone Number\n" +
                            "3. Address\n" +
                            "4. Main Menu\n"); 
         System.out.print("/nYour selections:");
     }
     private static void displayOrder(String name)
     {
         String orderInfo = "\nName: " + name;
         System.out.println("\n" + orderInfo + "\n");
     }
     public static void displayErrors(String name)
     {
         String missingInfo = "\nPlease Complete:\n";
         if(name.equals(""))
            missingInfo += "Name\n";
         System.out.println(missingInfo);
     }
     private static boolean isOrderComplete(String name)
     {
         boolean status = true;
         if(name.equals(""))
            status = false;
         return status;
     }
}     