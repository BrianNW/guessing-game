import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GuessingGame extends JFrame {
	public GuessingGame() {
		
		JLabel lblNewLabel = new JLabel("Hi-Low Guessing Game");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
