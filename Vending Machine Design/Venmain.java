import java.util.Scanner;

public class Venmain {
    public static void main(String[] args) {
        Vedingcontext cont = new Vedingcontext();
        Inventory invent = new Inventory(); 
        invent.addProduct("Drink", 15);
        invent.addProduct("Chocolate", 20);
        invent.printInventory();
        cont.idlestate();
        
        cont.selectProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name to buy:");
        
        String selectedProduct = scanner.nextLine().trim();
      
        Product product = invent.getProduct(selectedProduct);
        cont.setSelectedProduct(product);

        System.out.println("Price: ₹" + product.getPrice());
        if (product == null || product.getQuantity() <= 0) {
            System.out.println("Product not available or out of stock.");
            
        }
        else{
        cont.setPayment(new Coinbased());
        cont.makepayment();
        cont.dispensory();

        }
        
        

        }
    }

      
       
