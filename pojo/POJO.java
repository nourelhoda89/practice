package pojo;

public class POJO{
   
//create variable and make them privte for encapsulation
   private int num;
   private int denom;
   
//first constructor to intiatize var

   public POJO() {
     this.setNum(0);
     this.setDenom(0);
    }
    
    public POJO(int num, int denom){
      this.setNum(num);
      this.setDenom(denom);
    
    }
    
    public int getNum(){
      return this.num;
    }
    
    public int getDenom(){
      return this.denom;
    }
    
    public void setNum(int num){
      this.num = num; 
    }
    
    public void setDenom(int denom){
      this.denom = denom;
    }
}

