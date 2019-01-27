package polygons;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);

        polygons.add(new Square(100,100));
        polygons.add(new Triangle(150,150));
        polygons.add(new Rectangle(100,200));
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygons.size(); i++) {
            polygons.get(i).paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons
