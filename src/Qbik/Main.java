package Qbik;

import Qbik.MatrixAlgaritm.MatrixManager;
import Qbik.Model.MatrixParameters;
import Qbik.UI.MatrixView;
import Qbik.UI.MenuUI;

public class Main
{
    private static MatrixManager manager;
    private static MenuUI menu;

    public static void main(String[] args)
    {
        menu = new MenuUI();
        menu.setVisible(true);
    }

    public static MatrixManager getManager()
    {
        return manager;
    }

    public static MenuUI getMenu()
    {
        return menu;
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
