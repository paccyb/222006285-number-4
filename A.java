interface E//interface
{
  public void world();
}
class A extends B implements E//class Aextend B implements
 {
  public void continent()
  {
     System.out.println("africa");
    
  }
  public void country()
  {
    System.out.println("rwanda");
   

  }
  public void UNIVERSE()
  {
System.out.println("earth");
}
}

class B extends C// class B extends C
 {
  public void province()
  {
    System.out.println("SOUTH");
  }
}
class C extends D
 {
  public void district()
  {
    System.out.println("NYANZA");
  }
}
class D
 {
  public void sector()
  {
    System.out.println("BUSASA");
  }
}

public class inheritance2 
{
  public static void main(String [] args)
  {
  A objectpaccy=new A();//oject main
//calling method
  objectpaccy.continent();
  objectpaccy.country();
  objectpaccy.world();
  objectpaccy.province();
  objectpaccy.district();
  objectpaccy.sector();
  }
}// end of Class