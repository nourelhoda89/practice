package pojo;

public class Divide{
   private int answer;
   
   public Divide(){
   this.answer = 0;
   }
   
   public int divide(){
    POJO pojo= new POJO();// or use POJO pojo= new POJO(9,3); instead of calling setNum and setDenom??
    pojo.setNum(9);
    pojo.setDenom(3);
     answer = pojo.getNum()/pojo.getDenom(); 
     answer
     return answer;
   }

   public static void main(String...args){
      Divide d = new Divide();
      System.out.println(d.divide());
   }

}










