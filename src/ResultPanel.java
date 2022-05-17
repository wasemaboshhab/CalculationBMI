import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    JLabel bmi, bmiResult, weightStatus, idealWeight
            ,idealWeightResult, actualWeight;
    ImageIcon healthBody;



    public ResultPanel() {
        setPreferredSize(new Dimension(200, 200));
        setBackground(new Color(160, 200, 135));


        bmi = new JLabel("");
        bmiResult = new JLabel("");
        weightStatus = new JLabel("");
        idealWeight = new JLabel("");
        idealWeightResult = new JLabel("");
        actualWeight = new JLabel("");
        healthBody = new ImageIcon("healthy.jfif");

        bmi.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(bmi);

        bmiResult.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(bmiResult);

        weightStatus.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(weightStatus);

        idealWeight.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(idealWeight);

        idealWeightResult.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(idealWeightResult);

        actualWeight.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(actualWeight);



    }



    public ImageIcon getHealthBody() {
        return healthBody;
    }

    public JLabel getActualWeight() {
        return actualWeight;
    }

    public JLabel getIdealWeightResult() {
        return idealWeightResult;
    }

    public JLabel getIdealWeight() {
        return idealWeight;
    }

    public JLabel getBmiResult() {
        return bmiResult;
    }

    public JLabel getWeightStatus() {
        return weightStatus;
    }



    public JLabel getBmi() {
        return bmi;
    }

}
