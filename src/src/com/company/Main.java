package src.com.company;

import java.util.HashMap;
import java.util.Scanner;



public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static Teller teller = new Teller();
    public static void main(String[] args) throws Exception{


 //how do i add and retrieve values from hashmap

        //scanner.nextLine();
        teller.welcomeScreen();

////        Scanner scanner = new Scanner(System.in);
////        //Hashmap of customers
////        HashMap<String, Double> account = new HashMap<>();
////        account.put("wesley", 1000.0);
////        account.put("janelle", 100000.0);
////        account.put("stevie", 346.0);
////        //how do i put the new customers names in the hashmap?!
////
////        String name = scanner.nextLine();
////        if(name.isEmpty()){
////            throw new Exception("Invalid Name, Please Enter Your Name");
////        }
////        if(account.containsKey(name.toLowerCase())){
////            System.out.println("Hello " + name);
////            System.out.println("What Would You Like to Do Today?");
////            System.out.println("Please Enter the Number Corresponding to Your Choice.");
////            System.out.println("1) Check My Balance");
////            System.out.println("2) Withdraw Funds");
////            System.out.println("3) Remove My Account");
////            System.out.println("4) Cancel");
//
//        }else {
//            System.out.println("Hello " + name + " ,would you like to open an account? [y/n]");
//            String createAccount = scanner.nextLine();
//
//            if(createAccount.contains("y")){
//                System.out.println("Thank you for your patronage!");
//                System.out.println("What Would You Like to Do Today?");
//                System.out.println("1.Check My Balance. 2.Withdraw Funds. 3.Cancel");
//            } else {
//                System.out.println("Cool, we didn't want your business anyway!");
//            }
//        }
//
//
//        String choice = scanner.nextLine();
//
//        if(choice.equals("1")){
//            System.out.println("Your Balance is " + account.get(name));
//            scanner.nextLine();
//        }
//        else if(choice.equals("4")){
//            System.out.println("Thank You, Please Come Again!");
//        }
//        else if(choice.equals("2")){
//            System.out.println("How Much Money You Need?");

//            //how do i make this loop continuosly
//            }
//        }
//        else if(choice.equals("3")){
//            System.out.println("Sorry To Hear That, Please Take Your Cash. Have A Nice Day!");
//        }
//
//

    }
}
