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

        // WEATHER IMAGE
        JLabel weatherConditionImage = new JLabel(loadImage("src/assets/cloudy.png"));
        weatherConditionImage.setBounds(0, 125, 450, 217);
        add(weatherConditionImage);

        // TEMPERATURE TEXT
        JLabel temperatureText = new JLabel("10°C");
        temperatureText.setBounds(0, 350, 450, 54);
        temperatureText.setFont(new Font("Dialog", Font.BOLD, 48));
        temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
        add(temperatureText);

        // WEATHER CONDITION DESCRIPTION
        JLabel weatherDescription = new JLabel("Cloudy");
        weatherDescription.setBounds(0, 405, 450, 36);
        weatherDescription.setFont(new Font("Dialog", Font.PLAIN, 32));
        weatherDescription.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherDescription);

        // HUMIDITY IMAGE
        JLabel humidityImage = new JLabel(loadImage("src/assets/humidity.png"));
        humidityImage.setBounds(15, 500, 74, 66);
        add(humidityImage);

        // HUMIDITY TEXT
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90, 500, 85, 55);
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(humidityText);

        //WINDSPEED IMAGE
        JLabel windSpeedImage= new JLabel(loadImage("src/assets/windspeed.png"));
        windSpeedImage.setBounds(220,500,74,66);
        add(windSpeedImage);

        //WINDSPEED TEXT
        JLabel windSpeedText = new JLabel("<html><b>Windspeed</b> 15Km</html>");
        windSpeedText.setBounds(310, 500, 85, 55);
        windSpeedText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(windSpeedText);
    }

    // METHOD TO LOAD IMAGE
    private ImageIcon loadImage(String path) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not find resource");
            return null;
        }
    }
}
