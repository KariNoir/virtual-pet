import java.util.Scanner;

public class VirtualPet {

	private String name;
	private int eat;
	private int sleep;
	private int fun;
	private int potty;
	private final int MAX_EAT, MAX_SLEEP, MAX_FUN, MAX_POTTY;
	
public VirtualPet(int eat, int sleep, int fun, int potty) {
	this.eat = eat;
	this.sleep = sleep;
	this.fun = fun;
	this.potty = potty;
}

public void tick() {
	eat++;
	sleep++;
	fun++;
	potty--;
}

public int getEat() {
	return eat;
}

public int getSleep() {
	return sleep;
}

public int getFun() {
	return fun;
}

public int getPotty() {
	return potty;
}

public 

}




}
