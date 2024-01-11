import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherApp extends JFrame {
    public WeatherApp() {
        // INITIAL CONFIGURATION OF THE GRAPHICAL INTERFACE
        super("Weather App"); // WINDOW TITLE

        // CONFIGURATION TO CLOSE THE PROGRAM WHEN CLOSING THE WINDOW
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // INITIAL SIZE OF THE WINDOW
        setSize(450, 650);

        // POSITION THE WINDOW IN THE CENTER OF THE SCREEN
        setLocationRelativeTo(null);

        // DISABLE THE LAYOUT MANAGER FOR MANUAL COMPONENT POSITIONING
        setLayout(null);

        // PREVENT WINDOW RESIZING
        setResizable(false);

        addGuiComponents();
    }

    private void addGuiComponents() {
        // SEARCH FIELD
        JTextField searchTextField = new JTextField();

        // SET THE LOCATION AND SIZE OF THE COMPONENT
        searchTextField.setBounds(15, 15, 351, 45);

        // CHANGE THE FONT STYLE AND SIZE
        searchTextField.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(searchTextField);

        // SEARCH BUTTON
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));

        // SET THE IMAGE ON THE BUTTON
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);
    }

    // METHOD TO LOAD IMAGE
    private ImageIcon loadImage(String path) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
