package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;

public class GUI {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 420);
        frame.setTitle("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon frameIcon = new ImageIcon("GUI/flower.jpeg");
        frame.setIconImage(frameIcon.getImage());

        ImageIcon displayImage = new ImageIcon("GUI/flower.jpeg");
        
        StretchedImagePanel imagePanel = new StretchedImagePanel(displayImage.getImage());
        
        frame.add(imagePanel);
    }
}

class StretchedImagePanel extends JPanel {
    private final Image image;

    public StretchedImagePanel(Image image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int componentWidth = this.getWidth();
            int componentHeight = this.getHeight();
            g.drawImage(image, 0, 0, componentWidth, componentHeight, this);
        }
    }
}