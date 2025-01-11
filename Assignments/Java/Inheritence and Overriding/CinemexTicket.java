public class CinemexTicket extends MovieTicket{
    private static int total_tickets = 0;
    public String genre;
    public String seat_type = "Regular";
    public boolean paid = false;
    public CinemexTicket(String movie, String showtime, String genre, String date){
        super(movie, date, showtime, seatPrices[0]);
        this.genre = genre;
        total_tickets++;
    }
    public CinemexTicket(String movie, String showtime, String genre, String date, String seat_type){
        super(movie, date, showtime, 0);
        this.genre = genre;
        this.seat_type = seat_type;
        double price = 0;
        for(int i = 0; i < seatTypes.length; i++){
            if(seat_type.equals(seatTypes[i])){
                price = seatPrices[i];
            }
        }
        setPrice(price);
        total_tickets++;
    }
    public static int getTotalTickets(){
        return total_tickets;
    }
    public void calculateTicketPrice(){
        double price = 0;
        String time[] = showtime.split(":");
        int hours = Integer.parseInt(time[0]);
        if(hours >= 18 && hours <= 23){
            price = getPrice() + (getPrice() * nightShowCharge/100.0);
        }
        else{
            price = getPrice();
        }
        setPrice(price);
        System.out.println("Ticket price is calculated successfully.");
    }
    public String toString() {
        String temp = "";
        if(paid == false){
            temp = "Not Paid";
        }
        else{
            temp = "Paid";
        }
        return "Ticket ID: " + getMovie() + "-" + seat_type.charAt(0) + "-" + getTotalTickets() + "\n" +
            super.toString() + "\nGenre: " + genre + "\nSeat Type: " + 
            seat_type + "\nPrice(tk): " + getPrice() + "\nStatus: " + temp;
    }
    public String confirmPayment(){
        if(paid == false){
            paid = true;
            return "Payment Successful.";
        }
        else{
            return "Ticket price is already paid!";
        }
        
    }
}