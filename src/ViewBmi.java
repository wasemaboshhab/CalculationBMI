import javax.swing.*;
import java.awt.*;

public class ViewBmi extends JFrame {

    public ViewBmi(){

        //setting frame
        this.setTitle("Bmi Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(ModelBmi.WINDOW_WIDTH,ModelBmi.WINDOW_HEIGHT));
        this.setLocationRelativeTo(null);
        this.setLocation(300,150);
        this.setResizable(false);
        this.mainPanel();
        this.pack();
        this.setVisible(true);
        //this.setResizable(false);

    }

private JPanel submitClear;
    public NorthPanel northPanel;
    public BodyFrameAndGender bodyFrameAndGender;
    public HeightAndWight heightAndWight;
    public PersonDetails personDetails;
    public ResultPanel resultPanel;
    public JButton submit, clear;

    public void  mainPanel(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setSize(new Dimension(ModelBmi.WINDOW_WIDTH, ModelBmi.WINDOW_HEIGHT));
        this.getContentPane().add(mainPanel);


        this.bodyFrameAndGender = new BodyFrameAndGender();
        this.northPanel = new NorthPanel();
        this.heightAndWight = new HeightAndWight();
        this.personDetails = new PersonDetails();
        this.resultPanel = new ResultPanel();
        this.setSubmitClear();

        mainPanel.add(personDetails, BorderLayout.WEST);
        mainPanel.add(northPanel,BorderLayout.NORTH);
        mainPanel.add(bodyFrameAndGender,BorderLayout.CENTER);
        mainPanel.add(heightAndWight,BorderLayout.EAST);
        mainPanel.add(submitClear,BorderLayout.SOUTH);



    }

public void setSubmitClear(){
    submit = new JButton("Submit");
    clear = new JButton("Clear");

    this.submitClear = new JPanel();
    this.submitClear.add(clear);
    this.submitClear.add(submit);
    this.submitClear.setBackground(ModelBmi.DARK_GREEN);
}
}


