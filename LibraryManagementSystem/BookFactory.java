public class BookFactory{
    public static Book createBook(String bookname){
        if(bookname.equalsIgnoreCase("Godan")){
            return new Godan(bookname);
        }
        else if(bookname.equalsIgnoreCase("NumberofUniverseis42")){
            return new NumberofUniverseis42(bookname);
        }
        else{ 
            return null;
        }
        }   
     }
