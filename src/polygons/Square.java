package polygons;

import java.awt.*;

/**
 * Created by cic on 2018-01-19.
 */
public class Square extends Polygon {


    public Square(int x, int y) {
        super(x, y);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(centerPoint.x -10, centerPoint.y -10, 20, 20);
    }
}
