import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame {
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup buttonGroup;
    private JPanel lightPanel;

    public TrafficLightSimulator() {
        // Create the frame
        super("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 400);
        setLayout(new BorderLayout());

        // Create the radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Create a button group to ensure only one light is selected at a time
        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        // Create the light panel
        lightPanel = new JPanel();
        lightPanel.setBackground(Color.LIGHT_GRAY);

        // Add radio buttons to the frame
        JPanel controlPanel = new JPanel();
        controlPanel.add(redButton);
        controlPanel.add(yellowButton);
        controlPanel.add(greenButton);

        // Add action listeners to the radio buttons
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lightPanel.setBackground(Color.RED);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lightPanel.setBackground(Color.YELLOW);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lightPanel.setBackground(Color.GREEN);
            }
        });

        // Add components to the frame
        add(controlPanel, BorderLayout.NORTH);
        add(lightPanel, BorderLayout.CENTER);

        // Set the initial state
        redButton.setSelected(true);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TrafficLightSimulator();
            }
        });
    }
}
