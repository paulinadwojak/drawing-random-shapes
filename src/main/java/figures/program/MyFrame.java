package figures.program;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	JPanel panel;

	MyFrame() {
		super("Figures");

		panel = new MyPanel();
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600, 600);
	}

}
