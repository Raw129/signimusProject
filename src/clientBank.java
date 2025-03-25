import java.util.LinkedList;
import java.util.List;

class BankManement {
    private String AccountHolderName;
    private int AccountHolderNumber;
    private String AccountHolderNomini;

    public BankManement(String AccountHolderName,int AccountHolderNumber,String AccountHolderNomini) {
        this.AccountHolderName = AccountHolderName;
        this.AccountHolderNumber = AccountHolderNumber;
        this.AccountHolderNomini = AccountHolderNomini;
    }
    public String getAccountHolderName(){
        return AccountHolderName;
    }
    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName=AccountHolderName;
    }
    public int getAccountHolderNumber(){
        return AccountHolderNumber;
    }
    public void setAccountHolderNumber(int AccountHolderNumber){
        this.AccountHolderNumber=AccountHolderNumber;
    }
    public String getAccountHolderNomini(){
        return AccountHolderNomini;
    }
    public void setAccountHolderNomini(String AccountHolderNomini){
        this.AccountHolderNomini=AccountHolderNomini;
    }
}
class BankManement2 {
    private String AccountHolderName;
    private int AccountHolderNumber;
    private String AccountHolderNomini;

    public BankManement2(String AccountHolderName, int AccountHolderNumber, String AccountHolderNomini) {
        this.AccountHolderName = AccountHolderName;
        this.AccountHolderNumber = AccountHolderNumber;
        this.AccountHolderNomini = AccountHolderNomini;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }

    public int getAccountHolderNumber() {
        return AccountHolderNumber;
    }

    public void setAccountHolderNumber(int AccountHolderNumber) {
        this.AccountHolderNumber = AccountHolderNumber;
    }

    public String getAccountHolderNomini() {
        return AccountHolderNomini;
    }

    public void setAccountHolderNomini(String AccountHolderNomini) {
        this.AccountHolderNomini = AccountHolderNomini;
    }
        }

    public class clientBank {
    public static void main(String[] args) {
    BankManement Bank = new BankManement("Anuj Soni",4001153,"Sandhya");
      System.out.println("Account Hoder Name: "+Bank.getAccountHolderName());
      System.out.println("Account Holder Number: "+Bank.getAccountHolderNumber());
      System.out.println("Account Holder Nomini: "+Bank.getAccountHolderNomini());
    BankManement2 Bank2=new BankManement2("Sandhya ",20011,"Anuj");
        System.out.println("Account Hoder Name: "+Bank2.getAccountHolderName());
        System.out.println("Account Holder Number: "+Bank2.getAccountHolderNumber());
        System.out.println("Account Holder Nomini: "+Bank2.getAccountHolderNomini());
       // BankManement persion=new BankManement("Sandeep Baghel",200554,"Mohan");


}}
