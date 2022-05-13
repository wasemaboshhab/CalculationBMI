

import java.awt.*;

public class MainPanel extends Panel {
    NorthPanel northPanel;
    SubmitClear submitClear;
    BodyFrameAndGender bodyFrameAndGender;
    BmiCalculate bmiCalculate;
    PersonDetails westPanel;
  //  Color newColor = new Color(160, 200, 135);



    public MainPanel() {
        setLayout(new BorderLayout());
        bodyFrameAndGender = new BodyFrameAndGender();
        northPanel = new NorthPanel();
        submitClear = new SubmitClear();
        bmiCalculate = new BmiCalculate();
        westPanel = new PersonDetails();

        add(northPanel,BorderLayout.NORTH);
        add(bodyFrameAndGender,BorderLayout.CENTER);
        add(submitClear,BorderLayout.SOUTH);
        add(bmiCalculate,BorderLayout.EAST);
        add(westPanel,BorderLayout.WEST);




    }
}
