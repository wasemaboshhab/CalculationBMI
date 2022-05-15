import javax.swing.*;
import java.awt.*;



public class SubmitClear extends JPanel {
    JButton submitButton = new JButton("Submit");
    JButton clearButton = new JButton("Clear");
//    PersonDetails user = new PersonDetails();


    public SubmitClear() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(0, 40));

//        SubmitOrClearListener listener = new SubmitOrClearListener();
//        clearButton.addActionListener(listener);
        add(submitButton);
        add(clearButton);

    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }



    private void setSubmitButtonOnClicked(){

}


//    private class SubmitOrClearListener implements ActionListener{
//        public void actionPerformed (ActionEvent event){
//            Object source=event.getSource();
//            if (source == submitButton) {
//
//
//                //   setSubmitButtonOnClicked();
//
//
//            } else if (source == clearButton) {
//                user.getAge().setText("age");
//
//                System.out.println("hey i am here in clear ");
////                setClearButtonOnClicked();
//                // setSubmitButtonOnClicked();
//
//            }
//
//        }
//    }


                }

