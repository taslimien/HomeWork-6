package nestedhomework;

	class Outer {
		int a =10;
	
	class Inner {
		int b = 20;
		
	}
}

	public class NestedClass {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Outer.Inner inn = out.new Inner();
		
		System.out.println("A = " + out.a + " and " +"B = " + inn.b);
		
		

	}

}
