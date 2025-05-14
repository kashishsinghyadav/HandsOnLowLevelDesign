public class FacadeClass {
    private Movie movieService ;
    private Payment paymentService;
    private Notification notification;



    public FacadeClass( Notification notification) {
                this.notification = notification;

    }
   public void BookTicket(Movie movieService, Theater theaterService, Seat seat) {
    this.movieService = movieService;
    System.out.println("Booking ticket for: " + movieService.getmovieName());
    System.out.println("In Theater: " + theaterService.getTheaterName());
    System.out.println("Seat book for" + seat.getseatId());
    
    System.out.println("Choose mehtod to make payment of Rs"+ movieService.getPrice());
}

public void makePayment(Payment paymentService){
    paymentService.pay(movieService.getPrice());      
    System.out.println();  
    notification.notifyAllObservers("Booking successful for " + movieService.getmovieName());



}
public void setPayment(Payment paymentService){
    this.paymentService=paymentService;

}


}

