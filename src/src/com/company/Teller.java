package src.com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Teller {

    public static String name;
    public static Scanner scanner = new Scanner(System.in);
    public static Double deposit;


    HashMap<String, Double> currentAccount = new HashMap<>();

    public Teller() {
        currentAccount.put("wes", 1000.0);
        currentAccount.put("janelle", 100000.0);
        currentAccount.put("stevie", 346.0);
    }

    public void welcomeScreen() throws Exception {
        System.out.println("Welcome to the Money Machine");
        boolean a = true;
        String name = new String();
        while (a) {
            System.out.println("Please Enter Your Name");

            name = scanner.nextLine();
            if (!name.isEmpty()) {
                a = false;
            } else {
                System.out.println("Name was blank. Please Enter a Valid Name.");
            }
        }
        if (currentAccount.containsKey(name)) {
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

    public void optionScreen() throws Exception {
        String choice = new String();
        System.out.println("What Would You Like to Do Today?" + "\n" + "Please Enter the Number Corresponding to Your Choice." + "\n" + "1) Check My Balance" + "\n" + "2) Withdraw Funds" + "\n" + "3) Remove My Account" + "\n" + "4) Cancel");
        choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println(currentAccount);
                checkBalance();
                optionScreen();
                break;
            case "2":
                withdrawFunds();
                optionScreen();
                break;
            case "3":
                removeAccount();
                break;
            case "4":
                cancel();
                break;
            default:
                //stuff
                break;

        }
//
    }

    public void createAccount() throws Exception {
        System.out.println("Thank You For Your Patronage!");
        Double deposit = new Double(0);
        while (deposit == 0) {
            System.out.println("Please Make a Deposit");
            //String depositString = new String();
            // depositString = scanner.nextLine();
            deposit = scanValidDouble();
            System.out.println("Thank You!");
            currentAccount.replace(name, deposit);
            optionScreen();
        }
    }

    public Double scanValidDouble() throws Exception {
        Double numOption = new Double(0);
        while (numOption <= 0) {
            try {
                numOption = Double.parseDouble(Main.scanner.nextLine());
                if (numOption <= 0) {
                    throw new Exception();
                }
            } catch (Exception wrongNumber) {
                System.out.println("Please Enter a valid amount.");
            }
        }
        return numOption;
    }

    public void checkBalance() throws Exception {
        System.out.println("Your current balance is " + currentAccount.get(name));
        optionScreen();
    }

    public void withdrawFunds() throws Exception {
        System.out.println("How Much Would You Like To Withdraw?");
        String withdraw = scanner.nextLine();
        Double money = Double.parseDouble(withdraw);
        if (money > currentAccount.get(name)) {
            throw new Exception("Insufficient Funds Dude");

        } else if (money <= currentAccount.get(name)) {
            System.out.println("Please Take Your Ca$h, Homey!");
            System.out.println(currentAccount.get(name) - money);


        }
    }

    public void removeAccount() throws Exception {
        System.out.println("Are You Sure? [y/n]");
        String remove = scanner.nextLine();
        if (remove.contains("y")) {
            currentAccount.remove(name, deposit);
        } else {
            optionScreen();
        }
    }

    public void cancel() {
        System.exit(0);

    }
}

