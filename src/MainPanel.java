

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends Panel {
    NorthPanel northPanel;
    SubmitClear submitClear;
    BodyFrameAndGender bodyFrameAndGender;
    BmiCalculate bmiCalculate;
    PersonDetails personDetails;
  //  Color newColor = new Color(160, 200, 135);



    public MainPanel() {
        setLayout(new BorderLayout());
        bodyFrameAndGender = new BodyFrameAndGender();
        northPanel = new NorthPanel();
        submitClear = new SubmitClear();
        bmiCalculate = new BmiCalculate();
        personDetails = new PersonDetails();

        add(northPanel,BorderLayout.NORTH);
        add(bodyFrameAndGender,BorderLayout.CENTER);
        add(submitClear,BorderLayout.SOUTH);
        add(bmiCalculate,BorderLayout.EAST);
        add(personDetails,BorderLayout.WEST);

        SubmitOrClear buttonsListener = new SubmitOrClear();
        submitClear.getClearButton().addActionListener(buttonsListener);


    }

    private class SubmitOrClear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(submitClear.getClearButton())) {
                personDetails.getUserFirstName().setText("");
                personDetails.getUserLastName().setText("");
                personDetails.getUserAge().setText("");

                bodyFrameAndGender.getGroupGender().clearSelection();
                bodyFrameAndGender.getGroup().clearSelection();

                bmiCalculate.getHeightSlider().setValue(140);
                bmiCalculate.getHeightLabel().setText("Height: 140");
                bmiCalculate.getUserActualWight().setText("");


            } else {

            }
        }
    }






}
