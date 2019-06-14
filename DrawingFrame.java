import javax.swing.JFrame;
import java.awt.*;

public class DrawingFrame
{
    public static void main(String[] args){
	
	// You should change the Title
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(885, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
       
        DrawingPicture picture = new DrawingPicture();
        frame.add(picture);
        
        frame.setVisible(true);
    }
}
