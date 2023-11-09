
// java program to show five days of week  using classes

class A extends B implements E{
	void printa() {
		System.out.println("monday");
	}
	public void printe() {
		 System.out.println("friday");
	}
}
class B extends C{
	void printb() {
		System.out.println("tuesday");
	}
}
class C extends D{
	void printc() {
		System.out.println("wednesday");
	}
}
class D{
	void printd() {
		System.out.println("thursday");
	}
}
interface E{
	void printe();
}


class inheritance3 {
	public static void main(String[] args) {
        A meobject= new A();
        meobject.printa();
        meobject.printb();
        meobject.printc(); 
        meobject.printd();
        meobject.printe();
	}

}