package assignment2.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String [] args)
    {
        Hello h;
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springcore.xml");
        h = (Hello)ctx.getBean("hellobean");
        h.print();
    }
}
