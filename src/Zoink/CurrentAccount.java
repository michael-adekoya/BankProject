package Zoink;
public class CurrentAccount extends Account {
    private float overdraftlimit;

    public CurrentAccount(int acn, float bal, float limit) {
        super(acn, bal);
        overdraftlimit = limit;
    }


    @Override
    public void makeWithdrawal(float amount) {
        if (amount <= (balance + overdraftlimit))
            makeWithdrawal(amount);
    }

    public void setOverDraftLimit(float limit) {
        overdraftlimit = limit;

    }

    @Override
    public String accountType() {
        return "Current Account";
    }


    public void display() {
        super.display();
        System.out.println("   -Overdraft limit: " + overdraftlimit);
        System.out.println("");
    }
}

