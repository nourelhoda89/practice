import java .util.*;

public class DriverLambda {
   static int count=0;

   public static void main (String... args){ 
   
   ArrayList<Thread> threads=new ArrayList<>();
   
      for (int i =0;i<10;i++){
      
     threads.add(new Thread(() ->{
               int myNumber = count;
               count++;
               try{
                  Thread.sleep((int)(Math.random()*10000));
                  System.out.println("Thread-"+ myNumber+"running");
               }
               catch (Exception e){
                  System.out.println ("Thread-"+myNumber+"interrupted");
               }
            }));
      }
      System.out.println(threads);

   threads.stream().forEach((thread)-> thread.start());
   threads.sort((a,b) -> b.getName().compareTo(a.getName()));
   ArrayList<String> names =threads 
   System.out.println(threads);
   }
}