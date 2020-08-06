package Qbik.UI;

import Qbik.MatrixAlgaritm.ButtonEventListenerMatrix;
import Qbik.Model.MatrixParameters;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MatrixView extends JFrame
{
    List<JButton> buttons;

    public MatrixView(MatrixParameters param, ButtonEventListenerMatrix event)
    {
        super("Matrix");

        this.setBounds(100,100,520,520);
        //this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(100,100,500,500);
        panel.setLayout(new GridLayout(param.getCountX(), param.getCountY(),5,5));

        buttons = new ArrayList<>();

        for (int i = 0; i < param.getCountX() * param.getCountY(); i++) {
            JButton button = new JButton("X"); //Integer.toString(0)
            button.setSize(50,50);
            buttons.add(button);
            button.setName(Integer.toString(i));
            button.addActionListener(event);
            panel.add(button);
        }

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(100,100,510,510);

        add(scrollPane);
    }

    public List<JButton> getButtons()
    {
        List<JButton> but = buttons;
        buttons = null;
        return but;
    }
}
