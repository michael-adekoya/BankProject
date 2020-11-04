package Zoink;

public abstract class Account {
    protected int accountNumber;
    protected float balance;

    public Account(int acn, float bal){
        accountNumber=acn;
        balance=bal;
    }

    protected Account() {
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public float getAccountBalance(){
        return balance;
    }

  public  void display(){
        System.out.println("Account type: " +accountType());
        System.out.println("==============================");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Has balance: "+balance+" euro");
    }
  public void makeLodgement(float amount ){
        balance+=amount;
    }
   public void makeWithdrawal(float amount){
        balance-=amount;
    }
    public abstract String accountType();
}
