package pojo;


public class Test{

   public void TestGetNum(){
      System.out.println("Testing POJO ::getNum");
      POJO pojo =new POJO(9,0);
      assert (pojo.getNum() == 9); 
   }
   
   public void TestGetDenom(){
      System.out.println("Testing POJO ::getDenom");
      POJO pojo =new POJO(0,8);
      assert (pojo.getDenom() == 8); 
   }
   public void TestSetNum(){
      System.out.println("Testing POJO :: setNum");
      POJO pojo =new POJO();
      pojo.setNum(5);
      assert (pojo.getNum() == 5); 
   }
   public void TestSetDenom(){
      System.out.println("Testing POJO :: setDenom");
      POJO pojo =new POJO();
      pojo.setDenom(3);
      assert (pojo.getDenom()== 3); 
   }


   public static void main(String...args){
      Test test = new Test();
      test.TestGetNum();
      test.TestGetDenom();
      test.TestSetNum();
      test.TestSetDenom();
      System.out.print("Tests completed");
   }

}