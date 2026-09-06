/** ENCAPSULATION */
/** Encapsulation in Java is the process of bundling data (variables) and the methods that operate on that data into a single unit (a class)
 * while restricting direct access from the outside. It is a core pillar of OOPs often referred to as data hiding. */

public class Encapsulation  {
  public static void main(String[] args){
    BankAccount bankOne = new BankAccount("Suraj", 4500);
    System.out.println("CustomerName: "+bankOne.customerName + "  AccountNo: "+ bankOne.accountNo);
    System.out.println("Current Balance: "+ bankOne.getAccountBalance());

    bankOne.deposit(1000.00);
    System.out.println("After Deposit Balance: "+ bankOne.getAccountBalance());
    bankOne.withdraw(500);
    System.out.println("After Withdraw Balance: "+ bankOne.getAccountBalance());
  }
};

class BankAccount{
  //access modifiers
  private double balance;
  public String customerName;
  protected int accountNo;

  //constructor
  BankAccount(String customerName, double balance){
    this.customerName = customerName;
    this.balance = balance;
    this.accountNo = setAccountNumber();
  }

  //accessible within the class
  private int setAccountNumber(){
    return 1234567;
  }

  //accessible eveywhere
  public void deposit(double amount){
    this.balance += amount;
  }

  public void withdraw(double amount){
    this.balance -= amount;
  }

  public double getAccountBalance(){
    return this.balance;
  }
};