
import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel() {
        setLayout(new BorderLayout());
        NorthPanel northPanel = new NorthPanel();
        CenterPanel centerPanel = new CenterPanel();
        SouthPanel southPanel = new SouthPanel();
        WestPanel westPanel = new WestPanel();
        EastPanel eastPanel = new EastPanel();
        ResultPanel resultPanel = new ResultPanel();

        add(westPanel, BorderLayout.WEST);
        add(northPanel,BorderLayout.NORTH);
        add(centerPanel,BorderLayout.CENTER);
        add(southPanel,BorderLayout.SOUTH);
        add(eastPanel,BorderLayout.EAST);

        eastPanel.add(resultPanel);


        new Controller(westPanel, centerPanel, eastPanel, southPanel.getClearButton()
                , southPanel.getSubmitButton(), resultPanel);

    }

}
