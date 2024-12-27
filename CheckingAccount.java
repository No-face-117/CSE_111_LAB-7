// CSE-111 LAB - 7 TASK - 2     []
// T-2 CheckingAccount class

public class CheckingAccount extends Account{
  public static int count = 0;
  
  public CheckingAccount(){
    super(0.0);
    count++;
  }
  
  public CheckingAccount(double balance){
    super(balance);
    count++;
  }
  
  public double showBalance(){
    return balance;
  }
}