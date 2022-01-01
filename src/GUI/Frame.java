package GUI;
import javax.swing.JFrame;
import java.awt.Dimension;


public class Frame {
    private JFrame frame;

    public Frame(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension(1366,866);
        frame.setSize(dimension);
        frame.setVisible(true);
        Panel panel = new Panel();
        this.frame.add(panel);

    }

}
