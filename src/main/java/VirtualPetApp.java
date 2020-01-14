import java.util.Scanner;

public class VirtualPetApp {
	
//public String getStatus() {
//		if(play <= 6) {
//			return "Let's play! ";
//		}
//		if(pot >=6) {
//			return "I got to go! ";
//		}
//		if(sleep >=6) {
//			return "Need Sleep! ";
//
//		}
//		if(hunger <=6) {
//			return "I need food!";
//		}
//		
//		// Virtual Pet 
//		return null;
//
//	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet techPet = new VirtualPet(10, 10, 10, 10);

//		public void eating() {
//			sleep += 2;
//			pot -= 4;
//			
//			hunger -= 5; //decrease hunger by 2
//			if(hunger <0) { //if less than zero then it will be zero
//				hunger = 0;
//			}
//			if(hunger > 10) {
//				hunger = 10;
			
//	String decision = "";
//	while (!decision.equalsIgnoreCase ("Yes")) {
//		

		System.out.println("Hi, name your pet");
		Scanner petName = new Scanner(System.in);
		petName = petName.nextLine();
		System.out.println("petName " + techPet.forEat());
		System.out.println("petName " + techPet.forFun());
		System.out.println("petName " + techPet.forPotty());
		System.out.println("petName " + techPet.forSleep());
		
		
		
		
	}
			
		
		}
		
		
		public void relief() {
			play += 2;
			hunger -= 2;
			pot = 0;
			if(pot <0) {
				pot = 0;
			}
			if(pot >10) {
				pot = 10;
			}
			hunger -= 2; //decrease hunger by 2
			if(hunger > 10) {
				hunger = 10;
			}
			
}

		public void rest() {
			pot -= 2;
			hunger += 2;
			
		if(sleep <0) {
			sleep = 0;
		}
		}

		public void fun() {
			sleep -=3;
			hunger -=2;
			
			
		}
			
		
		public void tick() {
			hunger--;
			
			if(hunger <0) { //if less than zero then it will be zero
				hunger = 0;
			}
			if(hunger > 10) {
				hunger = 10;	
	
				
				System.out.println ("What do you want to do?");
				System.out.println("Fed is 1, Play is 2, Sleep is 3, Go to the bathroom 4");
				Object input;
				int task = ((int) input).nextInt();

				while (task != 0) {
					System.out.println("Pick between 1 and 5 ");
					int duty = (int) .nextInt();
				}

				System.out.println("...great job");

			}
		}
		}
}
		
//		//{
//		MAX_EAT = 10;
//		MAX_SLEEP = 10;
//		MAX_FUN = 10;
//		MAX_POTTY = 10;
//		eat = 0;
//		sleep = 0;
//		fun = 0;
//		potty = 0;
//		System.out.println("Hi, name your pet");
//		Scanner petName = new Scanner(System.in);
//		name = petName.nextLine();
//		
//	}
//		
//	public Pet(String n)
		



		
		

