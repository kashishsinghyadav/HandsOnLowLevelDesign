import java.util.ArrayList;
import java.util.List;

public class Bookmain{
    public static void main(String[] args) {
        User user = new User("Kashish",1);
        // System.out.println(user.getId());
        // System.err.println(user.getName());

        Movie movie = new Movie("KrishnaRadhajiOrkashishhhhh",300.0);
        // System.err.println(movie.getPrice());
        // System.out.println(movie.movieName());
        Movie movie1 = new Movie("SirrrrrrrrrrrrrorMai",10.0); 
        List<Movie> list= new ArrayList<>();
        list.add(movie);
        list.add(movie1);
        
        Seat balcony = new Seat(1, "Balocony", 5);
        Seat regular = new Seat(2, "Normal", 3);
        Seat vip = new Seat(3, "Vip",2);
        List<Seat> seallist = new ArrayList<>();
        seallist.add(balcony);
        seallist.add(vip);
        seallist.add(regular);

        Theater t1 = new Theater("PVR");
        t1.addSeat(vip);
        t1.addSeat(balcony);
        t1.addSeat(regular);
        Payment paymentMethod = new UpiPayment();
        Notification notification = new Notification();
        notification.addObserver(user);


        FacadeClass bookingclass = new FacadeClass(notification);
        
        bookingclass.BookTicket(movie, t1, balcony);
        bookingclass.makePayment(paymentMethod);



        

    }


}
