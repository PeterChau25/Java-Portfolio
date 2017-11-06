import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        String name = "";
        String phone = "";
        String address = "";
        String location = "";
        String VisaNumber = "";
        String MasterNumber = "";
        String cash = "";
        String totalOptions = "";
        double optionPrice = 0;
        String mainInput, customerInput;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int x = 0;
        int v = 0;
        int m = 0;

        Scanner keyboard = new Scanner(System.in);
        do {
            displayMainMenu();// starts the program and display main menu
            mainInput = keyboard.nextLine();
            if (mainInput.equals("1")) { //if user puts 1, display first menu which is customer info
                do {
                    displayCustomerMenu();
                    customerInput = keyboard.nextLine();

                    if (customerInput.equals("1"))
                        name = getName(); // press 1 to enter the customers name
                    else if (customerInput.equals("2"))
                        phone = getPhone(); // press 2 to enter phone
                    else if (customerInput.equals("3"))
                        address = getAddress(); // press 3 to enter address
                } while (!(customerInput.equals("4"))); // if 4 is pressed return to main menu
            } else if (mainInput.equals("2")) {
                do {
                    displayMainSelection(); // displays location selection
                    customerInput = keyboard.nextLine();

                    if (customerInput.equals("1"))
                        location = getSydney(); // if 1 in location, location will change to Sydney
                    else if (customerInput.equals("2"))
                        location = getTokyo(); // if 2 gets Tokyo
                    else if (customerInput.equals("3"))
                        location = getCairo(); // if 3 gets Cairo
                    else if (customerInput.equals("4"))
                        location = getLima(); // if 4 gets Lima

                } while (!(customerInput.equals("5"))); // exits to main menu if 5 is selected
            } else if (mainInput.equals("3")) {
                do {
                    displayOptions(); // display options for location
                    customerInput = keyboard.nextLine();

                    if (customerInput.equals("1")) // each options is represented by an integer a - e
                        a = 1;
                    else if (customerInput.equals("2"))
                        b = 2;
                    else if (customerInput.equals("3"))
                        c = 3;
                    else if (customerInput.equals("4"))
                        d = 4;
                    else if (customerInput.equals("5"))
                        e = 5;
                    else if (customerInput.equals("6")) // option(s) are cleared then all int will be changed back to 0
                        a = b = c = d = e = 0;
                } while (!(customerInput.equals("7"))); // if 7 then exit back to main menu
            } else if (mainInput.equals("4")) {
                do {
                    displayPaymentMethod(); // display payment methods
                    customerInput = keyboard.nextLine();

                    if (customerInput.equals("1")){ // 1 is for visa payment and card number
                        VisaNumber = getVisaNumber();
                        v = 1;
                        m = 0;
                    }
                    else if (customerInput.equals("2")){ // 2 is for master card payment and card number
                        MasterNumber = getMasterNumber();
                        m = 1;
                        v = 0;
                    }
                    else if (customerInput.equals("3")){ // 3 is cash payment
                        cash = "Paid with cash";
                        v = 0;
                        m = 0; 
                    }
                } while (!(customerInput.equals("4"))); // return to main menu
            } else if (mainInput.equals("5")) { // gets confirmation

                if (isOrderComplete(name, phone, address, VisaNumber, MasterNumber, cash, location)) { // first check if name, phone, address, payment and location is completed
                    getOptions(a, b, c, d, e, x, location, totalOptions, optionPrice);// display location, options, gift and total price
                    displayOrder(name, phone, address, location); // display customer info
                    displayPayment(v, m, VisaNumber, MasterNumber); // display payment info
                } else
                    displayErrors(name, phone, address, VisaNumber, MasterNumber, cash, location); // display any incomplete field
            }
        } while (!(mainInput.equals("6"))); // exits program
    }

    private static String getName() {
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = keyboard.nextLine();
        return name;
    }

    private static String getPhone() {
        String phone = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        phone = keyboard.nextLine();
        return phone;
    }

    private static String getAddress() {
        String Address = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Address: ");
        Address = keyboard.nextLine();
        return Address;
    }
    private static String getSydney() {
        String location = "Sydney ($703)";
        return location;
    }
    private static String getTokyo() {
        String location = "Tokyo ($528)";
        return location;
    }
    private static String getCairo() {
        String location = "Cairo ($414)";
        return location;
    }
    private static String getLima() {
        String location = "Lima for $380";
        return location;
    }

    private static String getVisaNumber() {
        String VisaNumber = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Visa Card number ");
        VisaNumber = keyboard.nextLine();
        return VisaNumber;
    }

    private static String getMasterNumber() {
        String MasterNumber = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Master Card number ");
        MasterNumber = keyboard.nextLine();
        return MasterNumber;
    }

    private static void displayMainMenu() {
        System.out.println();
        System.out.println("1. Input Customer Information\n" +
                "2. Destination/ Main Selection\n" +
                "3. Options\n" +
                "4. Payment methods\n" +
                "5. Display Order Confirmation\n" +
                "6. Exit\n");
        System.out.print("Your selections: ");
    }

    private static void displayCustomerMenu() {
        System.out.println();
        System.out.println("1. Name\n" +
                "2. Phone Number\n" +
                "3. Address\n" +
                "4. Main Menu\n");
        System.out.print("Your selection:");
    }

    private static void displayMainSelection() {
        System.out.println();
        System.out.println("1. Sydney for $703\n" +
                "2. Tokyo for $528\n" +
                "3. Cairo for $414\n" +
                "4. Lima for $380\n" +
                "5. Main Menu\n");
        System.out.print("Your selection:");
    }

    private static void displayOptions() {

        System.out.println("Enter options for the trip:\n" +
                "1. Passport Service for $85.99\n" +
                "2. Insurance for $140.29\n" +
                "3. City Tour for 199.45\n" +
                "4. Car Rental for $246.20\n" +
                "5. Hotel for $379.79\n" +
                "6. Clear\n" +
                "7. Main Menu\n");
        System.out.print("Your selection:\n");
    }

    private static void displayPaymentMethod() {
        System.out.println();
        System.out.println("1. Visa\n" +
                "2. MasterCard\n" +
                "3. Cash\n" +
                "4. Main Menu\n");
        System.out.print("Your selections: ");
    }

    private static void getOptions(int a, int b, int c, int d, int e, int x, String location, String totalOptions, double optionPrice) {
        int total = a + b + c + d + e;
        totalOptions = "";
        int locationPrice = 0;
        int options = 0;
        double finalpricel = 0;
        if (a == 1) {
            totalOptions += "Passport Service ($85.99)\n";
            optionPrice += 85.99;
            options++;
        }
        if (b == 2) {
            totalOptions += "Insurance ($140.29)\n";
            optionPrice += 140.29;
            options++;
        }
        if (c == 3) {
            totalOptions += "City Tour($199.45)\n";
            optionPrice += 199.45;
            options++;
        }
        if (d == 4) {
            totalOptions += "Car Rental ($246.20)\n";
            optionPrice += 246.20;
            options++;
        }
        if (e == 5) {
            totalOptions += "Car Rental ($379.79)\n";
            optionPrice += 379.79;
            options++;
        }
        System.out.println("You have placed an order for");
        System.out.println(location);
        if (total == 0)
        System.out.println("No options were selected");
        else if (total > 0 )
        System.out.println("With the following options");
        System.out.println(totalOptions);

        if (location.equals("Sydney ($703)"))
            locationPrice = 703;
        if (location.equals("Tokyo ($528)"))
            locationPrice = 528;
        if (location.equals("Cairo ($414)"))
            locationPrice = 414;
        if (location.equals("Lima ($380)"))
            locationPrice = 380;

        finalpricel = (locationPrice + optionPrice);
        double finalwithtax =  finalpricel + (finalpricel * .0975);
        System.out.printf("Total price: $%.2f%n\n", finalwithtax);

        if (options == 2)
            System.out.println("Congratulations. You will get the following free gift with your order:\n" + "Maps");
        else if (options == 3)
            System.out.println("Congratulations. You will get the following free gift with your order:\n" + "Flower basket");
        else if (options >= 4)
            System.out.println("Congratulations. You will get the following free gift with your order:\n" + "Dinner");
    }

    private static void displayOrder(String name, String phone, String address,String Location) {
        String orderInfo = "\nSold to: " + name +
                "\nTelephone: " + phone +
                "\nAddress: " + address;
        System.out.println(orderInfo);
    }

    private static void displayPayment(int v, int m, String VisaNumber, String MasterNumber) {
        String PaymentInfo = "Pay by: ";
        if (v == 1)
            PaymentInfo += "Visa number " + VisaNumber;
        else if (m == 1)
            PaymentInfo += "Master number " + MasterNumber;
        if (v == 0 && m == 0)
            PaymentInfo += "Cash";         
            System.out.println(PaymentInfo + "\n");
    }

    public static void displayErrors(String name, String phone, String address, String VisaNumber, String MasterNumber, String cash, String location) {
        String missingPayment = "";
        String missingInfo = "\nPlease Complete:\n";
        if (name.equals("") && phone.equals("") && address.equals("") && location.equals(""))
            missingInfo += "Name\n" + "Telephone\n" + "Address\n" + "Location";
        else if (name.equals("") && phone.equals("") && address.equals(""))
            missingInfo += "Name\n" + "Telephone\n" + "Address";
        else if (phone.equals("") && address.equals(""))
            missingInfo += "Telephone\n" + "Address";
        else if (address.equals(""))
            missingInfo += "Address";
        else if (name.equals(""))
            missingInfo += "Name";
        else if (phone.equals(""))
            missingInfo += "Telephone";
        else if (location.equals(""))
            missingInfo += "Location";
            System.out.println(missingInfo);
        if(VisaNumber.equals("") && MasterNumber.equals("") && cash.equals(""))
            missingPayment += "Payments";
            System.out.println(missingPayment);
    }

    private static boolean isOrderComplete(String name, String telephone, String address, String VisaNumber, String MasterNumber, String cash, String location) {
        boolean status = true;
        if (name.equals("") || telephone.equals("") || address.equals("") || location.equals(""))
            if (VisaNumber.equals("") || MasterNumber.equals("") || cash.equals(""))
                status = false;
        return status;
    }
}