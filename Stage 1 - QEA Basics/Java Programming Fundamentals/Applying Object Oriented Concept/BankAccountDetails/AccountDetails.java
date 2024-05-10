import java.util.*;

public class AccountDetails{

    Scanner sc = new Scanner(System.in);
    
    public Account getAccountDetails(){
        Account ac = new Account();
        int accountId, balance;
        String accountType;
        
        System.out.println("Enter account id:");
        accountId = sc.nextInt();
    
        System.out.println("Enter account type:");
        accountType = sc.next();
        
        
        
        while(true){
            System.out.println("Enter balance:");
            balance = sc.nextInt();
            if (balance <= 0){
                System.out.println("Balance should be positive");
            } 
            else{
                ac.setBalance(balance);
                break;
            }
        }
        ac.setAccountId(accountId);
        ac.setAccountType(accountType);
        return ac;
    }
    
    public int getWithdrawAmount(){
        int withdrawAmount;
        while(true){
            System.out.println("Enter amount to be withdrawn");
            withdrawAmount = sc.nextInt();
            if (withdrawAmount <= 0){
                System.out.println("Amount should be positive");
                continue;
            }
            else{
                break;
            }
        }
        return withdrawAmount;
    }
    
    public static void main (String[] args) {
        AccountDetails ad = new AccountDetails();
        Account ac = ad.getAccountDetails();
        boolean withdrawAmount = ac.withdraw(ad.getWithdrawAmount());
    }
    
}