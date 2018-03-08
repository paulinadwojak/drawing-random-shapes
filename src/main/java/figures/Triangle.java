package figures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle implements Shapes {

	Polygon p;

	public void paint(Graphics g, int rozmiar, int x, int y, Color kolor) {

		p = new Polygon();
		p.addPoint(x, y);
		p.addPoint(x + rozmiar, y + rozmiar);
		p.addPoint(x + rozmiar, y - rozmiar);

		g.fillPolygon(p);
		g.setColor(kolor);

	}

}
