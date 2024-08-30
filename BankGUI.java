
// creating a java frame for bankcard parent class
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    //making them instance variable to have access in different methods of the same class
    private JFrame jf,debitframe,creditframe;
    
    private JPanel jpb1,jpd2,jpc3;
    private JLabel bheadingl,Clientnamel,CIDl,ISBankl,BANkAccl,BALamtl,Clientnamedebl,CIDdebl,ISBankdebl,BANKAccdebl,BALamtdebl,Pinl,Withamtl,Withdatel,Dheadingl,CVClabell,Creditlimitl,Intratel,gperiodl,Expdatel,Cheadingl;
    private JTextField clinametf,BANKAcctf,CIDtf,ISBanktf,BALamttf,Intratetf,CVCtf,gperiodtf,Creditlimittf,Clientnamedebtf,BANKAccdebtf,ISBankdebtf,BALamtdebtf,Pintf,CIDdebtf,Withamttf;
    private JComboBox<String> Expdatecb,Withdatecb;
    private JButton Debportalb,credportalb,Displayb,Display,Clearb,Submitb,withdrawalb,addadebitb,setcredlmtb,cancredb,adddcredb,backb;
        //creating an object of the BankCard Class
    private ArrayList<Bankcard> albc = new ArrayList<Bankcard>();
    private Bankcard BankC;
    private Debit_card debc;
    private CreditCard credc;
    //creating the constructor to create object of the instance variable
    public BankGUI()
    {
        // creating main java frame 
        jf= new JFrame(" Banking Portal-22067889");
        debitframe=new JFrame("Debit Card -22067889");
        creditframe=new JFrame("Credit Card -22067889");
        jpb1 =new JPanel();//java panel for bank card class
        jpd2= new JPanel();//java panel for debit card class
        jpc3=new JPanel();//java panel for credit card class
        
        // labels of the bank card class also used in other two classes
        bheadingl=new JLabel("BANK CARD CLASS");
        Clientnamel= new JLabel("Client Name :");
        CIDl= new JLabel("Card ID :");
        ISBankl= new JLabel("Issuer Bank :");
        BANkAccl= new JLabel("Bank Account :");
        BALamtl= new JLabel("Balance Amount :");
        
        //labels used in debit card class only
        Clientnamedebl= new JLabel("Client Name :");
        CIDdebl= new JLabel("Card ID :");
        ISBankdebl= new JLabel("Issuer Bank :");
        BANKAccdebl= new JLabel("Bank Account :");
        BALamtdebl= new JLabel("Balance Amount :");
        Pinl= new JLabel("Pin Number :");
        Withamtl= new JLabel("Withdrawal Amount :");
        Withdatel= new JLabel("Withdrawal Date :");
        Dheadingl= new JLabel("DEBIT CARD CLASS");
        //labels used in credit card class only
        CVClabell= new JLabel("CVC Number :");
        Creditlimitl= new JLabel("Credit Limit :");
        Intratel= new JLabel("Interest Rate :");
        gperiodl= new JLabel("Grace Period :");
        Expdatel=new JLabel("Expiration Date :");
        Cheadingl= new JLabel("CREDIT CARD CLASS");
        
        // text fields for the labels above
        clinametf= new JTextField();
        BANKAcctf= new JTextField();
        CIDtf= new JTextField();
        ISBanktf= new JTextField();
        BALamttf= new JTextField();
        Intratetf= new JTextField();
        CVCtf= new JTextField();
        gperiodtf= new JTextField();
        Creditlimittf= new JTextField();
        Clientnamedebtf= new JTextField();
        BANKAccdebtf= new JTextField();
        ISBankdebtf= new JTextField();
        BALamtdebtf= new JTextField();
        Pintf= new JTextField();
        CIDdebtf= new JTextField();
        Withamttf= new JTextField();
        
        //array for the data in the combo boxes
        String withdrawal_date[]={"2023-04-26","2023-04-27","2023-04-28","2023-04-29","2023-04-30","2023-04-31"};
        String expiration_date[]={"2025-04-26","2025-04-27","2025-04-28","2025-04-29","2025-04-30","2025-04-31"};
        //creating combo box for withdrawal date(Expdatecb) and expiration date(Withdatecb)
        Expdatecb= new JComboBox<String>(expiration_date);
        Withdatecb=new JComboBox<String>(withdrawal_date);
        
        //creating the buttons for required objects
        Debportalb= new JButton("Debit Card");//only in bankcard class
        credportalb= new JButton("Credit Card");//only in bankcard class
        Displayb=new JButton("Display");//in credit class
        Display=new JButton("Display");//in debit class gui
        Clearb=new JButton("Clear");//in all classes gui
        Submitb=new JButton("Submit");//only in bankcard class
        
        //only in debitcard class
        withdrawalb= new JButton("Withdrawal");
        addadebitb=new JButton("Add Debit");
        
        //only in creditcard class
        setcredlmtb= new JButton("Set Credit Limit");
        cancredb= new JButton("Cancel Credit Card");
        adddcredb= new JButton("Add Credit");    
        
        backb =new JButton("Back");
        //setting the coordinates of different labels
        bheadingl.setBounds(50,20,200,30);
        Clientnamel.setBounds(103,149,120,34);
        CIDl.setBounds(223,283,120,34);
        ISBankl.setBounds(358,149,120,34);
        BANkAccl.setBounds(103,218,120,34);
        BALamtl.setBounds(780,149,120,34);
        
        //only for the debit card
        Clientnamedebl.setBounds(102,163,120,34);
        CIDdebl.setBounds(412,378,120,34);
        ISBankdebl.setBounds(337,163,120,34);
        BANKAccdebl.setBounds(102,237,120,34);
        BALamtdebl.setBounds(337,239,120,34);
        Pinl.setBounds(337,312,120,34);
        Withamtl.setBounds(585,263,120,34);
        Withdatel.setBounds(801,257,120,34);//combo box's label 
        Dheadingl.setBounds(403,42,200,30);//top label of second panel
        //only for credit card
        CVClabell.setBounds(584,149,120,34);
        Creditlimitl.setBounds(343,412,120,34);
        Intratel.setBounds(358,218,120,34);
        gperiodl.setBounds(343,348,120,34);
        Expdatel.setBounds(581,218,120,34);//combo box's label
        Cheadingl.setBounds(390,20,210,30);//top label of third panel
        
        //text fields
        clinametf.setBounds(103,182,180,32);
        BANKAcctf.setBounds(103,248,180,32);
        CIDtf.setBounds(223,313,180,32);
        ISBanktf.setBounds(358,182,180,32);
        BALamttf.setBounds(780,182,180,32);
        Intratetf.setBounds(358,248,180,32);
        CVCtf.setBounds(581,182,180,32);
        gperiodtf.setBounds(343,374,180,32);
        Creditlimittf.setBounds(343,444,180,32);
        Expdatecb.setBounds(581,248,180,32);
        
        
        //second panel
        Clientnamedebtf.setBounds(102,187,180,32);
        BANKAccdebtf.setBounds(102,263,180,32);
        ISBankdebtf.setBounds(337,187,180,32);
        BALamtdebtf.setBounds(337,263,180,32);
        Pintf.setBounds(337,337,180,32);
        CIDdebtf.setBounds(412,407,180,32);
        Withamttf.setBounds(585,295,200,49);
        Withdatecb.setBounds(801,287,180,32);//setting for the combo box
        
        //setting for the buttons
        Debportalb.setBounds(55,190,120,50);
        credportalb.setBounds(170,190,120,50);
        Displayb.setBounds(77,578,290,71);
        Display.setBounds(77,578,290,71);
        Clearb.setBounds(712,578,290,71);
        Submitb.setBounds(420,510,120,50);
        withdrawalb.setBounds(664,365,227,74);
        addadebitb.setBounds(95,343,215,70);
        
        backb.setBounds(883,61,167,42);
        
        setcredlmtb.setBounds(343,483,154,55);
        cancredb.setBounds(103,361,169,52);
        adddcredb.setBounds(780,241,186,70);
        
        //adding bank class heading to the to the panel
        jpb1.add(bheadingl);
        
        //adding buttons to the first panels
        jpb1.add(Debportalb);
        jpb1.add(credportalb);
        /*jpb1.add(Displayb);
        jpb1.add(Clearb);
        jpb1.add(Submitb);*/
        
        //setting the color to different labels in different GUI's
        //bank class
        bheadingl.setForeground(Color.ORANGE);
        // labels  used in credit card GUI
        Clientnamel.setForeground(Color.ORANGE);
        CIDl.setForeground(Color.ORANGE);
        ISBankl.setForeground(Color.ORANGE);
        BANkAccl.setForeground(Color.ORANGE);
        BALamtl.setForeground(Color.ORANGE);
        CVClabell.setForeground(Color.ORANGE);
        Creditlimitl.setForeground(Color.ORANGE);
        Intratel.setForeground(Color.ORANGE);
        gperiodl.setForeground(Color.ORANGE);
        Expdatel.setForeground(Color.ORANGE);
        Cheadingl.setForeground(Color.ORANGE);
        
        
        // labels used in debit card GUI 
        Clientnamedebl.setForeground(Color.ORANGE);
        CIDdebl.setForeground(Color.ORANGE);
        ISBankdebl.setForeground(Color.ORANGE);
        BANKAccdebl.setForeground(Color.ORANGE);
        BALamtdebl.setForeground(Color.ORANGE);
        Pinl.setForeground(Color.ORANGE);
        Withamtl.setForeground(Color.ORANGE);
        Withdatel.setForeground(Color.ORANGE);
        Dheadingl.setForeground(Color.ORANGE);
        
        //setting the color of the different buttons available in the GUIs
        Debportalb.setBackground(Color.ORANGE);
        credportalb.setBackground(Color.ORANGE);
        Displayb.setBackground(Color.ORANGE);
        Display.setBackground(Color.ORANGE);
        Clearb.setBackground(Color.ORANGE);
        Submitb.setBackground(Color.ORANGE);
        withdrawalb.setBackground(Color.ORANGE);
        addadebitb.setBackground(Color.ORANGE);
        setcredlmtb.setBackground(Color.ORANGE);
        cancredb.setBackground(Color.ORANGE);
        adddcredb.setBackground(Color.ORANGE);
        backb.setBackground(Color.ORANGE);
        
        // adding java panels to the frame created
        jf.add(jpb1);
        
        //actionlistener for responsiveness of buttons
        Debportalb.addActionListener(this);
        credportalb.addActionListener(this);
        Displayb.addActionListener(this);
        Display.addActionListener(this);
        Clearb.addActionListener(this);
        Submitb.addActionListener(this);
        withdrawalb.addActionListener(this);
        addadebitb.addActionListener(this);
        setcredlmtb.addActionListener(this);
        cancredb.addActionListener(this);
        adddcredb.addActionListener(this);
        backb.addActionListener(this);
        
        jpb1.setLayout(null);
        jpb1.setSize(400,400);
        jpb1.setBackground(Color.DARK_GRAY);

        bheadingl.setFont(new Font("SansSerif",Font.BOLD,20));//frist frame 
        Dheadingl.setFont(new Font("SansSerif",Font.BOLD,20));//second frame
        Cheadingl.setFont(new Font("SansSerif",Font.BOLD,20));//third frame 
        
        jf.setLayout(null);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// closses java frame if running in the background 
   
    }
    @Override
    
    public void actionPerformed(ActionEvent re)
    {
        //to have all the text area clear in all the different frames containing textfields
        if(re.getSource() ==Clearb)
        {
            clinametf.setText("");
            BANKAcctf.setText("");
            CIDtf.setText("");
            ISBanktf.setText("");
            BALamttf.setText("");
            Intratetf.setText("");
            CVCtf.setText("");
            gperiodtf.setText("");
            Creditlimittf.setText("");
            Clientnamedebtf.setText("");
            BANKAccdebtf.setText("");
            ISBankdebtf.setText("");
            BALamtdebtf.setText("");
            Pintf.setText("");
            CIDdebtf.setText("");
            Withamttf.setText("");
            JOptionPane.showMessageDialog(jf,"Cleared out all the textfields");
        }
        //takes us to debit card frame
        else if(re.getSource() == Debportalb)
        {
           debitframe.add(jpd2); 
           jpd2.setLayout(null);
           jpd2.setSize(1080,700);
           debitframe.setLayout(null);
           debitframe.setResizable(false);
           debitframe.setVisible(true);
           debitframe.setSize(1080,700);
           debitframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           creditframe.dispose();
           //addind labels to pannel of debit card frame
           jpd2.setBackground(Color.DARK_GRAY);
           jpd2.add(Dheadingl);
           jpd2.add(Clientnamedebl);
           jpd2.add(CIDdebl);
           jpd2.add(ISBankdebl);
           jpd2.add(BANKAccdebl);
           jpd2.add(BALamtdebl);
           jpd2.add(Pinl);
           jpd2.add(Withamtl);
           jpd2.add(Withdatel);
           //adding textfields to pannel of debit card frame
           jpd2.add(Clientnamedebtf);
           jpd2.add(BANKAccdebtf);
           jpd2.add(ISBankdebtf);
           jpd2.add(BALamtdebtf);
           jpd2.add(Pintf);
           jpd2.add(CIDdebtf);
           jpd2.add(Withamttf);
           //addinf combobox to debit card
           jpd2.add(Withdatecb);
           //adding other necessary button to pannel of debit card frame
           jpd2.add(backb);//backing button
           jpd2.add(Display);//display button
           jpd2.add(Clearb);//clear button
           jpd2.add(withdrawalb);//withdraw button
           jpd2.add(addadebitb);//add debit button
        }
        //exiting from the  gui's that are debit card frame and cerdit card frame 
        else if(re.getSource() == backb)
        {
            debitframe.dispose();
            creditframe.dispose();
        }
        //takes us to credit card frame 
        else if(re.getSource() == credportalb)
        {
           //setting credit card frame
           creditframe.add(jpc3); 
           jpc3.setLayout(null);
           jpc3.setSize(1080,700);
           jpc3.setBackground(Color.DARK_GRAY);
           creditframe.setLayout(null);
           creditframe.setResizable(false);
           creditframe.setVisible(true);
           creditframe.setSize(1080,700);
           creditframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           debitframe.dispose();
           
           jpc3.add(Cheadingl);
           jpc3.add(Clientnamel);
           jpc3.add(CIDl);
           jpc3.add(ISBankl);
           jpc3.add(BANkAccl);
           jpc3.add(BALamtl);
           jpc3.add(CVClabell);
           jpc3.add(Creditlimitl);
           jpc3.add(Intratel);
           jpc3.add(gperiodl);
           jpc3.add(Expdatel);
           
           //adding textfields 
           jpc3.add(clinametf);
           jpc3.add(BANKAcctf);
           jpc3.add(CIDtf);
           jpc3.add(ISBanktf);
           jpc3.add(BALamttf);
           jpc3.add(Intratetf);
           jpc3.add(CVCtf);
           jpc3.add(gperiodtf);
           jpc3.add(Creditlimittf);
           
           jpc3.add(Displayb);
           jpc3.add(Clearb);
           jpc3.add(setcredlmtb);
           jpc3.add(cancredb);
           jpc3.add(adddcredb);
           jpc3.add(backb);
           jpc3.add(Expdatecb);
        }
        //performs  action of add debit card 
        else if(re.getSource()== addadebitb)
        {
            if(Clientnamedebtf.getText().isEmpty() || BANKAccdebtf.getText().isEmpty() || ISBankdebtf.getText().isEmpty() ||BALamtdebtf.getText().isEmpty()||Pintf.getText().isEmpty()||CIDdebtf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(debitframe,"Empty Textfield found please fill it up proceed","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    String clientname = Clientnamedebtf.getText(); 
                    String issuerbank = ISBankdebtf.getText();
                    String bankaccount= BANKAccdebtf.getText();
                    int balanceamount= Integer.parseInt(BALamtdebtf.getText());
                    int cardId= Integer.parseInt(CIDdebtf.getText()); 
                    int PINnumber= Integer.parseInt(Pintf.getText());
                    //creating object of bankcard
                    if(albc.isEmpty())
                    {
                        Debit_card obj= new Debit_card(balanceamount,cardId,bankaccount,issuerbank,clientname,PINnumber);
                        albc.add(obj);
                        JOptionPane.showMessageDialog(debitframe,"DEBIT CARD ADDED");
                    }
                    else
                    {
                        for (Bankcard dl:albc)
                        {
                            if(dl instanceof Debit_card)
                            {
                                Debit_card debitcard=(Debit_card)dl;
                                if(dl.getCard_Id()==cardId)
                                {
                                    JOptionPane.showMessageDialog(debitframe,"Card id already exists  !!!  re-enter with different card id","Information",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }else
                                {
                                    Debit_card obj= new Debit_card(balanceamount,cardId,bankaccount,issuerbank,clientname,PINnumber);
                                    albc.add(obj);
                                    JOptionPane.showMessageDialog(debitframe,"DEBIT CARD ADDED");
                                    break;
                                }
                            }else
                                {
                                    Debit_card obj= new Debit_card(balanceamount,cardId,bankaccount,issuerbank,clientname,PINnumber);
                                    albc.add(obj);
                                    JOptionPane.showMessageDialog(debitframe,"DEBIT CARD ADDED");
                                    break;
                                }
                        }
                    }
                }
                catch(NumberFormatException ab)
                {
                    JOptionPane.showMessageDialog(debitframe,"some of the fields can't be entered as string","Alert",JOptionPane.ERROR_MESSAGE);
                    BANKAccdebtf.setText("");
                    Pintf.setText("");
                    CIDdebtf.setText("");
                }
            }
        }else if( re.getSource()==adddcredb )
        {
            if(clinametf.getText().isEmpty() || BANKAcctf.getText().isEmpty() || CIDtf.getText().isEmpty() || ISBanktf.getText().isEmpty() || BALamttf.getText().isEmpty() || Intratetf.getText().isEmpty() || CVCtf.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(creditframe,"Empty Textfield found please fill it up proceed","Alert",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                try
                {
                    int CardId = Integer.parseInt(CIDtf.getText());
                    String Clientname= clinametf.getText();
                    String issuerBank= ISBanktf.getText();
                    String BankAccount= BANKAcctf.getText();
                    int BalanceAmount= Integer.parseInt(BALamttf.getText());
                    int CVC= Integer.parseInt(CVCtf.getText());
                    double IntrestRate= Double.parseDouble(Intratetf.getText());
                    String ExpirationDate= Expdatecb.getSelectedItem().toString();
                    if(albc.isEmpty())
                    {
                        CreditCard objc= new CreditCard(CardId,Clientname,issuerBank,BankAccount,BalanceAmount,CVC,IntrestRate,ExpirationDate);
                        albc.add(objc);
                        JOptionPane.showMessageDialog(creditframe,"credit addition sucessfull");
                    }else
                    {
                        for(Bankcard fg:albc)
                        {
                            if(fg instanceof CreditCard)
                            {
                                CreditCard creditcard=(CreditCard)fg;
                                if(creditcard.getCard_Id()==CardId)
                                {
                                    JOptionPane.showMessageDialog(creditframe,"Card id already exists  !!!  re-enter with different card id","Information",JOptionPane.ERROR_MESSAGE);
                                    break;
                                }else
                                {
                                    CreditCard objc= new CreditCard(CardId,Clientname,issuerBank,BankAccount,BalanceAmount,CVC,IntrestRate,ExpirationDate);
                                    albc.add(objc);
                                    JOptionPane.showMessageDialog(creditframe,"credit addition sucessfull");
                                    break;
                                }
                            }else
                            {
                                CreditCard objc= new CreditCard(CardId,Clientname,issuerBank,BankAccount,BalanceAmount,CVC,IntrestRate,ExpirationDate);
                                albc.add(objc);
                                JOptionPane.showMessageDialog(creditframe,"credit addition sucessfull");
                                break;
                            }
                        }
                    }
                }
                catch(NumberFormatException ab)
                {
                    JOptionPane.showMessageDialog(creditframe,"some of the fields can't be entered as string","Alert",JOptionPane.ERROR_MESSAGE);
                    BANKAcctf.setText("");
                    BALamttf.setText("");
                    Intratetf.setText("");
                }
            }
        }else if( re.getSource()==cancredb)
        {
            if(CIDtf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(creditframe,"Empty Textfield found please fill it up proceed","Alert",JOptionPane.ERROR_MESSAGE);
            }else
            {
                int cancredid=Integer.parseInt(CIDtf.getText());
                for(Bankcard el:albc)
                {
                    if(el instanceof CreditCard)
                    {
                        if(cancredid==el.getCard_Id())
                        {
                           CreditCard cred =(CreditCard)el;
                           cred.cancelCreditCard();
                           break;
                        }else
                        {
                            JOptionPane.showMessageDialog(creditframe,"Credit card doesn't exist","Alert",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }else
                    {
                        JOptionPane.showMessageDialog(creditframe,"Credit card doesn't exist","Alert",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
            }
        }else if(re.getSource() == setcredlmtb)
        {
           if(CIDtf.getText().isEmpty() || Creditlimittf.getText().isEmpty() || gperiodtf.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(creditframe,"Empty Textfield found please fill it up proceed","Alert",JOptionPane.ERROR_MESSAGE);
           }else
           {
               try
               {
                   int cardid=Integer.parseInt(CIDtf.getText());
                   int gracep=Integer.parseInt(gperiodtf.getText());
                   Double creditl=Double.parseDouble( Creditlimittf.getText());
                   for(Bankcard fl:albc)
                   {
                       if(cardid!=fl.getCard_Id())
                       {
                           JOptionPane.showMessageDialog(debitframe,"Invalid Card id.","Alert",JOptionPane.ERROR_MESSAGE);
                           break;
                       }else
                       {
                           if(creditl>(2.5*(fl.getBalanceAmount())))
                           {
                              JOptionPane.showMessageDialog(debitframe,"insufficent balance inorder to set credit limit","Alert",JOptionPane.ERROR_MESSAGE);
                              break;
                           }else
                           {
                               CreditCard creditcard=(CreditCard)fl;
                               creditcard.setCreditLimit(creditl,gracep);
                               JOptionPane.showMessageDialog(debitframe,"credit limit has been set ");
                               break;
                           }
                       }
                   }
               }
               catch(NumberFormatException ab)
               {
                   JOptionPane.showMessageDialog(creditframe,"Number format expection handeling done","Alert",JOptionPane.ERROR_MESSAGE);
               }
           }
        }else if(re.getSource() == withdrawalb)
        {
           if(CIDdebtf.getText().isEmpty() || Pintf.getText().isEmpty() || Withamttf.getText().isEmpty())
           {
              JOptionPane.showMessageDialog(debitframe,"EMPTY Text Field found","Alert",JOptionPane.ERROR_MESSAGE); 
           }else
           {
              try
              {
                 int cardId=Integer.parseInt(CIDdebtf.getText());
                 int pinnum=Integer.parseInt(Pintf.getText());
                 int withamt=Integer.parseInt(Withamttf.getText());
                 String dofwith=Withdatecb.getSelectedItem().toString();
                 if (albc.isEmpty())
                 {
                     JOptionPane.showMessageDialog(debitframe,"No debit card  found.","Alert",JOptionPane.ERROR_MESSAGE);
                 }else
                 {
                     for(Bankcard gl:albc)
                     {
                         if(gl instanceof Debit_card)
                         {
                             Debit_card withdraw=(Debit_card)gl;
                             if(cardId!=withdraw.getCard_Id())
                             {
                                 JOptionPane.showMessageDialog(debitframe,"Invalid Card id.","Alert",JOptionPane.ERROR_MESSAGE);
                                 break;
                             }else
                             {
                                 if(pinnum == withdraw.getPINnumber())
                                 {
                                     Debit_card debitcard=(Debit_card)gl;
                                     debitcard.Withdraw(withamt,dofwith,pinnum);
                                     JOptionPane.showMessageDialog(debitframe,"data update successfull");
                                     //debitcard.hasWithdrawn(true);
                                     break;
                                 }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(debitframe,"Invalid Pin number .","Alert",JOptionPane.ERROR_MESSAGE);
                                     break;
                                 }
                             }
                         }
                     }
                 }
              }catch(NumberFormatException f)
              {
                 JOptionPane.showMessageDialog(creditframe,"Empty Textfield found please fill it up proceed","Alert",JOptionPane.ERROR_MESSAGE);
                 Withamttf.setText("");
                 Pintf.setText("");
                 CIDdebtf.setText("");
              }
           }
        }else if(re.getSource() == Displayb)
        {
            if (albc.isEmpty())
            {
                JOptionPane.showMessageDialog(creditframe,"thier's no info to be shown,thanks","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                for(Bankcard hl:albc)
                {
                    if(hl instanceof CreditCard)
                    {
                        CreditCard disp=(CreditCard)hl;
                        disp.display();
                    }
                }
            }
        }else
        {
            if (albc.isEmpty())
            {
                JOptionPane.showMessageDialog(debitframe,"thier's no info to be shown,thanks","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                for(Bankcard jl:albc)
                {
                    if(jl instanceof Debit_card)
                    {
                        Debit_card disp=(Debit_card)jl;
                        disp.display();
                    }
                }
            }
        }
    }
    public static void main(String[]args)
    {
        new BankGUI();
    }
}