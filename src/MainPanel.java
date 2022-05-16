

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends Panel {
    NorthPanel northPanel;
    SubmitClear submitClear;
    BodyFrameAndGender bodyFrameAndGender;
    HeightAndWight heightAndWight;
    PersonDetails personDetails;
    ResultPanel resultPanel;



  //  Color newColor = new Color(160, 200, 135);



    public MainPanel() {
        setLayout(new BorderLayout());
        bodyFrameAndGender = new BodyFrameAndGender();
        northPanel = new NorthPanel();
        submitClear = new SubmitClear();
        heightAndWight = new HeightAndWight();
        personDetails = new PersonDetails();
        resultPanel = new ResultPanel();



        add(personDetails, BorderLayout.WEST);
        add(northPanel,BorderLayout.NORTH);
        add(bodyFrameAndGender,BorderLayout.CENTER);
        add(submitClear,BorderLayout.SOUTH);
        add(heightAndWight,BorderLayout.EAST);

        heightAndWight.add(resultPanel);




        SubmitOrClear buttonsListener = new SubmitOrClear();
        submitClear.getClearButton().addActionListener(buttonsListener);
        submitClear.getSubmitButton().addActionListener(buttonsListener);


    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);



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

                heightAndWight.getHeightSlider().setValue(140);
                heightAndWight.getHeightLabel().setText("Height: 140");
                heightAndWight.getUserActualWight().setText("");

                resultPanel.setBackground(new Color(160, 200, 135));

                resultPanel.getBmi().setText("");
                resultPanel.getBmiResult().setText("");
                resultPanel.getWeightStatus().setText("");
                resultPanel.getIdealWeight().setText("");





            } else {

                resultPanel.setBackground(new Color(241, 241, 241));
                resultPanel.getBmi().setText("BMI: ");
                int height = heightAndWight.getHeightSlider().getValue(); // 160 Integer
                double userHeight = (float) (height / 100.0) * (height / 100.0); // 1.6 ^ 2

                                //Weight
                String weight = heightAndWight.getUserActualWight().getText();
                double userWeight =(float) Double.parseDouble(weight);
                System.out.println(userWeight);  // v
                                //BMI calc
                double userBmi =  (float) userWeight / userHeight;
                resultPanel.getBmiResult().setText(Double.toString(userBmi));


                if (userBmi < 15) resultPanel.getWeightStatus().setText("Anorexic");
                else if (15.0 < userBmi  && userBmi<18.5)  resultPanel.getWeightStatus().setText("Underweight");
                else if (18.5 <userBmi && userBmi < 24.9) resultPanel.getWeightStatus().setText("Normal");
                else if (25 < userBmi && userBmi < 29.9)   resultPanel.getWeightStatus().setText("Overweight");
                else if (30 < userBmi && userBmi < 35){   resultPanel.getWeightStatus().setText("Obese");}
                else{resultPanel.getWeightStatus().setText("Extreme Obese");}


                resultPanel.getIdealWeight().setText("Ideal Weight:");





















            }
        }
    }








}
