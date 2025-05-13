public class FacadeClass {
    private Movie movieService ;
    private  Theater theaterService;
    private Payment paymentService;
    private Seat seatService;

    public FacadeClass(Movie movieService, Payment paymentService, Seat seatService, Theater theaterService) {
        this.movieService = movieService;
        this.paymentService = paymentService;
        this.seatService = seatService;
        this.theaterService = theaterService;
    }
   public void BookTicket(Movie movie, Theater theater, Payment payment, Seat seat) {
    System.out.println("Booking ticket for: " + movie.getmovieName());
    System.out.println("In Theater: " + theater.getTheaterName());
    payment.pay((int) movie.getPrice());
    System.out.println("Seat booked: " + seat.getSeatType());
}


}
