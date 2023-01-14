package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.junit.Test;
import static org.junit.Assert.*;


public class FORMTest {
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        FORM frame;
        JButton b1;
        String expresult;
        frame=new FORM();
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
        FORM frame;
        JButton b2;
        String expresult;
        frame=new FORM();
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
        FORM frame;
        JButton b3;
        String expresult;
        frame=new FORM();
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
        FORM frame;
        JButton b4;
        String expresult;
        frame=new FORM();
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
    
    @Test
    public void testJbuttonb5() throws InterruptedException
    {
        FORM frame;
        JButton b5;
        String expresult;
        frame=new FORM();
        frame.setVisible(true);
        b5=(JButton)testutils.getChildNamed(frame, "b5");
        assertNotNull("cant access the JButton",  b5);
        b5.setText("testing");
        sleep(4000);
        b5.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b5.getText());
    }
    
    @Test
    public void testJLabel1() throws InterruptedException
    {
        FORM frame;
        JLabel l1;
        String expresult;
        frame=new FORM();
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
        FORM frame;
        JLabel l2;
        String expresult;
        frame=new FORM();
        frame.setVisible(true);
        l2=(JLabel)testutils.getChildNamed(frame, "l2");
        assertNotNull("cant access the JButton",  l2);
        l2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l2.getText());
    }
}
