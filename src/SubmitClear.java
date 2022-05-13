import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SubmitClear extends JPanel {
    JButton submitButton = new JButton("Submit");
    JButton clearButton = new JButton("Clear");
    PersonDetails user = new PersonDetails();


    public SubmitClear() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(0, 40));
        SubmitOrClearListener listener = new SubmitOrClearListener();
        clearButton.addActionListener(listener);

        add(submitButton);
        add(clearButton);

    }
private void setSubmitButtonOnClicked(){

}
private void setClearButtonOnClicked(){
        user.getUserFirstName().setText(null);
}

    private class SubmitOrClearListener implements ActionListener{
        public void actionPerformed (ActionEvent event){
            Object source=event.getSource();
            if (source==submitButton){
             //   setSubmitButtonOnClicked();


            }else if (source==clearButton){
               setClearButtonOnClicked();
               // setSubmitButtonOnClicked();

            }

        }
    }


                }

