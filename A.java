interface E//interface
{
  public void world();
}
class A extends B implements E//class Aextend B implements
 {
  public void continent()
  {
     System.out.println("AFRICA");
    
  }
  public void country()
  {
    System.out.println("RWANDA");
   

  }
  public void universe()
  {
System.out.println("EARTH");
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
    System.out.println("BUSASAMANA");
  }
}

class inheritance2 
{
  public static void main(String [] args)
  {
  A objectpaccy=new A();//oject main
//calling method
 objectpaccy.universe();
  objectpaccy.continent();
  objectpaccy.country();
  objectpaccy.province();
  objectpaccy.district();
  objectpaccy.sector();
  }
}// end of Class