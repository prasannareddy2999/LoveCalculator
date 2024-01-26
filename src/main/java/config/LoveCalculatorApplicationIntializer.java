package config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Developer is having full control over dispatcher Servelet Object
//1st approach==public class LoveCalculatorApplicationIntializer implements WebApplicationInitializer
public class LoveCalculatorApplicationIntializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext=new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(LoveCalculatorAppConfig.class);
        //create a context and set up config file with it
        //xml way of loading spring config
        //XmlWebApplicationContext webApplicationContext=new XmlWebApplicationContext();
       // webApplicationContext.setConfigLocation("classpath:application-config.xml");
        DispatcherServlet dispatcherServlet=new DispatcherServlet(annotationConfigWebApplicationContext);//create a dispatcher servelet object
        ServletRegistration.Dynamic mycustomDispatcherServelet= servletContext.addServlet("myDispatcherServelet",dispatcherServlet);//register object with serveletCOntext
        //ServletRegistration is an interface which has inner interface Dynamic.It is used to initialise the Dispatcher servelet object while deployement
        //configure load on startup and url mapping
        mycustomDispatcherServelet.setLoadOnStartup(1);
        mycustomDispatcherServelet.addMapping("/mywebsite.com/*");

    }
}
