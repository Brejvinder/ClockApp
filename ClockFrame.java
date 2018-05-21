import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;

/**
 * @author Brejvinder
 *
 */
@SuppressWarnings("serial")
public class ClockFrame extends JFrame {

	public ClockFrame(String name, int sizeX, int sizeY, int gridX, int gridY, float opacity, Color color,
			int screenNum) {

		super(name);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setAlwaysOnTop(true);
		this.setVisible(true);

		this.setSize(sizeX, sizeY);
		this.setLayout(new GridLayout(gridX, gridY));
		this.setOpacity(opacity);
		this.getContentPane().setBackground(color);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] screen = ge.getScreenDevices();
		try {
			Rectangle rect = screen[screenNum].getDefaultConfiguration().getBounds();
			int x = (int) rect.getMaxX() - this.getWidth();
			this.setLocation(x, 0);
		} catch (Exception e) {
			this.setLocation(0, 0);
		}

	}
}
