package gui.project;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;
public class CUSTOMERTest {
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        CUSTOMER frame;
        JButton b1;
        String expresult;
        frame=new CUSTOMER();
        frame.setVisible(true);
        b1=(JButton)testutils.getChildNamed(frame, "b1");
        assertNotNull("cant access the JButton",  b1);
        JTextField ll1 = null;
        ll1=(JTextField)testutils.getChildNamed(frame, "t1");
        ll1.setText("Ahmad@gmail.com");
        JPasswordField ll2 = null;
        ll2=(JPasswordField)testutils.getChildNamed(frame, "t2");
        ll2.setText("123456789");
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
        CUSTOMER frame;
        JButton b2;
        String expresult;
        frame=new CUSTOMER();
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
        CUSTOMER frame;
        JLabel t1;
        String expresult;
        frame=new CUSTOMER();
        frame.setVisible(true);
        t1=(JLabel)testutils.getChildNamed(frame, "ll1");
        assertNotNull("cant access the JButton",  t1);
        t1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t1.getText());
    }
    
    @Test
    public void testJLabel2() throws InterruptedException
    {
        CUSTOMER frame;
        JLabel t2;
        String expresult;
        frame=new CUSTOMER();
        frame.setVisible(true);
        t2=(JLabel)testutils.getChildNamed(frame, "ll2");
        assertNotNull("cant access the JButton",  t2);
        t2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t2.getText());
    }
}
