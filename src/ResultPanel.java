import javax.swing.*;
import java.awt.*;

public class ResultPanel extends JPanel {
    JLabel bmi, bmiResult, weightStatus, idealWeight;


    public ResultPanel() {
        setPreferredSize(new Dimension(200, 200));
        setBackground(new Color(160, 200, 135));


        bmi = new JLabel("");
        bmiResult = new JLabel("");
        weightStatus = new JLabel("");
        idealWeight = new JLabel("");
        add(bmi);
        bmiResult.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(bmiResult);
//        add(Box.createRigidArea(new Dimension(0, 5)));
        weightStatus.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(weightStatus);
        idealWeight.setAlignmentX(Component.LEFT_ALIGNMENT);

        add(idealWeight);







//        controls.add(Box.createRigidArea(new Dimension(0, 2)));
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
