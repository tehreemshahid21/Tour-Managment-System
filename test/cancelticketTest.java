package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class cancelticketTest {
    
    @Test
    public void testJbuttonb2() throws InterruptedException
    {
        cancelticket frame;
        JButton b2;
        String expresult;
        frame=new cancelticket();
        frame.setVisible(true);
        b2=(JButton)testutils.getChildNamed(frame, "b2");
        assertNotNull("cant access the JButton",  b2);
        b2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b2.getText());
    }
    
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        cancelticket frame;
        JButton b1;
        String expresult;
        frame=new cancelticket();
        frame.setVisible(true);
        b1=(JButton)testutils.getChildNamed(frame, "b1");
        assertNotNull("cant access the JButton",  b1);
        b1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b1.getText());
    }
    
    
    @Test
    public void testJtextfield1() throws InterruptedException
    {
        cancelticket frame;
        JTextField t1;
        String expresult;
        frame=new cancelticket();
        frame.setVisible(true);
        t1=(JTextField)testutils.getChildNamed(frame, "t1");
        assertNotNull("cant access the JButton",  t1);
        t1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t1.getText());
    }
    
    @Test
    public void testJLabel1() throws InterruptedException
    {
        cancelticket frame;
        JLabel l1;
        String expresult;
        frame=new cancelticket();
        frame.setVisible(true);
        l1=(JLabel)testutils.getChildNamed(frame, "l1");
        assertNotNull("cant access the JButton",  l1);
        l1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l1.getText());
    }
    
    @Test
    public void testJLabel2() throws InterruptedException
    {
        cancelticket frame;
        JLabel l2;
        String expresult;
        frame=new cancelticket();
        frame.setVisible(true);
        l2=(JLabel)testutils.getChildNamed(frame, "l2");
        assertNotNull("cant access the JButton",  l2);
        l2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l2.getText());
    }
    
    @Test
    public void testJLabel3() throws InterruptedException
    {
        cancelticket frame;
        JLabel l3;
        String expresult;
        frame=new cancelticket();
        frame.setVisible(true);
        l3=(JLabel)testutils.getChildNamed(frame, "l3");
        assertNotNull("cant access the JButton",  l3);
        l3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l3.getText());
    }
    
}
