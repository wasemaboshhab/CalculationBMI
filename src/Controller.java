import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Controller {

    public Controller(JSlider heightSlider, JLabel heightLabel) {
        heightSlider.addChangeListener(e -> {
            heightLabel.setText("Height: " + heightSlider.getValue());
        });
    }

    public Controller(PersonDetails personDetails, BodyFrameAndGender bodyFrameAndGender, HeightAndWight heightAndWight,
                      JButton clearButton, JButton submitButton, ResultPanel resultPanel ,SubmitClear submitClear) {
        clearButton.addActionListener(e -> {
            personDetails.getUserFirstName().setText("");
            personDetails.getUserLastName().setText("");
            personDetails.getUserAge().setText("");

            bodyFrameAndGender.getGroupGender().clearSelection();
            bodyFrameAndGender.getGroupBodyFrame().clearSelection();

            heightAndWight.getHeightSlider().setValue(140);
            heightAndWight.getUserActualWight().setText("");

            resultPanel.getBmi().setForeground(Color.BLACK);
            resultPanel.getBmi().setText("");
            resultPanel.getBmiResult().setText("");
            resultPanel.getWeightStatus().setText("");
            resultPanel.getIdealWeight().setText("");
            resultPanel.getIdealWeightResult().setText("");
            resultPanel.getActualWeight().setText("");
            resultPanel.setBackground(Model.PANELS_COLOR);

        });

        submitButton.addActionListener(e -> {

            boolean allowToCalc = !personDetails.getUserAge().getText().equals("")
                    && !heightAndWight.getUserActualWight().getText().equals("")
                    && bodyFrameAndGender.getGroupBodyFrame().getSelection() != null;

            // check if the user fill the Important Details for the calculation
            if (allowToCalc) {

                try {
                    // calc the Bmi if the user filled out normal data
                    resultPanel.setBackground(Model.HEADER_PANEL_COLOR);
                    resultPanel.getBmi().setText("BMI: ");
                    float height = (float) heightAndWight.getHeightSlider().getValue(); // 160 Integer
                    float userHeight =  ( (height / 100.0f) * ( height / 100.0f)); // 1.6 ^ 2
                    String weight = heightAndWight.getUserActualWight().getText();
                    float userWeight = Float.parseFloat(weight);

                    float userBmi = (userWeight / userHeight);
                    resultPanel.getBmiResult().setText(Float.toString(userBmi));

                    if (userBmi < Model.ANOREXIC) resultPanel.getWeightStatus().setText("Anorexic");
                    else if ( Model.ANOREXIC < userBmi  && userBmi < Model.UNDER_WEIGHT)  resultPanel.getWeightStatus().setText("Underweight");
                    else if (Model.UNDER_WEIGHT < userBmi && userBmi < Model.NORMAL) resultPanel.getWeightStatus().setText("Normal");
                    else if (Model.NORMAL < userBmi && userBmi < Model.OVER_WEIGHT)   resultPanel.getWeightStatus().setText("Overweight");
                    else if (Model.OVER_WEIGHT < userBmi && userBmi < Model.EXTREME_OBESE){   resultPanel.getWeightStatus().setText("Obese");}
                    else{resultPanel.getWeightStatus().setText("Extreme Obese");}
                    resultPanel.getIdealWeight().setText("<html><br>Ideal Weight:<html>");

                    float userAge = Float.parseFloat(personDetails.getUserAge().getText());

                    float slimness =  0.0f;
                    if (bodyFrameAndGender.getSmall().isSelected()){ slimness = Model.BODY_FRAME_SMALL;}
                    if (bodyFrameAndGender.getMedium().isSelected()){ slimness = Model.BODY_FRAME_MEDIUM;}
                    if (bodyFrameAndGender.getLarge().isSelected()){ slimness = Model.BODY_FRAME_LARGE;}

                    float idealWeight = ((height - 100.0f + (userAge / 10)) * 0.9f * slimness);

                    String userIdealWeight = Float.toString(idealWeight);
                    resultPanel.getIdealWeightResult().setText("<html><br><html>" + userIdealWeight);
                    resultPanel.getActualWeight().setText(" Actual weight: " + (Float.parseFloat(heightAndWight.getUserActualWight().getText())));

                } catch (NumberFormatException exception) {
                    // catching invalid data (an exception with convert the user age/weight to number)
                    // -> so show ERROR in the resultPanel and Rest the Panel's Components
                    // cause the user may edit and submit again without clearing
                    resultPanel.setBackground(Color.WHITE);
                    resultPanel.getBmi().setText("INPUT ERROR");
                    resultPanel.getBmiResult().setText("");
                    resultPanel.getWeightStatus().setText("");
                    resultPanel.getIdealWeight().setText("");
                    resultPanel.getIdealWeightResult().setText("");
                    resultPanel.getActualWeight().setText("");

                }

            }



        });


    }

}
