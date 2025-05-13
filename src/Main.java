import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Digital Clock");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel timeLabel = new JLabel("", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 50));
        timeLabel.setForeground(new Color(0, 128, 128));
        frame.add(timeLabel, BorderLayout.CENTER);

        JLabel dateLabel = new JLabel("", JLabel.CENTER);
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dateLabel.setForeground(new Color(0, 128, 128));
        frame.add(dateLabel, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 228, 225));
        frame.add(panel, BorderLayout.SOUTH);

        Timer timer = new Timer(1000, e -> {

            SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
            String currentTime = sdfTime.format(new Date());
            timeLabel.setText(currentTime);

            SimpleDateFormat sdfDate = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            String currentDate = sdfDate.format(new Date());
            dateLabel.setText(currentDate);
        });
        timer.start();

        frame.setVisible(true);
    }
}
