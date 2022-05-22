import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ControllerBmi {

    public static void main(String[] args) {
        ViewBmi viewBmi = new ViewBmi();

    viewBmi.submit.addActionListener( e -> {
            viewBmi.resultPanel.bmi.setText("BMI: ");
            float height = (float) viewBmi.heightAndWight.getHeightSlider().getValue();
            float userHeight = (float) ((float) (height / 100.0) * (height / 100.0));
            String weight = viewBmi.heightAndWight.getUserActualWight().getText();
            float userWeight = Float.parseFloat(weight);
            float userBmi = (userWeight / userHeight);
            viewBmi.resultPanel.getBmiResult().setText(Float.toString(userBmi));
        viewBmi.resultPanel.setWeightStatus();
        viewBmi.resultPanel.weightStatus.setText("Wight status: " + viewBmi.resultPanel.weightStatus.toString());
        float userAge = Float.parseFloat(viewBmi.personDetails.getUserAge().getText());
        float idealWeight = (float)( (height - 100.0 + (userAge/ 10) ) * 0.9 * viewBmi.bodyFrameAndGender.getSlimness() );
        String userIdealWeight = Float.toString(idealWeight);
        viewBmi.resultPanel.getIdealWeightResult().setText("Ideal wight" + userIdealWeight);

    } );
    viewBmi.clear.addActionListener(e -> {
                viewBmi.personDetails.getUserFirstName().setText("");
                viewBmi.personDetails.getUserLastName().setText("");
                viewBmi.personDetails.getUserAge().setText("");

                viewBmi.bodyFrameAndGender.getGroupGender().clearSelection();
                viewBmi.bodyFrameAndGender.getGroupBodyFrame().clearSelection();

                viewBmi.heightAndWight.getHeightSlider().setValue(140);
                viewBmi.heightAndWight.getHeightLabel().setText("Height: 140");
                viewBmi.heightAndWight.getUserActualWight().setText("");

                viewBmi.resultPanel.setBackground(new Color(160, 200, 135));

                viewBmi.resultPanel.getBmi().setText("");
                viewBmi.resultPanel.getBmiResult().setText("");
                viewBmi.resultPanel.getWeightStatus().setText("");
                viewBmi.resultPanel.getIdealWeight().setText("");
                viewBmi.resultPanel.getIdealWeightResult().setText("");
                viewBmi.resultPanel.getActualWeight().setText("");
            }
            );


viewBmi.heightAndWight.heightSlider.addChangeListener(e -> {
    viewBmi.heightAndWight.height = viewBmi.heightAndWight.heightSlider.getValue();
    viewBmi.heightAndWight.heightLabel.setText("Height: "+viewBmi.heightAndWight.height + " cm");
        }
        );
viewBmi.bodyFrameAndGender.small.addActionListener(e -> viewBmi.bodyFrameAndGender.setSlimness(ModelBmi.BODY_FRAME_SMALL));
        viewBmi.bodyFrameAndGender.medium.addActionListener(e -> viewBmi.bodyFrameAndGender.setSlimness(ModelBmi.BODY_FRAME_MEDIUM));
        viewBmi.bodyFrameAndGender.large.addActionListener(e -> viewBmi.bodyFrameAndGender.setSlimness(ModelBmi.BODY_FRAME_LARGE));


    }


}
