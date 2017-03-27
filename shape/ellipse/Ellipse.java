package shape.ellipse;

import shape.TwoDimentionalShape;

public class Ellipse extends TwoDimentionalShape{
   private double majorAxis;
   private double minorAxis;

   private Ellipse(){
      this.majorAxis=this.minorAxis=0;
   }
   public Ellipse(double majorAxis,double minorAxis ){
      this.majorAxis=majorAxis;
      this.minorAxis=minorAxis;
   }
   public double getMajorAxis(){
      return majorAxis;
   }
   public double getMinorAxis(){
      return minorAxis;
   }
   public double area(){
      return Math.PI*majorAxis* minorAxis;
   }
   public String toString(){
      return "majorAxis: "+ majorAxis+"and minorAxis "+minorAxis+ "the area is :"+ area();
   }

}
