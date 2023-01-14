
package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JTextField;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class PASSENGERTest {
    
    @Test
    public void testJbuttonb1() throws InterruptedException
    {
        PASSENGER frame;
        JButton b1;
        String expresult;
        frame=new PASSENGER();
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
        FORM frame;
        JButton b2;
        String expresult;
        frame=new FORM();
        frame.setVisible(true);
        b2=(JButton)testutils.getChildNamed(frame, "b2");
        assertNotNull("cant access the JButton",  b2);
        b2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b2.getText());
    }
    
    public void testJtextfield1() throws InterruptedException
    {
        PASSENGER frame;
        JTextField t1;
        String expresult;
        frame=new PASSENGER();
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
        PASSENGER frame;
        JTextField t2;
        String expresult;
        frame=new PASSENGER();
        frame.setVisible(true);
        t2=(JTextField)testutils.getChildNamed(frame, "t2");
        assertNotNull("cant access the JButton",  t2);
        t2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t2.getText());
    }
    
    public void testJtextfield3() throws InterruptedException
    {
        PASSENGER frame;
        JTextField t3;
        String expresult;
        frame=new PASSENGER();
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
        PASSENGER frame;
        JTextField t4;
        String expresult;
        frame=new PASSENGER();
        frame.setVisible(true);
        t4=(JTextField)testutils.getChildNamed(frame, "t4");
        assertNotNull("cant access the JButton",  t4);
        t4.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t4.getText());
    }
}
