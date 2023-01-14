package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class customerbookingTest {
    
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        customerbooking frame;
        JButton b1;
        String expresult;
        frame=new customerbooking();
        frame.setVisible(true);
        b1=(JButton)testutils.getChildNamed(frame, "b1");
        assertNotNull("cant access the JButton",  b1);
        b1.setText("testing");
        sleep(4000);
        b1.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b1.getText());
    }
    
    @Test
    public void testJbuttonb2() throws InterruptedException
    {
        customerbooking frame;
        JButton b2;
        String expresult;
        frame=new customerbooking();
        frame.setVisible(true);
        b2=(JButton)testutils.getChildNamed(frame, "b2");
        assertNotNull("cant access the JButton",  b2);
        b2.setText("testing");
        sleep(4000);
        b2.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b2.getText());
    }
    
    @Test
    public void testJbuttonb3() throws InterruptedException
    {
        customerbooking frame;
        JButton b3;
        String expresult;
        frame=new customerbooking();
        frame.setVisible(true);
        b3=(JButton)testutils.getChildNamed(frame, "b3");
        assertNotNull("cant access the JButton",  b3);
        b3.setText("testing");
        sleep(4000);
        b3.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b3.getText());
    }
    
    @Test
    public void testJbuttonb4() throws InterruptedException
    {
        customerbooking frame;
        JButton b4;
        String expresult;
        frame=new customerbooking();
        frame.setVisible(true);
        b4=(JButton)testutils.getChildNamed(frame, "b4");
        assertNotNull("cant access the JButton",  b4);
        b4.setText("testing");
        sleep(4000);
        b4.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b4.getText());
    }
    
    
}

