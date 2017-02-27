package elliptical.console;

public class Fan{
   private boolean withFan;
   
   private Fan(){
      this.withFan=false;
   }
   private void setWithFan(boolean withFan){
      this.withFan=withFan;
   }
   public Fan fanIncluded(){
      this.setWithFan(true);
      return this;
   }
   public Fan fanNotIncluded(){
      this.setWithFan(false);
      return this;
   }
}
