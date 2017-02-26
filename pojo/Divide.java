package pojo;

public class Divide{
   private int answer;

   public Divide(){
       this.answer = 0;
   }

   public int divide()  {
    try{
       POJO pojo= new POJO();
       pojo.setNum(9);
       pojo.setDenom(0);
       answer = pojo.getNum()/pojo.getDenom();
       
    }catch (Exception e){
       System.out.println ("can't divide by zero");
       throw e;
     }
     return answer;
   }
   public static void main(String...args){
      Divide d = new Divide();
      System.out.println(d.divide());
   }

}
