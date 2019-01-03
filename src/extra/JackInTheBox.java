package extra;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
	int clickCount = 0;

	public static void main(String[] args) {
		new JackInTheBox().createUI();
	}

	JFrame frame = new JFrame();
	JButton button = new JButton();

	// 1. Create a user interface (GUI) that has a single button labeled "Surprise".
	// If you need help, take a look at the instructions for the Fortune Cookie
	// recipe.
	private void createUI() {
		frame.setVisible(true);
		button.setText("suprise!");
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
		frame.setTitle("Jack In The Box");
	}

	// 2. When the user presses the button 5 times, show them a jack-in-the-box
	// using the methods below.
	// (A sample jackInTheBox.png file is provided in the default package)
	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	// 3. Also play a sound when the jack-in-the-box pops up using this method.
	// (A sample sound homer-woohoo.wav is provided in the default package)
	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		clickCount++;
		if (clickCount == 5) {
			showPicture("jackInTheBox.png");
			createLabelImage("jackInTheBox.png");
			playSound("homer-woohoo.wav");
		}
	}
}
