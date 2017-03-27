package animal;

abstract public class Animal{
   private String growl;
   
   private Animal(){
      this.growl=null;
   }
   public Animal(String growl){
      this.growl=growl;
   }
   public String toString(){
      return "growl with a " +this.growl;
   }

}
