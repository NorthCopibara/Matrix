package Qbik.Model;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public final class CellPositionData
{
    private static Map<Vector2, Cell> cells;
    private static List<Vector2> position;

    public CellPositionData(Map<Vector2, Cell> buttonsPosition, List<Vector2> position)
    {
        this.cells = buttonsPosition;
        this.position = position;
    }

    public Map<Vector2, Cell> getCellsPosition()
    {
        return cells;
    }

    public List<Vector2> getPosition()
    {
        return position;
    }
}
