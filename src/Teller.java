import java.util.HashMap;
import java.util.Scanner;

public class Teller {

    public  Scanner scanner = new Scanner(System.in);
    Scanner userScan = new Scanner(System.in);
    static HashMap<String, Double> currentAccount = new HashMap<>();

    public Teller() {
        currentAccount.put("wes", 1000.0);
        currentAccount.put("janelle", 100000.0);
        currentAccount.put("stevie", 346.0);
    }

    protected void defaultScreen() throws Exception {
        System.out.println("Welcome to the Money Machine");
        System.out.println("Please Enter Your Name");
        String userName = userScan.nextLine();
        if (userName.isEmpty()) {
            System.out.println("Name was blank. Please Enter a Valid Name.");
        }
        if (currentAccount.containsKey(userName)) {
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("Hello, " + userName + ", Would you like to Open a New Account? [y/n]");
            String accountAnswer = scanner.nextLine();
            if (accountAnswer.contains("y")) {
                currentAccount.put(userName, 0.0);
                System.out.println("Thank You For Your Patronage! \n Please Make A Deposit.");
                String depositEntry = scanner.nextLine();
                Double deposit = Double.parseDouble(depositEntry);
                if (deposit >= 0) {
                    currentAccount.put(userName, deposit);
                    System.out.println("Thank You!");
                }
            } else {
                System.out.println("Please Consider The Money Machine For Your Future Banking Needs.");
            }
        }
        boolean b = true;
        while (b) {
            System.out.println("What Would You Like to Do Today?" + "\n"
                    + "Please Enter the Number Corresponding to Your Choice." +
                    "\n" + "1) Check My Balance" + "\n" + "2) Withdraw Funds" +
                    "\n" + "3) Remove My Account" + "\n" + "4) Cancel");
            String userInput = scanner.nextLine();
            Integer choice = Integer.parseInt(userInput);
            switch (choice) {
                case 1:
                    System.out.println("Your current balance is $" + currentAccount.get(userName));
                    break;
                case 2:
                    System.out.println("How Much Would You Like To Withdraw?");
                    String withdraw = scanner.nextLine();
                    Double money = Double.parseDouble(withdraw);
                    if (money > currentAccount.get(userName)) {
                        throw new Exception("Insufficient Funds Dude");
                    } else if (money <= currentAccount.get(userName)) {
                        System.out.println("Please Take Your Ca$h, Homey! \n" +
                    "Remaining Balance : $" + (currentAccount.get(userName) - money) );
                    }
                    break;
                case 3:
                    System.out.println("Are You Sure? [y/n]");
                    String remove = scanner.nextLine();
                    if (remove.contains("y")) {
                        currentAccount.remove(userName);
                        System.out.println("Account Successfully Deleted. \n =======================\n");
                    }
                    defaultScreen();
                    break;
                case 4:
                    defaultScreen();
                    break;
                default:
                    System.out.println("Invalid Option. Please Try Again.");
                    break;
            }
        }
    }
}

