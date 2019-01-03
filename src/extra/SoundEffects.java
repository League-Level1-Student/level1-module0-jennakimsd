package extra;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	public static void main(String[] args) {
		new SoundEffects().createUI();
	}

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	static JButton button2 = new JButton();

	// 1. Create a GUI for a sound effects machine that will play different sounds
	// when the buttons are pressed.
	// If you need help, take a look at the instructions for the Fortune Cookie
	// recipe.
	// NOTE: because this GUI has more than one button, you must add a JPanel to
	// your JFrame and put the buttons on the panel!
	public void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		button.setText("sound 1");
		button2.setText("sound 2");
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		frame.pack();
		frame.setTitle("Sound Effects Machine");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		if (buttonPressed == button2) {
			playSound("homer-woohoo.wav");
		}
		frame.pack();
	}
	// 2. Gather sound bites. They must be .wav files.
	// The .wav files must be placed into your Java project (drag and drop).

	// 3. Call this playSound() method when they click on a button. You will need to
	// import java.applet.AudioClip
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
