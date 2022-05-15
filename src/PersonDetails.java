import javax.swing.*;
import java.awt.*;


public class PersonDetails extends JPanel {
//    JPanel controls = new JPanel();
    JLabel firstName = new JLabel("First Name :");
    JTextField userFirstName = new JTextField(8);
    JLabel lastName = new JLabel("Last Name :");
    JTextField userLastName = new JTextField(8);
    JLabel age = new JLabel("Age :");
    JTextField userAge = new JTextField(8);
    Color newColor = new Color(160, 200, 135);

    public PersonDetails() {
        JPanel controls = new JPanel();
        setBackground(newColor);
        setPreferredSize(new Dimension(230, 0));
        BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
        controls.setLayout(layout);
        controls.setBackground(newColor);
        controls.add(Box.createRigidArea(new Dimension(0, 20)));

        controls.add(firstName);
        controls.add(userFirstName);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));

        controls.add(lastName);
        controls.add(userLastName);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));

        controls.add(age);
        controls.add(userAge);

        controls.add(Box.createRigidArea(new Dimension(0, 30)));


        add(controls);

    }

//    public void setControls(JPanel controls) {
//        this.controls = controls;
//    }

    public void setFirstName(JLabel firstName) {
        this.firstName = firstName;
    }

    public void setUserFirstName(JTextField userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setLastName(JLabel lastName) {
        this.lastName = lastName;
    }

    public void setUserLastName(JTextField userLastName) {
        this.userLastName = userLastName;
    }

    public void setAge(JLabel age) {
        this.age = age;
    }

    public void setUserAge(JTextField userAge) {
        this.userAge = userAge;
    }

    public void setNewColor(Color newColor) {
        this.newColor = newColor;
    }

//    public JPanel getControls() {
//        return controls;
//    }

    public JLabel getFirstName() {
        return firstName;
    }

    public JTextField getUserFirstName() {
        return userFirstName;
    }

    public JLabel getLastName() {
        return lastName;
    }

    public JTextField getUserLastName() {
        return userLastName;
    }

    public JLabel getAge() {
        return age;
    }

    public JTextField getUserAge() {
        return userAge;
    }

    public Color getNewColor() {
        return newColor;
    }

}
