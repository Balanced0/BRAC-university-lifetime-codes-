public class TaxiLagbe{
    public String taxi_num;
    public String location;
    public int total_passenger;
    public String arr[] = new String[4];
    public int fare;
    
    public void storeInfo(String taxi_num, String location){
        this.taxi_num = taxi_num;
        this.location = location;
    }
    
    public void addPassenger(String name1, int money){
        if(this.total_passenger < 4){
            arr[this.total_passenger] = name1;
            this.total_passenger = this.total_passenger + 1;
            System.out.println("Dear " + name1 + "! Welcome to TaxiLagbe");
            this.fare = this.fare + money;
        }
        else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    
    public void addPassenger(String name1, int money1, String name2, int money2){
        if(this.total_passenger < 4){
            arr[this.total_passenger] = name1;
            arr[this.total_passenger + 1] = name2;
            this.total_passenger = this.total_passenger + 2;
            System.out.println("Dear " + name1 + "! Welcome to TaxiLagbe");
            System.out.println("Dear " + name2 + "! Welcome to TaxiLagbe");
            this.fare = this.fare + money1;
            this.fare = this.fare + money2;
        }
        else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    
    public void printDetails(){
        System.out.println("Taxi number: " + this.taxi_num);
        System.out.println("This taxi can cover " + this.location + " area");
        System.out.println("Total Passenger: " + this.total_passenger);
        System.out.println("Passenger Lists: ");
        for(int i = 0; i < this.total_passenger; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
        System.out.println("Total collected fare: " + this.fare + " Taka");
    }
}