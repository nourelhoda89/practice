package animal;

public class Cat extends Animal{
   private String meow;
   private String purr;

   private Cat(){
   super(null);
      this.meow=this.purr=null;
   }
   public Cat(String meow,String purr,String growl){
     super(growl);
      this.meow="meow";
      this.purr="purr";
   }
   public String toString(){
      return "The cat  meow with a " +this.meow+" and purr with a " +this.purr+ " and "+ super.toString();
   }
}