import javax.swing.*;

public class AppLaucher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //DISPLAY THE WEATHER APP GUI
               // new WeatherApp().setVisible(true);

                System.out.println(WeatherAppData.getLocationData("Tokyo"));

            }
        });

    }
}
