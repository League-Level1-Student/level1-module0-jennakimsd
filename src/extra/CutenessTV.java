package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		new CutenessTV().createUI();
	}

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();

	// 1. Make a user interface with 3 buttons that will play different videos
	// depending on which button is clicked.
	// If you need help, take a look at the instructions for the Fortune Cookie
	// recipe.

	public void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		button.setText("Ducks");
		button2.setText("Frogs");
		button3.setText("Fluffy Unicorns");
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		frame.setTitle("Cuteness TV");
	}

	// 2. Use the methods below to play the cutest videos ever.

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrogs() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			showDucks();
		}
		if (buttonPressed == button2) {
			showFrogs();
		}
		if (buttonPressed == button3) {
			showFluffyUnicorns();
		}
		frame.pack();
	}
}
