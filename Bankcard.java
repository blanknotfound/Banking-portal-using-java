public class Bankcard//class creation
{
    private int Card_Id;//variable declaration
    private String Client_name;//variable declaration
    private String issuer_bank;//variable declaration
    private String BankAccount;//variable declaration
    private int BalanceAmount;//variable declaration
    
    
    //constructor
    public Bankcard(int BalanceAmount, int Card_Id, String BankAccount, String issuer_bank)
    {
        this.Client_name="";
        this.BalanceAmount= BalanceAmount;
        this.Card_Id= Card_Id;
        this.BankAccount= BankAccount;
        this.issuer_bank= issuer_bank;
    }
    
    
    //get methods
    public int getCard_Id()
    {
        return this.Card_Id;
    }
    
    public String getclient_name()
    {
        return this.Client_name; 
    }
    
    public String getIssuer_bank()
    {
        return this.issuer_bank; 
    }
    
    public String getBankAccount()
    {
        return this.BankAccount; 
    }
    
    public int getBalanceAmount()
    {
        return this.BalanceAmount; 
    }
    
    
    //set methods
    public void setclient_name(String Client_name)
    {
        this.Client_name= Client_name;  
    }

    public void setbalanceAmount(int BalanceAmount)
    {
        this.BalanceAmount= BalanceAmount;
    }
    //Display method which prints data to the user screen or terminal
    public void display()
    {
        if(Client_name.equals(""))//if condition to check either name is geven or not 
        {
            System.out.println("client name not given");
        }
        else
        {
            System.out.println("name of the client is :"+Client_name);
        }
        
        
        System.out.println("your card id  is: "+Card_Id);
        System.out.println("The issuer bank is: "+issuer_bank);
        System.out.println("your bank account  is: "+BankAccount);
        System.out.println("your bank balance  is: "+BalanceAmount);
    }
}