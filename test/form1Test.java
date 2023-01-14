
package gui.project;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

public class form1Test {
    
    @Test
    public void testJbuttonb3() throws InterruptedException
    {
        form1 frame;
        JButton b3;
        String expresult;
        frame=new form1();
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
    public void testJLabel1() throws InterruptedException
    {
        form1 frame;
        JLabel l1;
        String expresult;
        frame=new form1();
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
        form1 frame;
        JLabel l2;
        String expresult;
        frame=new form1();
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
        form1 frame;
        JLabel l3;
        String expresult;
        frame=new form1();
        frame.setVisible(true);
        l3=(JLabel)testutils.getChildNamed(frame, "l3");
        assertNotNull("cant access the JButton",  l3);
        l3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l3.getText());
    }
    
    
    @Test
    public void testJtextfield1() throws InterruptedException
    {
        form1 frame;
        JTextField t1;
        String expresult;
        frame=new form1();
        frame.setVisible(true);
        t1=(JTextField)testutils.getChildNamed(frame, "t1");
        assertNotNull("cant access the JButton",  t1);
        t1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t1.getText());
    }
    
    @Test
    public void testJtextfield2() throws InterruptedException
    {
        form1 frame;
        JTextField t2;
        String expresult;
        frame=new form1();
        frame.setVisible(true);
        t2=(JTextField)testutils.getChildNamed(frame, "t2");
        assertNotNull("cant access the JButton",  t2);
        t2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t2.getText());
    }
    
    @Test
    public void testJtextfield3() throws InterruptedException
    {
        form1 frame;
        JTextField t3;
        String expresult;
        frame=new form1();
        frame.setVisible(true);
        t3=(JTextField)testutils.getChildNamed(frame, "t3");
        assertNotNull("cant access the JButton",  t3);
        t3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t3.getText());
    }
    
    @Test
    public void testJtextfield4() throws InterruptedException
    {
        form1 frame;
        JTextField t4;
        String expresult;
        frame=new form1();
        frame.setVisible(true);
        t4=(JTextField)testutils.getChildNamed(frame, "t4");
        assertNotNull("cant access the JButton",  t4);
        t4.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t4.getText());
    }
}
