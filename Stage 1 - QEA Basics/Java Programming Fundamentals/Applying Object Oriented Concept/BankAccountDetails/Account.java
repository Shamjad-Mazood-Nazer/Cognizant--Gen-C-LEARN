public class Account{
    
    private int accountId;
    private int balance;
    private String accountType;
    
    public void setAccountId(int accID){
        accountId = accID;
    }
    
    public void setBalance(int balance){
        this.balance = balance;
    }
    
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    
    public int getAccountId(){
        return accountId;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public String getAccountType(){
        return accountType;
    }
    
    public boolean withdraw(int amount){
        if (amount>balance){
            System.out.println("Sorry!!! No enough balance");
            return false;
        } 
        else{
            balance -= amount;
            System.out.println("Balance amount after withdraw: "+balance);
            return true;
        }
    }
}