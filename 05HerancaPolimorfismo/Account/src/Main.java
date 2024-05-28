import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "laex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "maria", 1000.00, 400.00));

 }
}