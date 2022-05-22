import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {

    private  JLabel bmi, bmiResult, weightStatus, idealWeight
            ,idealWeightResult, actualWeight;

    public ResultPanel() {
        setPreferredSize(new Dimension(180, 100));
        setBackground(Model.PANELS_COLOR);

        bmi = new JLabel();
        bmiResult = new JLabel();
        weightStatus = new JLabel();
        idealWeight = new JLabel();
        idealWeightResult = new JLabel();
        actualWeight = new JLabel();



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
