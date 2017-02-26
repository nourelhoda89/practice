

public class BrokenCode {

   private String name;

   public void setName(String name){
      this.name = name;
   }

   public String getName(){
   	// broken!!!!
      return  name;
   }

   public double toCentimeters(double inches){
   	// broken!!!!
      return  inches;
   }

	/*
		When creating classes it should be tested.
		While jUnit, Spock, etc are acceptable and encouraged, you are free to test in the
		main method. We will not be submitting drivers, so the main method (of each class)
		is where you can test as an alternative.
		Use the following for an example
	 */
   public static void main(String... args){
   
   	// create my instance of the test subject (this class)
      BrokenCode brokenPojo = new BrokenCode();
   
      brokenPojo.testSetGetName();
      brokenPojo.testInchesToCentimeters();
   
   }

	/* Start tests - will not test w/o -ea flag */


	// test set/get name
   private void testSetGetName(){
      System.out.println("test1");
   	// argument I will use to test
      String name = "anthony";
   
   	// one method under test
      this.setName(name);
   
   	// second method under test
      String broken = this.getName();
   
   
   	// my expected style with : operator, second half is your detail on its failure
      assert broken.equals(name) : "name in pojo is not `" + name + "` but rather `" + broken + "`";
   }

	// test toCentimeters
   private void testInchesToCentimeters(){
      System.out.println("test2 ");
      double centimeters = this.toCentimeters(3.0);}


}