import java.util.Scanner;

public class Bank {
    int accountnumber;
    float balance;
    static int totalaccount;

    public Bank(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public Bank() {
        balance = 0;
        totalaccount = 0;
    }

    public void deposit(int amount) {
        balance += amount;
        totalaccount++;
        System.out.println("The amount" + amount + " is deposited to the account number" + accountnumber);
        System.out.println("Current balance for account number " + accountnumber + " is: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y') {
            System.out.println("enter account number: ");
            int accountnumber=sc.nextInt();
            System.out.println("enter amount to deposit:");
            int amount = sc.nextInt();
            Bank b=new Bank(accountnumber);
            b.deposit(amount);
            System.out.println("Account number:"+accountnumber);
            System.out.println("do you want to continue(y or n):");
            ch = sc.next().charAt(0);
            if (ch == 'n') {
                break;
            }
        }
        System.out.println("Total number of accounts:" + totalaccount);
    }
}
