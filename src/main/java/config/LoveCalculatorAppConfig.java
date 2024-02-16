package config;

import formatter.PhoneNumberFormatter;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;

@EnableWebMvc //Enbles all the mvc features
@Configuration
@ComponentScan(basePackages = "controllers")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {
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

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }
    @Bean(name="validator")
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource());
        return localValidatorFactoryBean;
    }

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
        javaMailSenderImpl.setHost("stmp.gmail.com");
        javaMailSenderImpl.setUsername("prasannareddy3555@gmail.com");
        javaMailSenderImpl.setPort(567);
        Properties mailProperties=new Properties();
        mailProperties.put("mail.smtp.starttls.enable", true);
        mailProperties.put("mail.smtp.ssl.trust","stmp.gmail.com");
        return javaMailSenderImpl;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneNumberFormatter());
    }

    @Override
    public Validator getValidator(){
    return validator();
}

}
