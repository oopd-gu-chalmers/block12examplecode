package polygons;

import java.awt.*;

/**
 * Created by cic on 2018-01-19.
 */
public class Rectangle extends Polygon {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }
}
