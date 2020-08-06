package Qbik.MatrixAlgaritm;

import Qbik.Model.Cell;
import Qbik.Model.CellPositionData;
import Qbik.Model.MatrixParameters;
import Qbik.Model.Vector2;
import Qbik.UI.MatrixView;

import java.util.List;
import java.util.Map;

public class MatrixManager
{
    private MatrixView matrix;
    private CellPositionData cellPosition;

    private ButtonEventListenerMatrix eventClick;

    public MatrixManager(MatrixParameters param)
    {
        eventClick = new ButtonEventListenerMatrix();

        matrix = new MatrixView(param, eventClick);
        matrix.setVisible(true);

        CreateMatrix createMatrix = new CreateMatrix();
        List<Vector2> position = createMatrix.getPosition(matrix.getButtons(), param);
        Map<Vector2, Cell> cells = createMatrix.GetMatrixCells();

        cellPosition = new CellPositionData(cells, position);
    }

    public void ClickEvent(String numberButton)
    {
        int num = Integer.parseInt(numberButton);
        Vector2 nameClick = cellPosition.getPosition().get(num);
        SetAllCells(nameClick);
    }

    private void SetAllCells(Vector2 nameClick)
    {
        for (Map.Entry<Vector2, Cell> x: cellPosition.getCellsPosition().entrySet())
        {
            x.getValue().SetDistance(nameClick);
        }
    }
}

