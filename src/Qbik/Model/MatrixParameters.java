package Qbik.Model;

public final class MatrixParameters
{
    private int countX;
    private int countY;

    public MatrixParameters(int countX, int countY)
    {
        this.countX = countX;
        this.countY = countY;
    }

    public int getCountX()
    {
        return countX;
    }

    public int getCountY()
    {
        return countY;
    }
}
