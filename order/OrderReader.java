package order;

import java.util.*;
import java.io.*;
import order.Item;

public class OrderReader{

public ArrayList<Item> Reader(String fileName)throws Exception{

ArrayList<Item> items =new ArrayList<>();
String line;

try{
  BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
  line= bufferedReader.readLine();
  while(line!=null){
            if (line.charAt(0)=='#'){
              line=bufferedReader.readLine();
            continue;
            }
    String[] split =line.split(",");
    String name=split[0];
    int quantity =Integer.valueOf(split[1]);
    double price =Double.valueOf(split[2]);
     items.add(new Item(name, price, quantity));
     line=bufferedReader.readLine();
   }
 } catch(FileNotFoundException exception){
    throw exception;
  } catch(IOException exception){
    throw exception;
  } catch(NumberFormatException exception){
    throw exception;
  }
  return items;
}
}







