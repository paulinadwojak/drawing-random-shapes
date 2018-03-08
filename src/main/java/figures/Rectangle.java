package figures;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shapes {

	public void paint(Graphics g, int rozmiar, int x, int y, Color kolor) {

		int width = rozmiar;
		int height = rozmiar * 2;

		g.fillRect(x, y, width, height);
		g.setColor(kolor);
		
	}

}
