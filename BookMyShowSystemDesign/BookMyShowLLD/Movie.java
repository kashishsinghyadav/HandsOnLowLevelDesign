public class Movie {
    private String movieName;
    private  double price;
    public Movie(String movieName,double price){
        this.movieName=movieName;
        this.price=price;

    }
    public double getPrice(){
        return this.price;
    }
    public String getmovieName(){
        return this.movieName;
    }
}
