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

    public void setWeightStatus(){
        if (Double.parseDouble(bmiResult.getText()) < 15) weightStatus.setText("Anorexic");
        else if (15.0 < Double.parseDouble(bmiResult.getText())  && Double.parseDouble(bmiResult.getText())<18.5)  weightStatus.setText("Underweight");
        else if (18.5 <Double.parseDouble(bmiResult.getText()) && Double.parseDouble(bmiResult.getText()) < 24.9) weightStatus.setText("Normal");
        else if (25 < Double.parseDouble(bmiResult.getText()) && Double.parseDouble(bmiResult.getText()) < 29.9)   weightStatus.setText("Overweight");
        else if (30 < Double.parseDouble(bmiResult.getText()) && Double.parseDouble(bmiResult.getText()) < 35){   weightStatus.setText("Obese");}
        else{weightStatus.setText("Extreme Obese");}
    }

}
