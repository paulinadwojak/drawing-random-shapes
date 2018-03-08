package figures.program;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import figures.Circle;
import figures.Pentagon;
import figures.Rectangle;
import figures.Shapes;
import figures.Triangle;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	Random random = new Random();
	int amountOfShapes = random.nextInt(200);
	int number;
	Shapes[] figuresShape = new Shapes[amountOfShapes];
	JButton button;

	public void fillArray() {
		for (int i = 0; i < figuresShape.length; i++) {

			number = random.nextInt(4);

			switch (number) {
			case 0:
				figuresShape[i] = new Circle();
				break;
			case 1:
				figuresShape[i] = new Rectangle();
				break;
			case 2:
				figuresShape[i] = new Triangle();
				break;
			case 3:
				figuresShape[i] = new Pentagon();
				break;
			}
		}
	}

	public void getAFigure(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		for (int i = 0; i < figuresShape.length; i++) {
			int x = random.nextInt(400);
			int y = random.nextInt(400);
			int figureSize = random.nextInt(200);
			Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
			// g2d.rotate(x, y, figureSize);

			figuresShape[i].paint(g2d, figureSize, x, y, color);

		}

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		final Graphics2D g2d = (Graphics2D) g;

		fillArray();

		button = new JButton("RESET");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		add(button);

		for (int i = 0; i < figuresShape.length; i++) {
			getAFigure(g2d);
		}
	}

}
