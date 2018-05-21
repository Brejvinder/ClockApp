
import java.awt.Color;
import javax.swing.SwingConstants;

/**
 * @author Brejvinder
 *
 */
public class ClockApp {

	public static void main(String[] args) {

		ClockLabel utc = new ClockLabel("UTC", SwingConstants.RIGHT);
		ClockLabel oslo = new ClockLabel("Europe/Oslo", SwingConstants.RIGHT);
		ClockLabel malaysia = new ClockLabel("Asia/Kuala_Lumpur", SwingConstants.RIGHT);

		ClockFrame cf = new ClockFrame("Digital Clock", 400, 100, 3, 1, 0.5f, Color.BLACK, 1);

		cf.add(utc);
		cf.add(oslo);
		cf.add(malaysia);
	}
}