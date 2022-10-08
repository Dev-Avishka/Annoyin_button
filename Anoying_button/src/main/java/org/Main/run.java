package org.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class run {
    public static void run_win(){
        window win = new window();
        win.setTitle("Annoying Button");
        button b = new button();
        b.setText("Click ME");
        win.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                b.x = r.nextInt(800);
                b.y = r.nextInt(600);
                b.setBounds(b.x,b.y,100,50);
                sound s = new sound();
                sound.play_haha();
            }
        });
    }
}
