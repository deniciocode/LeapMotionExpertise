import processing.core.PApplet;

import java.io.IOException;

public class LeapMotionMain {
	public static void main(String[] args) {
		PApplet.main("ProcessingSketch");
		System.out.println("Press Enter to quit...");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//controller.removeListener(ceranControl);
	}
}
