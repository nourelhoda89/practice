package shape.ellipse;
import shape.ellipse.Ellipse;
import shape.*;


public final class Circle extends Ellipse{
   private double r;

   private Circle(){
      super(0.0,0.0);
      this.r=0;
   }
   public Circle(double r){
      super(r,r);
      this.r=r;
   }   
   public final String toString(){
      return "radius: "+ super.getMajorAxis()+ "The area:"+ area();
   }
   
   public static Circle toCircle(TwoDimentionalShape shape){
      double radius=Math.sqrt( shape.area()/Math.PI);
      return new Circle(radius);
   
   }
}