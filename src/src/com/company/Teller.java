package src.com.company;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Scanner;

public class Teller {

    public static String name;
    public static Scanner scanner = new Scanner(System.in);


    public static HashMap<String, Double> currentAccount = new HashMap<>();

//need to figure out how to .put and .get from hashmaps
    //then move on from there

    public static void welcomeScreen(){
        System.out.println("Welcome to the Money Machine");
        boolean a = true;
        String name = new String();
        while (a) {
            System.out.println("Please Enter Your Name");
            name = scanner.nextLine();
            if ( ! name.isEmpty()) {
                a = false;
            }
            else {
                System.out.println("Name was blank. Please Enter a Valid Name.");
            }
        }
        if(currentAccount.containsKey(name)) {
            System.out.println("Hello, " + name + "!");
            optionScreen();
        } else {
            System.out.println("Hello, " + name + ", Would you like to Open a New Account? [y/n]");
            String accountAnswer = new String();
            accountAnswer = scanner.nextLine();
            if (accountAnswer.contains("y")) {
                currentAccount.put(name, null);
                createAccount();
            } else {
                System.out.println("Thank You! Please Consider The Money Machine For Your Future Banking Needs!");
            }
        }
    }
    public static void optionScreen(){
        String choice = new String();
        System.out.println("What Would You Like to Do Today?" + "\n" + "Please Enter the Number Corresponding to Your Choice." + "\n" + "1) Check My Balance" + "\n" + "2) Withdraw Funds" + "\n" + "3) Remove My Account" + "\n" + "4) Cancel") ;
        choice = scanner.nextLine();
        if (choice.equals("1")){
            System.out.println("Your current balance is " + currentAccount.get(name));
        } else {
            if (choice.equals("2")){
            }
        }
    }

    public static void createAccount(String name){
        System.out.println("Thank You For Your Patronage!");
        Double deposit = new Double(0);
        while (deposit == 0) {
            System.out.println("Please Make a Deposit");
            String depositString = new String();
            depositString = scanner.nextLine();
            deposit = validatePositiveDouble(depositString);
            currentAccount.put("accountBalance", deposit);
            System.out.println("Thank You!");
            currentAccount.put(name, deposit);
            optionScreen();
        }
    }

    public static Double validatePositiveDouble(String s) {
        Double d = new Double(0);
        try {
            d = Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }
        return d;
    }
//    public static Double checkBalance() {
//
//    }


}
