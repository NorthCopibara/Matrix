package Qbik.MatrixAlgaritm;

import Qbik.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventListenerMatrix implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) e.getSource();
        Main.getManager().ClickEvent(button.getName());
    }
}
