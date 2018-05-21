import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 * @author Brejvinder
 *
 */
@SuppressWarnings("serial")
public class ClockLabel extends JLabel implements ActionListener {

	String zone;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM HH:mm:ss");

	public ClockLabel(String zone, int hAlignment) {
		
		this.zone = zone;
		
		setForeground(Color.CYAN);
		setFont(new Font("monospaced", Font.BOLD, 20));

		try {
			dateFormat.setTimeZone(TimeZone.getTimeZone(zone));
			setHorizontalAlignment(hAlignment);
		} catch (Exception e) {
			dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			setHorizontalAlignment(SwingConstants.LEFT);
		}

		Timer t = new Timer(1000, this);
		t.start();
	}

	public void actionPerformed(ActionEvent ae) {
		Date d = new Date();
		setText(zone + " " + dateFormat.format(d));
	}

}
