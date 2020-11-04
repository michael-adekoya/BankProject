package Zoink;

public class Bank extends Account {

    private static final int MAX_NUM_Accounts= 1000;
    private Account[] accounts= new Account[MAX_NUM_Accounts];
    private int numAccounts;

    public Bank(int a){
        numAccounts=a;

    }
    public Bank(){

        for (int i = 0; i < numAccounts; i++)
            if (accounts[i] !=null )
            System.out.println("Bank is now closed! ");

    }

    @Override
    public String accountType() {
        return null;
    }

    public void addAccount(Account ac){
    if(numAccounts < MAX_NUM_Accounts)
        accounts[numAccounts++] = ac;
        else
            System.out.println("Bank is full");
    }
    public void displayAccount(int acn){
        for(int i =0; i<numAccounts; i++){
            if (accounts[i].getAccountNumber()==acn){
                accounts[i].display();

            }
        }
    }
    public float calculateTotalLoans(){
        float totalLoansAmount=0;
        for(int i=0; i<numAccounts; i++){
            if(accounts[i].accountType()=="Loan Account")
                totalLoansAmount+=
                        accounts[i].getAccountBalance();
        }
        return totalLoansAmount;
    }
}
