package shape;

abstract public class TwoDimentionalShape{
   abstract public double area();
   public final  boolean equals(TwoDimentionalShape shape){
      return shape.area()==this.area();
   }
}