public class Recursion{

   public int factorial(int num){
        if (num==1){ return num;}
        return num*factorial(num-1);
   }
   
   public static void main(String...args){
      Recursion recursion=new Recursion();
     
      System.out.println(recursion.factorial(3));
   }
   
}   