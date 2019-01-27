package polygons;

import java.awt.*;

/**
 * Created by cic on 2018-01-19.
 */
public abstract class Polygon extends Component {
    protected Point centerPoint;

    private Polygon(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Polygon(int x, int y) {
        this(new Point(x,y));
    }

    public Point getCenterPoint() {
        return centerPoint;
    }
    
    public abstract void paint(Graphics g);

}
