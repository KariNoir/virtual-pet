import java.util.Scanner;

public class VirtualPetApp {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		VirtualPet techPet = new VirtualPet(10, 10, 10, 10);


		System.out.println("Hi, name your pet");
		Scanner petName = new Scanner(System.in);
		String yourpet = petName.next();
		
		System.out.println(yourpet +"'s tummy meter is on " + techPet.forEat());
		System.out.println(yourpet +"'s fun meter is on " + techPet.forFun());
		System.out.println(yourpet +"'s bladder meter is on " + techPet.forPotty());
		System.out.println(yourpet +"'s rest meter is on " + techPet.forSleep());}


		
		String whattoDo = "";{
		
		System.out.println("What do you want to do with your pet?");
		System.out.println("1. Feed");
		System.out.println("2. Play");
		System.out.println("3. Sleep");
		System.out.println("4. Potty");
		
		int eat = 1;
		int sleep = 1;
		int potty = 1;
		int fun = 1;
		
		
		Scanner petName = new Scanner(System.in); //why can't it read these instructions from above?
		String yourpet = petName.next();
		VirtualPet techPet = new VirtualPet(10, 10, 10, 10);
		String whattoDo = "";

		
		if (whattoDo.contentEquals("1")) {
			techPet.fedPet();
			System.out.println("Fed" + yourpet + eat + "cookie.");
		
		 } else if (whattoDo.contentEquals("2")) {
			techPet.getSleep();
			System.out.println(yourpet + "took a nap");
			
		} else if (whattoDo.contentEquals("3")) {
			techPet.goPotty();
			System.out.println(yourpet + "is relieved.");
		
		} else if (whattoDo.contentEquals("4")) {
			techPet.haveFun();
			System.out.println(yourpet + "is smiling.");
			

		 while (whattoDo >=5) {
			System.out.println("Pick a number 1-4 ");

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
		



		
		

