package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("firstName")
public class TestController
{


    @RequestMapping("/first")
    public String first(Model model)
    {
        model.addAttribute("firstName","Milky");
        model.addAttribute("lastName","Pandu");
        return"hello-world";

    }


    @RequestMapping("/second")
    public String second(Model model1)

    {
        String firstName=(String)model1.getAttribute("firstName");
        System.out.println(firstName);
        /*model.addAttribute("firstName","Milky");
        model.addAttribute("lastName","Pandu");*/
        return"hello-world";

    }
}
