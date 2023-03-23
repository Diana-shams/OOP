
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account A=new Account(1122,20000);
        A.withdraw(2500);
        A.deposit(3000);
        A.setAnnualInterestRate(4.5);
        System.out.println(A.getBalance());
        System.out.println(A.getMonthlyInterest());
        System.out.println(A.getDateCreated());


    }
}