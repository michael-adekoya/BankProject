package Zoink;
public class LoanAccount extends Account {
    private int loanTerm;
    private float monthlyRepayment;

    public LoanAccount(int acn,float bal,int term){
        super(acn,bal);
        loanTerm=term;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("   - Loan term:  "+ loanTerm+" months");
    }

    @Override
    public String accountType() {
        return "Loan Account";
    }
}
