package order;

public class Item{
   private String name;
   private double price;
   private int quantity;
   
   private Item(){
      this.name=null;
      this.price=0;
      this.quantity=0;
   }
   public Item(String name, double price,int quantity){
      this.name=name;
      this.price=price;
      this.quantity=quantity;
   }
   public String getName(){
      return name;
   }
   public double getPrice(){
      return price;
   }
   public double getQuantity(){
      return quantity;
   }
   public String toString(){
      return this.getName()+" " + this.getPrice() +" "+ this.getQuantity()+" "+ this.getPrice() *this.getQuantity();
   }
}
