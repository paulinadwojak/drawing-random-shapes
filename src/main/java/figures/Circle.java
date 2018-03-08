package figures;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shapes {

	public void paint(Graphics g, int rozmiar, int x, int y, Color kolor) {

		g.fillOval(x, y, rozmiar, rozmiar);
		g.setColor(kolor);
	}

}
