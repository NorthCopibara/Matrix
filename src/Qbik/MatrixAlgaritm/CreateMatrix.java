package Qbik.MatrixAlgaritm;

import Qbik.Model.Cell;
import Qbik.Model.MatrixParameters;
import Qbik.Model.Vector2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateMatrix
{
    private Map<Vector2, JButton> buttonsPosition;
    private List<Vector2> position;

    public List<Vector2> getPosition(List<JButton> buttons, MatrixParameters param)
    {
        buttonsPosition = new HashMap<>();
        position = new ArrayList<>();

        int nameCell = 0;

        for (int i = 0; i < param.getCountX(); i++)
        {
            for (int j = 0; j < param.getCountY(); j++)
            {
                Vector2 vector2 = new Vector2(i, j);
                position.add(vector2);
                buttonsPosition.put(vector2, buttons.get(nameCell));
                nameCell++;
            }
        }
        return position;
    }

    public Map<Vector2, Cell> GetMatrixCells()
    {
        Map<Vector2, Cell> cells = new HashMap<>();

        for (Vector2 pos: position) {
            Map<Vector2, Integer> distance = CalculateDistance(pos);
            JButton button = buttonsPosition.get(pos);

            Cell cell = new Cell(pos, distance, button);
            cells.put(pos, cell);
        }
        return cells;
    }

    private Map<Vector2, Integer> CalculateDistance(Vector2 nameButton)
    {
        Map<Vector2, Integer> distance = new HashMap<>();

        for (int i = 0; i < position.size(); i++)
        {
            if(!position.get(i).equals(nameButton))
            {
                int x = position.get(i).getX() - nameButton.getX();
                int y = position.get(i).getY() - nameButton.getY();

                int dist;
                if(Math.abs(x) > Math.abs(y))
                {
                    dist = Math.abs(x) - 1;
                }
                else
                {
                    dist = Math.abs(y) - 1;
                }
                distance.put(position.get(i), dist);
            }
            else
            {
                distance.put(position.get(i), -1);
            }
        }
        
        return distance;
    }
}
