package gui.project;

import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.junit.Test;
import static org.junit.Assert.*;

public class selectTest {
    

    @Test
    public void testJbuttonadmin() throws InterruptedException
    {
        select frame;
        JButton admin;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        admin=(JButton)testutils.getChildNamed(frame, "a");
        assertNotNull("cant access the JButton",  admin);
        admin.setText("testing");
        sleep(4000);
        admin.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,admin.getText());
    }
    
    @Test
    public void testJbuttoncustomer() throws InterruptedException
    {
        select frame;
        JButton customer;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        customer=(JButton)testutils.getChildNamed(frame, "c");
        assertNotNull("cant access the JButton",  customer);
        customer.setText("testing");
        sleep(4000);
        customer.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,customer.getText());
    }
    
    @Test
    public void testJbuttonguardian() throws InterruptedException
    {
        select frame;
        JButton guardian;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        guardian=(JButton)testutils.getChildNamed(frame, "g");
        assertNotNull("cant access the JButton",  guardian);
        guardian.setText("testing");
        sleep(4000);
        guardian.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,guardian.getText());
    }
    
    @Test
    public void testJbuttonreturnmain() throws InterruptedException
    {
        select frame;
        JButton returnmain;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        returnmain=(JButton)testutils.getChildNamed(frame, "r");
        assertNotNull("cant access the JButton",  returnmain);
        returnmain.setText("testing");
        sleep(4000);
        returnmain.doClick();
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,returnmain.getText());
    }    
    
    @Test
    public void testJLabel1() throws InterruptedException
    {
        select frame;
        JLabel l1;
        String expresult;
        frame=new select();
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
        select frame;
        JLabel l2;
        String expresult;
        frame=new select();
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
        select frame;
        JLabel l3;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        l3=(JLabel)testutils.getChildNamed(frame, "l3");
        assertNotNull("cant access the JButton",  l3);
        l3.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l3.getText());
    }  
    
    @Test
    public void testJLabel4() throws InterruptedException
    {
        select frame;
        JLabel l4;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        l4=(JLabel)testutils.getChildNamed(frame, "l4");
        assertNotNull("cant access the JButton",  l4);
        l4.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l4.getText());
    }  
    
    @Test
    public void testJLabel5() throws InterruptedException
    {
        select frame;
        JLabel l5;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        l5=(JLabel)testutils.getChildNamed(frame, "l5");
        assertNotNull("cant access the JButton",  l5);
        l5.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l5.getText());
    } 
    
    @Test
    public void testJLabel6() throws InterruptedException
    {
        select frame;
        JLabel l6;
        String expresult;
        frame=new select();
        frame.setVisible(true);
        l6=(JLabel)testutils.getChildNamed(frame, "l6");
        assertNotNull("cant access the JButton",  l6);
        l6.setText("testing");
        sleep(4000);
        expresult="testing";
        assertEquals(expresult,l6.getText());
    }  
}
