package org.Main;

import javax.swing.*;

public class window extends JFrame {
    JFrame f;
    window(){
        setSize(400,500);
        setLayout(null);
        setVisible(true);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }
}
