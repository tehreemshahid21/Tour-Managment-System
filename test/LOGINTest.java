package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahmad
 */
public class LOGINTest {
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        LOGIN frame;
        JButton b1;
        String expresult;
        frame=new LOGIN();
        frame.setVisible(true);
        b1=(JButton)testutils.getChildNamed(frame, "b1");
        assertNotNull("cant access the JButton",  b1);
        JTextField ll1 = null;
        ll1=(JTextField)testutils.getChildNamed(frame, "ll1");
        ll1.setText("Admin");
        JPasswordField ll2 = null;
        ll2=(JPasswordField)testutils.getChildNamed(frame, "ll2");
        ll2.setText("123");
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
        LOGIN frame;
        JButton b2;
        String expresult;
        frame=new LOGIN();
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
    public void testJLabel1() throws InterruptedException
    {
        LOGIN frame;
        JLabel t1;
        String expresult;
        frame=new LOGIN();
        frame.setVisible(true);
        t1=(JLabel)testutils.getChildNamed(frame, "t1");
        assertNotNull("cant access the JButton",  t1);
        t1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t1.getText());
    }
    
    @Test
    public void testJLabel2() throws InterruptedException
    {
        LOGIN frame;
        JLabel t2;
        String expresult;
        frame=new LOGIN();
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
        LOGIN frame;
        JLabel t3;
        String expresult;
        frame=new LOGIN();
        frame.setVisible(true);
        t3=(JLabel)testutils.getChildNamed(frame, "t3");
        assertNotNull("cant access the JButton",  t3);
        t3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t3.getText());
    }
    
    @Test
    public void testJLabel4() throws InterruptedException
    {
        LOGIN frame;
        JLabel t4;
        String expresult;
        frame=new LOGIN();
        frame.setVisible(true);
        t4=(JLabel)testutils.getChildNamed(frame, "t4");
        assertNotNull("cant access the JButton",  t4);
        t4.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t4.getText());
    }
    
    @Test
    public void testJLabel5() throws InterruptedException
    {
        LOGIN frame;
        JLabel t5;
        String expresult;
        frame=new LOGIN();
        frame.setVisible(true);
        t5=(JLabel)testutils.getChildNamed(frame, "t5");
        assertNotNull("cant access the JButton",  t5);
        t5.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t5.getText());
    }
    
    @Test
    public void testJLabel6() throws InterruptedException
    {
        LOGIN frame;
        JLabel t6;
        String expresult;
        frame=new LOGIN();
        frame.setVisible(true);
        t6=(JLabel)testutils.getChildNamed(frame, "t6");
        assertNotNull("cant access the JButton",  t6);
        t6.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t6.getText());
    }
    
    @Test
    public void testJLabel7() throws InterruptedException
    {
        LOGIN frame;
        JLabel t7;
        String expresult;
        frame=new LOGIN();
        frame.setVisible(true);
        t7=(JLabel)testutils.getChildNamed(frame, "t7");
        assertNotNull("cant access the JButton",  t7);
        t7.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t7.getText());
    }
}
