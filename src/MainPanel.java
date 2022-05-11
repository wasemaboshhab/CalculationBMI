

import java.awt.*;

public class MainPanel extends Panel {
    NorthPanel northPanel;
    SouthPanel southPanel;
    CoordinatorPanel coordinatorPanel;
    EastPanel eastPanel;
    WestPanel westPanel;



    public MainPanel() {
        setLayout(new BorderLayout());
        coordinatorPanel = new CoordinatorPanel();
        northPanel = new NorthPanel();
        southPanel = new SouthPanel();
        eastPanel = new EastPanel();
        westPanel = new WestPanel();

        add(northPanel,BorderLayout.NORTH);
        add(coordinatorPanel,BorderLayout.CENTER);
        add(southPanel,BorderLayout.SOUTH);
        add(eastPanel,BorderLayout.EAST);
        add(westPanel,BorderLayout.WEST);




    }
}
