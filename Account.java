import java.util.Date;

public class Account {
    private int ID;
    private double Balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account()
    {
       dateCreated=new Date();
    }
    public Account(int ID,double Balance )
    {
        this.ID=ID;
        this.Balance=Balance;
        dateCreated=new Date();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    public double getMonthlyInterest()
    {
        return ((annualInterestRate/100)/12)*Balance;
    }
    public void withdraw(double amount)
    {
        Balance=Balance-amount;
    }
    public void deposit(double amount)
    {
        Balance=Balance+amount;
    }
}
