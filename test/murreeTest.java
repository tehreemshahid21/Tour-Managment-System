
package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class murreeTest {
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        murree frame;
        JButton b1;
        String expresult;
        frame=new murree();
        frame.setVisible(true);
        b1=(JButton)testutils.getChildNamed(frame, "b1");
        assertNotNull("cant access the JButton",  b1);
        b1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b1.getText());
    }
    
    @Test
    public void testJLabel1() throws InterruptedException
    {
        murree frame;
        JLabel l1;
        String expresult;
        frame=new murree();
        frame.setVisible(true);
        l1=(JLabel)testutils.getChildNamed(frame, "l1");
        assertNotNull("cant access the JButton",  l1);
        l1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l1.getText());
    }
    
}
