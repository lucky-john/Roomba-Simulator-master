package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
		driveDirect(300,300);
		sleep(3000);
		driveDirect(500,850);
		sleep(1000);
		driveDirect(1000,1000);
		
		driveDirect(1000,1000);
		sleep(3000);
		driveDirect(5000,5000);
		driveDirect(100,100);
		sleep(3000);
		driveDirect(500,850);
		sleep(1000);
		driveDirect(1000,1000);
		
		driveDirect(10000,10000);
		sleep(3000);
		driveDirect(50000,50000);
		driveDirect(3000,-3000);
		sleep(3000);
	
		
		
		
		
		
		
		
		

	}

	public void loop() {
	
	}
}
