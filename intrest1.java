public class intrest1 //public class intrest 
 {  
    public float methodintrest(float p, float r,  float t)// method creation 
    { 
        return (p*(r/100)*t);// return statement to return values
    }
   public static void main (String args[])  // main method
    {    
        intrest1 obj1= new intrest1();// object creation
          
        float p = 100000;  float r = 5; float t = 5;  // variables initialization
        float result=obj1.methodintrest(p, r, t);// new variable to call object and method
               
              System.out.println("Simple Interest is: " +result);  // out put statement
    }} 