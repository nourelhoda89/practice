package animal;

public class Dog extends Animal{
   private String bark;
   private String wimper;

   private Dog(){
   super(null);
      this.bark=this.wimper=null;
   }
   public Dog(String bark,String wimper,String growl){
     super(growl);
      this.bark="bark";
      this.wimper="wimper";
   }
   public String toString(){
      return "The dog  bark with a " +this.bark+" and wimper with a " +this.wimper+ " and "+ super.toString();
   }
}