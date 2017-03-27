package animal;
import java.util.*;

public class Driver{

//know what animal
  /* public static void main(String...args){
   
   
      Animal[] animals = new Animal[2];
      animals[0]=new Cat("mewo","purr","growl");
      animals[1]=new Dog("bark","wimper","growl");
      
      for(int i=0; i< animals.length;i++){
      animalSay(animals[i]);
      }
      
   }
   public static void animalSay(  Animal animal){
   System.out.println(animal);
   
   }*/
   
   //anonymous
   
    public static void animalSays(Animal animal){
   System.out.println(animal);
   }

   public static void main(String...args){
   ArrayList<Animal> animals =new ArrayList<>();
   animals.add( new Cat("mewo","purr","growl"));
   animals.add(new Dog("bark","wimper","growl"));
   
   for(Animal animal : animals){
			Driver.animalSays(animal);

   }
   
   }
   }