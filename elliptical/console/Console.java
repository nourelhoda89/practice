package elliptical.console;
import elliptical.console.Fan;

public class Console{
   private int height;
   private int width;
   private Fan fan;

   private Console(){
      this.height=0;
      this.width=0;
      this.fan=null;
   }

   public Console( int height, int width,Fan fan){
      this.height=height;
      this.width=width;
      this.fan=fan;
   }
   public int getHeight(){
      return height;
   }
   public int getWidth(){
      return width;
   }
   public Fan getFan(){
      return fan;
   }
   public Console setFan(Fan fan){
   this.fan=fan;
   return this;
   }
}
