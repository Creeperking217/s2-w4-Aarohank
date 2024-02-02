import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

public class triangle {
    public static void main(String[] args) {
        Visuals v = new Visuals();
    }
}

class Visuals extends JPanel{

    JFrame frame;
    int screenWidth = 800;
    int screenHeight = 500;
    int panelXloc;
    int panelYloc;
    int dotSize = 2;

    int x = 0;
    int y = 0;

    ArrayList<Integer[]> mainDots = new ArrayList<Integer[]>();
    double[] centerDot = new double[] {400, 
        250};
        

    
    
    public Visuals () {
        mainDots.add(new Integer[] {400, 50});
        mainDots.add(new Integer[] {100, 450});
        mainDots.add(new Integer[] {700, 450});

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        panelXloc = (int)screenSize.getWidth()/2 - screenWidth/2;
        panelYloc = (int)screenSize.getHeight()/2 - screenHeight/2;
        frame = new JFrame();		
        frame.setSize (screenWidth, screenHeight + 24);
        frame.setLocation(panelXloc, panelYloc);
        frame.add (this);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        while(true) {
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        Integer[] dot = mainDots.get((int)(Math.random() * 3));
        centerDot[0] -= (centerDot[0] - dot[0])/2;
        centerDot[1] -= (centerDot[1] - dot[1])/2;
        g.fillOval((int)(centerDot[0]), (int)(centerDot[1]), dotSize, dotSize);

    }
}
