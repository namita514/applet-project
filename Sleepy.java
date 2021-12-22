import java.applet.*; 
import java.awt.*; 
import java.awt.Button; 
import java.awt.event.*; 
import java.applet.*;

/*<applet code="Sleepy.class" width="500" height="500"></applet>*/

public class Sleepy extends Applet implements ActionListener
{
    int x=20, x1=20, o=50, o1=60, p=120, p1=60, a=80, a1=125;

    public void init()
    {
        setLayout(null);
        Button button1 = new Button("Right");
        add(button1); 
        button1.setBounds(100,20,80,30);
        button1.addActionListener(this);

        Button button2 = new Button("Left");
        add(button2); 
        button2.setBounds(10,20,80,30);
        button2.addActionListener(this);

        Button button3 = new Button("Up");
        add(button3); 
        button3.setBounds(10,80,80,30);
        button3.addActionListener(this);

        Button button4 = new Button("Down");
        add(button4); 
        button4.setBounds(100,80,80,30);
        button4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();

        if(str.equals("Right"))
        {
            x=x+10;
            o=o+10;
            p=p+10;
            a=a+10;
        }
        else if(str.equals("Left"))
        {
            x=x-10;
            o=o-10;
            p=p-10;
            a=a-10;
        }
        else if(str.equals("Up"))
        {
            x1=x1-10;
            o1=o1-10;
            p1=p1-10;
            a1=a1-10;
        }
        else if(str.equals("Down"))
        {
            x1=x1+10;
            o1=o1+10;
            p1=p1+10;
            a1=a1+10;
        }

        repaint();
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(x,x1,150,150);
        g.setColor(Color.black); 
        g.drawArc(o,o1,30,20,180,180); 
        g.drawArc(p,p1,30,20,180,180); 
        g.fillOval(a,a1,35,45);
    }
}