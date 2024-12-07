public class BankAccount{
    public int info = 0;
    public String type = "Not Set";
    public void setInfo(int info, String type){
        this.info = info;
        this.type = type;
        System.out.println("Account information updated!");
    }
    public String printDetails(){
        return "Account No: " + info + "\nType: " + type;
    }
}