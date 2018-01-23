package assignment5.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        Hello h,h1,h2;
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springcore.xml");
        h = (Hello)ctx.getBean("hellobean");
        h.print();

        h1 = (Hello)ctx.getBean("hellobean");
        h1.print();

        h2 = (Hello)ctx.getBean("hellobean");
        h2.print();
    }
}
