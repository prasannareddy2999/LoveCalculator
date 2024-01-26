package config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//second approach
//Spring is taking control and creating dispatcher servelet object for us
public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected  Class<?>[] getRootConfigClasses(){
        return null;
    };

    @Override
    protected  Class<?>[] getServletConfigClasses()//provide config classes name
    {
        Class arr[]={LoveCalculatorAppConfig.class};
        return arr;
    };

    @Override
    protected String[] getServletMappings()
    {
        String arr[]={"/"};
        return arr;
    }


}
