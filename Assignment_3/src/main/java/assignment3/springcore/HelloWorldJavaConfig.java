package assignment3.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldJavaConfig
{
    @Bean(name = "hellobean")
    public Hello getHello()
    {
        Hello h = new Hello();
        h.setMessage("Hello World ! ! ! from ApplicationContext and Java Configuration");
        return h;
    }
}
