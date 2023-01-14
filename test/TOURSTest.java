
package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

public class TOURSTest {
    
    @Test
    public void testJtextfield1() throws InterruptedException
    {
        TOURS frame;
        JTextField t1;
        String expresult;
        frame=new TOURS();
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
        TOURS frame;
        JTextField t2;
        String expresult;
        frame=new TOURS();
        frame.setVisible(true);
        t2=(JTextField)testutils.getChildNamed(frame, "t2");
        assertNotNull("cant access the JButton",  t2);
        t2.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,t2.getText());
    }
    
    @Test
    public void testJCombo1() throws InterruptedException
    {
        TOURS frame;
        JComboBox a1;
        String expresult;
        frame=new TOURS();
        frame.setVisible(true);
        a1=(JComboBox)testutils.getChildNamed(frame, "a1");
        assertNotNull("cant access the JButton",  a1);
        a1.setSelectedItem("testing");
        sleep(4000);
        expresult="testing";
        assertEquals("LAHORE",a1.getSelectedItem());
    }
    
    @Test
    public void testJCombo2() throws InterruptedException
    {
        TOURS frame;
        JComboBox a2;
        String expresult;
        frame=new TOURS();
        frame.setVisible(true);
        a2=(JComboBox)testutils.getChildNamed(frame, "a2");
        assertNotNull("cant access the JButton",  a2);
        a2.setSelectedItem("testing");
        sleep(4000);
        expresult="testing";
        assertEquals("LAHORE",a2.getSelectedItem());
    }
    
    @Test
    public void testJbuttonb2() throws InterruptedException
    {
        TOURS frame;
        JButton b2;
        String expresult;
        frame=new TOURS();
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
    public void testJbuttonb1() throws InterruptedException
    {
        TOURS frame;
        JButton b1;
        String expresult;
        frame=new TOURS();
        frame.setVisible(true);
        b1=(JButton)testutils.getChildNamed(frame, "b1");
        assertNotNull("cant access the JButton",  b1);
        b1.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b1.getText());
    }
    
    @Test
    public void testJbuttonb3() throws InterruptedException
    {
        TOURS frame;
        JButton b3;
        String expresult;
        frame=new TOURS();
        frame.setVisible(true);
        b3=(JButton)testutils.getChildNamed(frame, "b3");
        assertNotNull("cant access the JButton",  b3);
        b3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b3.getText());
    }
    
    @Test
    public void testJbuttonb4() throws InterruptedException
    {
        TOURS frame;
        JButton b4;
        String expresult;
        frame=new TOURS();
        frame.setVisible(true);
        b4=(JButton)testutils.getChildNamed(frame, "b4");
        assertNotNull("cant access the JButton",  b4);
        b4.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,b4.getText());
    }
    
    @Test
    public void testJLabel1() throws InterruptedException
    {
        TOURS frame;
        JLabel l1;
        String expresult;
        frame=new TOURS();
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
        TOURS frame;
        JLabel l2;
        String expresult;
        frame=new TOURS();
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
        TOURS frame;
        JLabel l3;
        String expresult;
        frame=new TOURS();
        frame.setVisible(true);
        l3=(JLabel)testutils.getChildNamed(frame, "l3");
        assertNotNull("cant access the JButton",  l3);
        l3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l3.getText());
    }
    
}
