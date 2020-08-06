package Qbik.Model;

import Qbik.Model.Vector2;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Cell
{
    private Map<Vector2, Integer> distance;
    private Vector2 name;
    private JButton myButton;

    public Cell(Vector2 name, Map<Vector2, Integer> distance, JButton myButton)
    {
        this.myButton = myButton;
        this.name = name;
        this.distance = distance;
    }

    public void SetDistance(Vector2 nameClick)
    {
        if(nameClick != name) {
            myButton.setText(Integer.toString(distance.get(nameClick)));
            myButton.setBackground(Color.YELLOW);
        }
        else {
            myButton.setText("*");
            myButton.setBackground(Color.RED);
        }
    }
}
