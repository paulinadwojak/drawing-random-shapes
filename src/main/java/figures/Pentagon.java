package figures;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Polygon;

public class Pentagon implements Shapes {

	Polygon p;

	public void paint(Graphics g, int rozmiar, int x, int y, Color kolor) {

		p = new Polygon();

		for (int i = 0; i < 5; i++)
			p.addPoint((int) (x + rozmiar * Math.cos(i * 2 * Math.PI / 5)),
					(int) (y + rozmiar * Math.sin(i * 2 * Math.PI / 5)));

		g.fillPolygon(p);
		g.setColor(kolor);
	}

}
