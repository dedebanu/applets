import java.applet.*;
import java.awt.*;
public class app1 extends Applet
{
        String name;
        int id;
        Integer i;
        public void init()
        {
                name=getParameter("Name");
                id=Integer.parseInt(getParameter("ID"));
                System.out.println("Applet init");
                
        }
        public void start()
        {
                ++id;
                i=new Integer(id);
                System.out.println("Applet started\n");
        
        }
        public void paint(Graphics g)
        {
                g.drawString(name,20,20);
                g.drawString(i.toString(),50,30);
                System.out.println("PAint called\n");
                
        }
        public void stop()
        {
                System.out.println("stopped");
        }
        public void destroy()
        {
                System.out.println("destroy");
        }




}
