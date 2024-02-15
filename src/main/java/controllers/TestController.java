package controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("firstName")
public class TestController
{


    @RequestMapping("/first")
    public String first(Model model, HttpSession session)
    {
        session.setAttribute("address","hyd");

        model.addAttribute("firstName","Milky");
        model.addAttribute("lastName","Pandu");
        model.addAttribute("next","second");
        return"hello-world";

    }



    @RequestMapping("/second")
    public String second(Model model1, SessionStatus status)

    {
        String firstName=(String)model1.getAttribute("firstName");
        System.out.println(firstName);
        model1.addAttribute("firstName","Milky");
        model1.addAttribute("lastName","Pandu");
        model1.addAttribute("next","third");
        //removing session attributes from the session scope
        //status.setComplete();
        return"hello-world";

    }
    @RequestMapping("/third")
    public String third(Model model2,HttpSession session)

    {
        String firstName=(String)model2.getAttribute("firstName");
        System.out.println(firstName);
        String newAddress=(String)session.getAttribute("address");
        String address=newAddress+"kkk";
        model2.addAttribute("lastName","Pandu");
        model2.addAttribute("next","normalMethod");
        model2.addAttribute("address",address);

        return"hello-world";

    }
}
