package polygons;

import java.awt.*;

/**
 * Created by cic on 2018-01-19.
 */
public class Triangle extends Polygon {

    public Triangle(int x, int y) {
        super(x, y);
    }

    public void paint(Graphics g) {
        g.drawLine(centerPoint.x, centerPoint.y-10, centerPoint.x-10, centerPoint.y+10);
        g.drawLine(centerPoint.x-10, centerPoint.y+10,
                centerPoint.x+10, centerPoint.y+10);
        g.drawLine(centerPoint.x+10, centerPoint.y+10, centerPoint.x, centerPoint.y-10);
    }
}
