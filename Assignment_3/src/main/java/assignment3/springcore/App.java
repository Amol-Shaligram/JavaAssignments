package assignment3.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {
        Hello h;

        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldJavaConfig.class);
        h = (Hello)ctx.getBean("hellobean");
        h.print();
    }
}
