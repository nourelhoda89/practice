import java.util.*;

public class Calculator{
  private String operation=null, operand1 =null,operand2=null;
  private double num1=0.0;
  private double num2 =0.0;
  
public static void main(String[] args) throws Exception {
   Calculator calculator =new Calculator();
   
  if (args.length != 3){
    System.err.println("java Calculator<operation> <operand1> <operand2>");
  }
  calculator.operation=args[0].toLowerCase();
  calculator.operand1=args[1];
  calculator.operand2=args[2];
  
  calculator.mathOperation(calculator.operation,calculator.operand1,calculator.operand2);
}
public  void mathOperation(String operation, String operand1, String operand2)throws Exception{
   try{
     num1=Double.valueOf(operand1);
     num2=Double.valueOf(operand2);

    switch (operation){
    case "add" :
          System.out.println(add(num1,num2));
    break;
    case"substract":
          System.out.println(substract(num1,num2));
    break;
    case"multiply":
        System.out.println(multiply(num1,num2));
    break;
    case"divide" :
          System.out.println(divide(num1,num2));
    break;
    }
  } catch(Exception e) {
     e.printStackTrace();
  }finally {System.exit(1);
  }
}

double add(double num1,double  num2){
  return num1+num2;
}

 double substract(double num1, double num2){
  return num1-num2;
}

double multiply(double num1, double num2){
  return num1*num2;
}

double divide(double num1, double num2)throws Exception{
  if (num2 == 0) {throw new Exception("can't divide by zero");
  }
  return num1/num2;
}

}
