import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


// use helper.print("") or helper.println("") for printing logs else logs will not be visible.
public class Solution implements Q06WebpageVisitCounterInterface {
    private Helper06 helper;
    private AtomicInteger[] visitcounter;

    public Solution(){}

    public void init(int totalPages, Helper06 helper){
        this.helper=helper;
        // helper.println("restaurant rating module initialized");
        visitcounter = new AtomicInteger[totalPages];
        for(int i=0;i<totalPages;i++){
            visitcounter[i]=new AtomicInteger(0);
        }
        helper.println("Visit counter initialized for " + totalPages + " pages.");


    }

    // increment visit count for pageIndex by 1
    public void incrementVisitCount(int pageIndex) {
        visitcounter[pageIndex].incrementAndGet();

    }

    // return total visit count for a given page
    public int getVisitCount(int pageIndex) {
        return visitcounter[pageIndex].get();
    }
}

// uncomment below code in case you are using your local ide like intellij, eclipse etc and
// comment it back again back when you are pasting completed solution in the online CodeZym editor.
// if you don't comment it back, you will get "java.lang.AssertionError: java.lang.LinkageError"
// This will help avoid unwanted compilation errors and get method autocomplete in your local code editor.
/**
interface Q06WebpageVisitCounterInterface {
    void init(int totalPages, Helper06 helper);
    void incrementVisitCount(int pageIndex);
    int getVisitCount(int pageIndex);
}

class Helper06 {
    void print(String s){System.out.print(s);}
    void println(String s){System.out.println(s);}
}
*/
