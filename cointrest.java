public class cointrest// creation of class cointrest
{
    public double mep(double p, double r, double t,double n)// creation of method mep
    {
    
        return(p*(Math.pow(1+r/n,n*t)));// return statement that will return values
    }
 public static void main (String args[]) // main method
 {
cointrest obj2=new cointrest();// object creation statement
double p=500000; double r=0.18; double n=12; double t=3;// variables initialization

double intrest=obj2.mep(p, r, t, n);// object and method calling by new variable


System.out.println("THE BOB'S COMPOUND INTREST IS :"+intrest);// out put statement 
 }
}
