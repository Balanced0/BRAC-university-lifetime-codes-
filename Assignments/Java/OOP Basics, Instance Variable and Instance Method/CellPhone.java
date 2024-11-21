public class CellPhone{
    public String model = "unknown";
    public int contactCount;
    public String[] contacts = new String[3];
    public void printDetails(){
        System.out.println("Phone Model " + this.model);
        System.out.println("Contacts Stored " + this.contactCount);
        if(this.contactCount > 0){
            System.out.println("Stored Contacts:");
            for(int i = 0; i < contactCount; i++){
                System.out.println(contacts[i]);
            }
        }
        
    }
    public void storeContact(String info){
        if(this.contactCount < 3){
            this.contacts[contactCount] = info;
            this.contactCount = this.contactCount + 1;
            System.out.println("Contact Stored");
        }
        else{
            System.out.println("Memory full. New contact can't be stored.");
        }       
    }
}