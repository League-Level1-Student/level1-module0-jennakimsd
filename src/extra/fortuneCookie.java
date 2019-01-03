package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//1. Make a class, with a main method and a showButton() method.
public class fortuneCookie implements ActionListener {
	public static void main(String[] args) {

		// 2. Write code in your main method, to call the showButton() method.
		// Note: because showButton() is not static you will have to create an instance
		// of your program in the main method before you can call it.
		fortuneCookie fc = new fortuneCookie();
		fc.showButton();

		// 6. Generate a random number between 0 and 4:
		int rand = new Random().nextInt(5);

		// 7. Depending on which random number, show one of the five fortunes.
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "you will get a house");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "you will win the lottery");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "you will fail on your next test");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "you will drop out of high school");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "you will become famous");
		}

		// [optional] 8. Run other student's programs to receive fortunes from them.
	}

	public void showButton() {
		System.out.println("Button clicked");
		// 3. Now change the showButton() method to make a JFrame and get it to show up
		// when you run the program.
		JFrame frame = new JFrame();
		frame.setVisible(true);
		// 4. Make a JButton and add it to the JFrame.
		JButton button = new JButton();
		frame.add(button);
		// 5. The next 4 steps make a pop-up appear that says, “Woohoo” when the button
		// is clicked

		// a. Add an action listener to the button:
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// b. Put a JOptionPane pop-up inside the actionPerformed() method that says
		// "Woohoo".
		JOptionPane.showMessageDialog(null, "Woo hoo!");

	}
}
