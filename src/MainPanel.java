
import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel() {
        setLayout(new BorderLayout());

        BodyFrameAndGender bodyFrameAndGender = new BodyFrameAndGender();
        NorthPanel northPanel = new NorthPanel();
        SubmitClear submitClear = new SubmitClear();
        HeightAndWight heightAndWight = new HeightAndWight();
        PersonDetails personDetails = new PersonDetails();
        ResultPanel resultPanel = new ResultPanel();

        add(personDetails, BorderLayout.WEST);
        add(northPanel,BorderLayout.NORTH);
        add(bodyFrameAndGender,BorderLayout.CENTER);
        add(submitClear,BorderLayout.SOUTH);
        add(heightAndWight,BorderLayout.EAST);

        heightAndWight.add(resultPanel);


        new Controller(personDetails, bodyFrameAndGender, heightAndWight, submitClear.getClearButton()
                , submitClear.getSubmitButton(), resultPanel, submitClear);

    }

}
