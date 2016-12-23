import test.*;
public class anotherPackage {
	public static void main(String []args){
		System.out.println(accessTest.x);
	}
}

class subclass extends accessTest{
	public static void main(String []args){
		System.out.println(accessTest.x);
	}
}