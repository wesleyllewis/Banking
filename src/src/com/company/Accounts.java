package src.com.company;


import java.util.HashMap;

public class Accounts {

    private HashMap<String, Double> account = new HashMap<>();

    private Accounts(){
        account.put("wesley", 1000.0);
        account.put("janelle", 100000.0);
        account.put("stevie", 346.0);
    }

}
