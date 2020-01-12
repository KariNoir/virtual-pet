
public class VirtualPetApp {

	private int hunger = 0;
	private int sleep = 10;
	private int play = 5;
	private int pot = 0;
	
	
	public String getStatus() {
		if(play <= 6) {
			return "Let's play! ";
		}
		if(pot >=6) {
			return "I got to go! ";
		}
		if(sleep >=6) {
			return "Need Sleep! ";

		}
		if(hunger <=6) {
			return "I need food!";
		}
		// Virtual Pet 
		return null;

	}
		
		public void eating() {
			
			hunger -= 5; //decrease hunger by 2
			if(hunger <0) { //if less than zero then it will be zero
				hunger = 0;
			}
			if(hunger > 10) {
				hunger = 10;
			}
			
		
		}
		
		
		public void relief() {
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
			
		
		public void time() {
			
		}
		}



		
		

