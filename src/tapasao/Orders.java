package tapasao;
import java.util.Scanner;
import java.time.LocalDate;

public class Orders {
   
    
    public void OrderStatus(){
        Scanner sc = new Scanner(System.in);
        Order[]or = new Order[500];
        
        System.out.print("Enter number of Orders: ");
        int nums = sc.nextInt();
        
        for(int i=0; i< nums; i++){
            
            System.out.print("Enter details of order " +(i+1)+":");
            System.out.println("\n");
                    
            System.out.printf("Order ID: ");
            int id = sc.nextInt();
            System.out.printf("Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Order Date: ");
            int date = sc.nextInt();
            System.out.print("Order Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Order Status: ");
            String status = sc.nextLine();
            
            or[i] = new Order();
            or[i].addOrders(id, name, date, amount, status);
        }  

        for(int i=0; i < nums; i++){
            or[i].ViewOrders();
            
            
        }
    }
    
    
}
