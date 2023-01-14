package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class GARDIANTest {
    
     @Test
    public void testJbuttonb1() throws InterruptedException
    {
        GARDIAN frame;
        JButton b1;
        String expresult;
        frame=new GARDIAN();
        frame.setVisible(true);
        b1=(JButton)testutils.getChildNamed(frame, "b1");
        assertNotNull("cant access the JButton",  b1);
        b1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b1.getText());
    }
    
    
    @Test
    public void testJbuttonb2() throws InterruptedException
    {
        GARDIAN frame;
        JButton b2;
        String expresult;
        frame=new GARDIAN();
        frame.setVisible(true);
        b2=(JButton)testutils.getChildNamed(frame, "b2");
        assertNotNull("cant access the JButton",  b2);
        b2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b2.getText());
    }
    
    
}
