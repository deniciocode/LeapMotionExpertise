import com.leapmotion.leap.Controller;
import processing.core.PApplet;

import java.io.IOException;

public class LeapMotionMain {

	public static void main(String[] args) {
		MyProcessingSketch sketch = new MyProcessingSketch();
		PApplet.main(new String[]{"--present", "MyProcessingSketch"});
		ControlPanel ceranControl = new ControlPanel();
		Controller controller = new Controller(ceranControl);
		System.out.println("Press Enter to quit...");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		controller.removeListener(ceranControl);
	}
}
