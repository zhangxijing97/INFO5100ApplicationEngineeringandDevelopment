# INFO5100ApplicationEngineeringandDevelopment

Add an ActionListener to the Button: This involves creating an instance of ActionListener and overriding its actionPerformed method to define what should happen when the button is clicked.<br>

Add the Button to the JFrame: The button needs to be added to the JFrame to be visible.<br>

Display the JFrame: Set the frame’s size, default close operation, and make it visible.<br>

```
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonExample {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Button Example");

        // Create the JButton
        JButton button = new JButton("Click Me!");

        // Add ActionListener to JButton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code will be executed when the button is clicked
                System.out.println("Button was clicked!");
            }
        });

        // Add the JButton to the JFrame
        frame.add(button);

        // Set the size of the JFrame and make it visible
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```