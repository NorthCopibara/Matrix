package Qbik.UI;

import Qbik.Main;
import Qbik.MatrixAlgaritm.CreateMatrix;
import Qbik.Model.MatrixParameters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUI extends JFrame
{
    private JButton bStart = new JButton("Start");
    private JTextField inputX = new JTextField();
    private JTextField inputY = new JTextField();

    public MenuUI()
    {
        super("Menu");
        this.setBounds(100,100,200,100);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2,5,5));

        bStart.addActionListener(new ButtonEventListener());

        container.add(inputX);
        container.add(inputY);
        container.add(bStart);
    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(!inputX.getText().equals("") && !inputY.getText().equals("") &&
                    !inputX.getText().equals("0") && !inputY.getText().equals("0"))
            {
                int x = Integer.parseInt(inputX.getText());
                int y = Integer.parseInt(inputY.getText());

                if(x > 71 || y > 71) //Ограничения по памяти heap
                    return;

                MatrixParameters param = new MatrixParameters(x, y);

                Main.CreateMatrix(param);

                Main.menu.setVisible(false);
            }
        }
    }
}
