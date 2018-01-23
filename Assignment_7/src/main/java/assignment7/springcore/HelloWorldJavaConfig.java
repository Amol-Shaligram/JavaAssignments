package assignment7.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldJavaConfig
{
    @Bean(name = "hellobean" )
    @Scope("singleton")
    public Hello getHello()
    {
        Hello h = new Hello();
        h.setMessage("Hello World ! ! ! from ApplicationContext and JavaConfiguration and Singleton scope");
        return h;
    }
}
