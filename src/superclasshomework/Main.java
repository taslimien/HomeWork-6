package superclasshomework;

public class Main {

	public static void main(String[] args) {
		Iphone i = new Iphone("Apple", 6.7, "12 Pro Max");
		System.out.println("Brand Name: "+ i.brand+ ", Screen Size: "+ i.size
				+", Model Name: " + i.model + ".");
		
		Samsung s = new Samsung("Samsung", 6.8, "galaxy s21 ultra");
		System.out.println("Brand Name: "+ s.brand+ ", Screen Size: "+ s.size
				+ ", Model Name: " + s.model + ".");
		

	}

}
