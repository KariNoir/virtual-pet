
public class VirtualPetApp {

	private int hunger = 0;
	private int sleep = 0;
	private int play = 5;
	private int pot = 0;
	
	
	public static void main(String[] args) {
		// Virtual Pet 
	}
		
		public void eating() {
			
			hunger -= 5;
			if(hunger <0) { //if less than zero then it will be zero
				hunger = 0;
			}
			if(hunger > 10) {
				hunger = 10;
			}
			
		
		}
		
		
		public void relief() {
			pot = 0;
			hunger -= 2;
			if(hunger > 10) {
				hunger = 10;
			}
			
}

		public void rest() {
		
			
		}

		public void fun() {
			
		}
			
		
		public void time() {
			
		}
		}



		
		

