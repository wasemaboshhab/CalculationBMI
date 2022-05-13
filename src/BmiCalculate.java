import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BmiCalculate extends JPanel {

        JSlider heightSlider;
        JLabel heightLabel = new JLabel("Height");
    JLabel actualWight = new JLabel("Enter your actual wight :");
    JTextField userActualWight = new JTextField(8);
    JLabel bmiResult = new JLabel();
    JPanel controls = new JPanel();
    Color newColor = new Color(160, 200, 135);

    public BmiCalculate() {
        setBackground(newColor);
        setPreferredSize(new Dimension(300, 0));
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(newColor);

        heightSlider = new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        heightSlider.setMajorTickSpacing(10);
        heightSlider.setMinorTickSpacing(2);
        heightSlider.setPaintTicks(true);
        heightSlider.setPaintLabels(true);
        //heightSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
        heightSlider.setBackground(newColor);
//userActualWight.setBackground(Color.GRAY);
        SliderListener listener = new SliderListener();
        heightSlider.addChangeListener(listener);

        heightLabel = new JLabel("Height: 140");
        heightLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(heightLabel);
        controls.add(heightSlider);
        controls.add(Box.createRigidArea(new Dimension(0, 40)));

        userActualWight.addActionListener(new TempListener());
        controls.add(actualWight);
        controls.add(userActualWight);
        controls.add(Box.createRigidArea(new Dimension(0, 40)));

        JLabel bmiLabel = new JLabel("Your bmi is: ");


        add(controls);
    }
        private class SliderListener implements ChangeListener {
        private int height;
        @Override
        public void stateChanged(ChangeEvent e) {
            height = heightSlider.getValue();
            heightLabel.setText("height: " + height);

        }
    }

    private class TempListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            double wightTemp, bmi;
            String text = userActualWight.getText();
            wightTemp= Integer.parseInt(text);
            bmi = wightTemp/Math.pow(heightSlider.getValue(),2);
            bmiResult.setText(Double.toString (bmi));
        }
    }
}
