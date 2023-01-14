package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class skarduTest {
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        skardu frame;
        JButton b1;
        String expresult;
        frame=new skardu();
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
        skardu frame;
        JLabel l1;
        String expresult;
        frame=new skardu();
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
        skardu frame;
        JLabel t2;
        String expresult;
        frame=new skardu();
        frame.setVisible(true);
        t2=(JLabel)testutils.getChildNamed(frame, "t2");
        assertNotNull("cant access the JButton",  t2);
        t2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t2.getText());
    }
    
    @Test
    public void testJLabel3() throws InterruptedException
    {
        skardu frame;
        JLabel t3;
        String expresult;
        frame=new skardu();
        frame.setVisible(true);
        t3=(JLabel)testutils.getChildNamed(frame, "t3");
        assertNotNull("cant access the JButton",  t3);
        t3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t3.getText());
    }
}
