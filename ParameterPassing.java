//Jeff Blankenship
//CS-151
//parameter passing examples

//this code calls methods for objects and primitives
//to compare parameter passing

public class ParameterPassing{
  
  //changes the value of a TestObject parameter
  private static void changeObject(TestObject objectParameter){
    objectParameter.setData("Changed by changeObject method");
  }
  
  //changes the value of a String parameter
  private static void changeString(String stringParameter){
    stringParameter = "ModifiedByChangeStringMethod";
  }
  
  //changes the value of a primitive parameter
  private static void changePrimitive(int primitiveParameter){
    primitiveParameter = 8888;
  }
  
  public static void main (String[] args){
    
    //TestObject class can be found at
    //github.com/JeffBship/test-object
    TestObject testObj = new TestObject();
    
    //test user objects for pass by value or reference
    System.out.println("\nAre user defined objects pass by value or reference?");
    System.out.println("data before method: " + testObj);
    changeObject(testObj);
    System.out.println("data after  method: " + testObj);
    
    //test String objects for pass by value or reference
    System.out.println("\nAre String objects pass by value or reference?");
    String originalString = "TheOriginalString";
    System.out.println("originalString before method: " + originalString);
    changeString(originalString);
    System.out.println("originalString after  method: " + originalString);
    
    //test primitives for pass by value or reference
    System.out.println("\nAre primitives pass by value or reference?");
    int primitive = 1111;
    System.out.println("primitive before method: " + primitive);
    changePrimitive(primitive);
    System.out.println("primitive after  method: " + primitive);
    
  }
}








