package Qbik;

import Qbik.MatrixAlgaritm.MatrixManager;
import Qbik.Model.MatrixParameters;
import Qbik.UI.MatrixView;
import Qbik.UI.MenuUI;

public class Main
{
    private static MatrixManager manager;

    public static MenuUI menu;

    public static void main(String[] args)
    {
        menu = new MenuUI();
        menu.setVisible(true);
    }

    public static MatrixManager getManager()
    {
        return manager;
    }

    public static void CreateMatrix(MatrixParameters param)
    {
        manager = new MatrixManager(param);
    }

    public static void DestroyMatrix()
    {
        manager = null;
    }
}
