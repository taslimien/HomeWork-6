package exceptionhandlingHW;

public class Exceptions {

	public static void main(String[] args) {
		
		String[] bird = {"Parrots", "Albert", "Baxter"};
		System.out.println(bird[2]);
		
		int number = 100;
		
		try {
				
			int result = number/2;
			System.out.println(result);
			
		}catch (Exception ex) {
			System.out.println("You can not divide a number by Zerro");
			
		
			
			System.out.println("Are you able to complite to the end of the program ");
			
			}	

	}

}
