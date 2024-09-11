package tapasao;

public class Order {
    
    int id;
    String name;
    int date;
    double amount;
    String status;
    
    
    public void addOrders(int id, String name, int date, double amount, String status){
        this.id = id;
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.status = status;
        
    }
    
    public void ViewOrders(){
        System.out.printf("%-10d %-10s %-10d %-10.2fn %-10s", this.id, this.name, this.date, this.amount, this.status);
    }
          

    
}
