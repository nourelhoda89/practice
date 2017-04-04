package driver;

public class Example implements Optional, Mysterious{
   private Optional optional;
   
   public Example(){
      this .optional = null;
   }
   
   public Example(Optional optional){
      this.optional=optional ;
   }
   
   public void doOptional(){
      if (optional!=null){
         optional.doOptional();
      }
      else System.out.println("default optional");
   }
   
   public void doMysterious(Injectable injectable){
      injectable.doInjectableMethod();
   }
}