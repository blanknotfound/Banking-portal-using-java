public class Debit_card extends Bankcard//subclass creation
{
    private int PINnumber;//variable declaration
    private int WithdrawalAmount;//variable declaration
    private String dateofWithdarwal;//variable declaration
    private boolean hasWithdrawn;//variable declaration
    
    //constructor
    public Debit_card(int BalanceAmount,int Card_Id, String bank_account, String issuer_bank,
    String Client_name,int PINnumber)
    {
        super(BalanceAmount,Card_Id,bank_account,issuer_bank);
        setclient_name(Client_name);
        this.PINnumber=PINnumber;
        this.hasWithdrawn=false;
    }
    //get methods
    public int getPINnumber()
    {
      return this.PINnumber;
    }
    
    public int getWithdrawalAmount()
    {
      return this.WithdrawalAmount;
    }
    
    public String getdateofWithdrawal()
    {
      return this.dateofWithdarwal;
    }
    
    public boolean gethasWithdrawn()
    {
      return this.hasWithdrawn;
    }
    //set method
    public void setWithdraw(int WithdrawalAmount)
    {
        this.WithdrawalAmount= WithdrawalAmount;
    }
    //Display method which prints data to the user screen or terminal
    public void Withdraw(int WithdrawalAmount, String dateofWithdarwal, int PINnumber)
    {
        if(this.PINnumber==PINnumber)//if to check pinnumber
        {
            if(getBalanceAmount()>=WithdrawalAmount)//nested if to check either balance amount is equal or greater than withdrawlamount 
            {
                this.dateofWithdarwal=dateofWithdarwal;
                this.WithdrawalAmount=WithdrawalAmount;
                System.out.println("The amount has been withdrawn successfully:"+WithdrawalAmount);  
                setbalanceAmount(getBalanceAmount()-WithdrawalAmount); 
                System.out.println("Your current balance is: "+getBalanceAmount());
                System.out.println("DAte of withdrawal: "+dateofWithdarwal);
                hasWithdrawn=true;
            }
            else
            {
                System.out.println("Please check your bank balance.");  
            }
        }
        else
        {
            System.out.println("Invalid pin number!! please try again");
        }
    }
    
    //displaying data to the user screen overriding previous diplay method from super class
    @Override
    public void display()
    {
        super.display();
        System.out.println("your PINNUMBER is :"+PINnumber);
        System.out.println("the amount withdrawn from your account is  :"+WithdrawalAmount);
        System.out.println("date withdrawn at :"+dateofWithdarwal);
        if(this.hasWithdrawn==false)//if condition to check wtihdrawn done or not 
        {
            System.out.println("transaction not carried out ");
            System.out.println("your bank balance is:"+getBalanceAmount());
        }
        /*else
        {
        System.out.println("the amount withdrawn from your account is  :"+WithdrawalAmount);
        System.out.println("date withdrawn at :"+dateofWithdarwal);
        }*/
    }
    }
