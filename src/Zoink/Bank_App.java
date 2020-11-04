package Zoink;

import Zoink.Account;
import Zoink.Bank;
import Zoink.LoanAccount;
import Zoink.CurrentAccount;

public class Bank_App {

    public static void main(String args[]) {


        Bank ac= new Bank();
        ac.addAccount(new CurrentAccount(1001, 300, 200));
        ac.addAccount(new LoanAccount(2001, 200000, 25 * 12));
        ac.addAccount(new LoanAccount(2002, 250000, 30 * 12));
        ac.addAccount(new LoanAccount(2003, 100000, 100 * 12));

        ac.displayAccount(1001);
        ac.displayAccount(2002);

        System.out.println("The total amount of outstanding loans is = " + ac.calculateTotalLoans() + " euros.");


    }
}
