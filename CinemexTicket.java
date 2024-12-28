// CSE-111 LAB - 7 TASK - 7     []
// T-7 CinemexTicket class

public class CinemexTicket extends MovieTicket{
    private static int ticketCount = 0;
    private String ticket_ID;
    private String genre;
    private String status;
    private String seat_type;
    private double price;
    
    public CinemexTicket(String movie_name_0, String showtime_0, String genre_0, String date_0){
        super(movie_name_0, date_0, showtime_0, 0.0);
        this.genre = genre_0;
        this.status = "Not Paid";
        this.seat_type = "Regular";
        ticketCount++;
        this.ticket_ID = movie_name_0 + "-" + seatTypes[0].charAt(0) + "-" + ticketCount;
    }
    
    public CinemexTicket(String movie_name_1, String showtime_1, String genre_1, String date_1, String seat_type_1){
        super(movie_name_1, date_1, showtime_1, 0.0);
        this.genre = genre_1;
        this.status = "Not Paid";
        this.seat_type = seat_type_1;
        ticketCount++;
        this.ticket_ID = movie_name_1 + "-" + seatTypes[0].charAt(0) + "-" + ticketCount;
    }
    
    public void calculateTicketPrice(){
        int index = 0;
        for(int i = 0; i < seatTypes.length; i++){
            if(seatTypes[i].equals(seat_type)){
                index = i;
                break;
            }
        }

        price = seatPrices[index];

        String sht_0 = showtime.split(":")[0];
        int time = Integer.parseInt(sht_0);

        if(time >= 0 && time <= 0){
            price += (price * nightShowCharge) / 100;
        }

        System.out.println("Ticket price is calculated successfully.");
    }
    
    public String confirmPayment(){
        status = "Paid";
        return "Payment Successful.";
    }
    
    public String toString(){
        return "Ticket ID: " + ticket_ID + "\nMovie: " + getMovie() + "\nShowtime: " + showtime + "\nDate: " + date + "\nGenre: " + genre + "\nSeat Type: " + seat_type + "\nPrice(tk): " + price + "\nStatus: " + status;
    }
    
    public static int getTotalTickets(){
        return ticketCount;
    }
}
    
