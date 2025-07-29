import java.util.Scanner;
public class BonusOppgave3_1 {

	public static void main(String[] args) {
		System.out.println("Type the name of the planet: ");
		
		Scanner scanner = new Scanner(System.in); 
	    String name = scanner.nextLine();
	    
		System.out.println("Type the radius of the planet: ");
	    int radius = scanner.nextInt();

		System.out.println("Type the mass of the planet: ");
		double mass = scanner.nextDouble();
	    System.out.println(name +" has a radius of " + radius + " km and mass of " + mass);
		
	}
}


