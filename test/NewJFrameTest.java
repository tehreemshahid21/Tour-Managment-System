
package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewJFrameTest {
    
    @Test
    public void testJbuttonEnter() throws InterruptedException
    {
        NewJFrame frame;
        JButton enter;
        String expresult;
        frame=new NewJFrame();
        frame.setVisible(true);
        enter=(JButton)testutils.getChildNamed(frame, "enter");
        assertNotNull("cant access the JButton",  enter);
        enter.setText("testing");
        sleep(4000);
        enter.doClick();
        sleep(2000);
        expresult="testing";
        assertEquals(expresult,enter.getText());
    }
    
    @Test
    public void testJbuttonExit() throws InterruptedException
    {
        NewJFrame frame;
        JButton exit;
        String expresult;
        frame=new NewJFrame();
        frame.setVisible(true);
        exit=(JButton)testutils.getChildNamed(frame, "exit");
        assertNotNull("cant access the JButton",  exit);
        exit.setText("testing");
        sleep(4000);
        exit.doClick();
        sleep(2000);
        expresult="testing";
        assertEquals(expresult,exit.getText());
    }
    
    @Test
    public void testJLabel1() throws InterruptedException
    {
        NewJFrame frame;
        JLabel l1;
        String expresult;
        frame=new NewJFrame();
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
        NewJFrame frame;
        JLabel l2;
        String expresult;
        frame=new NewJFrame();
        frame.setVisible(true);
        l2=(JLabel)testutils.getChildNamed(frame, "l2");
        assertNotNull("cant access the JButton",  l2);
        l2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l2.getText());
    }  
}
