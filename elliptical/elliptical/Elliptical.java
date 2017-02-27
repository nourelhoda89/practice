package elliptical.elliptical;

import elliptical.console.Console;

public class Elliptical{
   private Console console;
   double weight;
   private Elliptical(){
      this.console=null;
      this.weight=0.0;
   }
   public Elliptical(double weight,Console console){
      this.weight=weight;
      this.console=console;
   }
   public double getWeight(){
      return weight;
   }
   public Console getConsole(){
      return console;
   }
   public Elliptical setWeight(double weight){
      this.weight= weight;
      return this;
   }
   public Elliptical setConsole(Console console)throws Exception{
      if(console==null) {throw new Exception("cosole can't be null");}
      this.console=console;
      return this;
   }
}
