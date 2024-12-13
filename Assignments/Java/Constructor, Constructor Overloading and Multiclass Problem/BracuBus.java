public class BracuBus{
    public String route;
    public int max = 2;
    public int count = 0;
    public BracuBus(String route){
        this.route  = route;
    }
    public BracuBus(String route, int max){
        this.route  = route;
        this.max = max;
    }
    public String seat[] = new String[max];
    public void board(){
        System.out.println("No passengers");
    }
    public void board(BracuStudent student){
        if(student.pass == true){
            if(student.place.equals(route)){
                if(count < max){
                    seat[count] = student.name;
                    System.out.println(student.name + " boarded the bus.");
                    count++;
                }
                else{
                    System.out.println("Bus is full!");
                }
            }
            else{
                System.out.println("You got on the wrong bus!");
            }
        }
        else{
            System.out.println("You don't have a bus pass!");
        }
    }
    public void board(BracuStudent s1, BracuStudent s2){
        board(s1);
        board(s2);
    }
    public void showDetails(){
        System.out.println("Bus Route: " + route);
        System.out.println("Passenger Count: " + count + " (Max: " + max + ")");
        System.out.println("Passengers on Board:");
        for(int i = 0 ; i < count; i++){
            System.out.print(seat[i] + " ");
        }
        System.out.println();
    }
}