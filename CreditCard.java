public class CreditCard extends Bankcard//subclass creation
{
    private int CVCnumber;//variable declaration
    private double CreditLimit;//variable declaration
    private double IntrestRate;//variable declaration
    private String ExpirationDate;//variable declaration
    private int GracePeriod;//variable declaration
    private boolean isGranted;//variable declaration
    //constructor
    public CreditCard(int Card_Id, String Client_name, String issuer_Bank, String BankAccount, int BalanceAmount, int CVCnumber, double IntrestRate,
                     String ExpirationDate)
    {
        super(BalanceAmount, Card_Id, BankAccount, issuer_Bank);
        setclient_name(Client_name);     
        this.CVCnumber=CVCnumber;
        this.IntrestRate=IntrestRate;
        this.ExpirationDate=ExpirationDate;
        this.isGranted=false;   
    }
    //get methods
    public int getCVCnumber()
    {
        return this.CVCnumber;  
    }
    
    public double getCreditLimit()
    {
        return this.CreditLimit;  
    }
    
    public double getIntrestRate()
    {
        return this.IntrestRate; 
    }
    
    public String getExpirationDate()
    {
        return this.ExpirationDate; 
    }
    
    public int getGracePeriod()
    {
        return this.GracePeriod; 
    }
    
    public boolean getisGranted()
    {
        return this.isGranted; 
    }
    //set methods
    public void setCreditLimit(double CreditLimit, int GracePeriod)
    {
        if(CreditLimit<=2.5*super.getBalanceAmount())
        {
            this.CreditLimit=CreditLimit;
            this.GracePeriod=GracePeriod;
            this.isGranted=true;  
        }
        else
        {
            System.out.println("The credit cannot be issued");  
        }
    }
    //method to cancelcredit card
    public void cancelCreditCard()
    {
        this.CreditLimit=0;
        this.GracePeriod=0;
        this.CVCnumber=0;
        this.isGranted=false;  
        System.out.println("Client's card has been removed");
    }
    //Display method which prints data to the user screen or terminal
    @Override   
    public void display()
    {
        if(isGranted==true) 
        {
            super.display();  
            System.out.println("The CVC number is: "+CVCnumber);
            System.out.println("The Intrest rate is: "+IntrestRate);
            System.out.println("The expiration date is: "+ExpirationDate);
            System.out.println("The access granted is: "+isGranted);
            System.out.println("credit limit: "+CreditLimit);
            System.out.println("Grace period: "+GracePeriod);
        }
        else
        {
            System.out.println("The CVC number is: "+CVCnumber);
            System.out.println("The Intrest rate is: "+IntrestRate);
            System.out.println("The expiration date is: "+ExpirationDate);
            System.out.println("The access granted is: "+isGranted);
        }
    }
}
