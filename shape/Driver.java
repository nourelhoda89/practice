package shape;

import shape.ellipse.*;
import shape.*;
import java.util.*;

public class Driver{

   public static void main (String...args){
      TwoDimentionalShape[] shapes =new TwoDimentionalShape[2];
      shapes[0]=new Circle(5);
      shapes[1]=new Ellipse(5,5);
   
      System.out.println(shapes[0].equals(shapes[1]));
   
      for(int i=0; i< shapes.length;i++){
         System.out.println(shapes[i].toString());
      }
      System.out.println(Circle.toCircle(shapes[1]));
   
   }
}