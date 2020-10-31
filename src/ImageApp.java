import javax.swing.*;

public class ImageApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(400, 240);
        frame.setTitle("PixeklDrag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // frame.setResizable(false);
        frame.add(panel);
        placeComponents(panel);
    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel widthLabel = new JLabel("Final Width:");
        widthLabel.setBounds(10,20,100,25);
        panel.add(widthLabel);

        JTextField widthText = new JTextField(20);
        widthText.setBounds(100,20,50,25);
        panel.add(widthText);

        JLabel heightLabel = new JLabel("Final Height:");
        heightLabel.setBounds(10,50,100,25);
        panel.add(heightLabel);

        JTextField heightText = new JTextField(20);
        heightText.setBounds(100,50,50,25);
        panel.add(heightText);
    }

}