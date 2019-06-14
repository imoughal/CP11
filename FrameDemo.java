
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("FrameDemo");  // It is putting a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 
		frame.setSize(400, 400); //

        Shapes r = new Shapes();
        frame.add(r);
        

		frame.setVisible(true); //
	}
}
