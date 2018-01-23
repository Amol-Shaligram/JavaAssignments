package assignment8.springcore;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldjavaConfiguration
{
    @Bean(name = "hellobean")
    @Scope("prototype")
    public Hello getHello()
    {
        Hello h = new Hello();
        h.setMessage("Hello World ! ! ! from ApplicationContext and JavaConfiguration and Prototype scope");
        return h;
    }
}
