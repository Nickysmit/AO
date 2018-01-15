import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
        setBackground(Color.white);

    }

    public void paint (Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Nicky", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Smit", 50, 70);
    }

}


