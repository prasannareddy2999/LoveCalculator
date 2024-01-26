package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc //Enbles all the mvc features
@Configuration
@ComponentScan(basePackages = "controllers")
public class LoveCalculatorAppConfig {
//we create view resolver in config file using class internalresourceviewresolverclass
    @Bean
    public InternalResourceViewResolver viewResolver()
    {
        System.out.println("creating bean for vr");
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;

    }

}
