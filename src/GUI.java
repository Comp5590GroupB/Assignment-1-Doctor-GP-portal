import javax.swing.*;

//Version 0.1
//Authors: Rielle
public class GUI extends JFrame{

    public final int width  = 1920;
    public final int height = 1080;

    public GUI(String panelName, JPanel panel){
        add(panel);
        setName(panelName);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width,height);
        setVisible(true);
    }

}