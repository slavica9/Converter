package converter;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class SubPanel extends JPanel{

    public SubPanel(final Frame frame) {
    JTabbedPane tp = new JTabbedPane();
    tp.add(new Valute());
    tp.add(new Length());
    add(tp);
    }
    
}
