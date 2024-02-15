package controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class Test2Controller {
    @RequestMapping("/normalMethod")
    public String handlingmethod(@SessionAttribute ("firstName") String firstName, Model model, HttpSession session)
    {
        //String firstName= (String)model.getAttribute("firstName");
        String newFirstName="Mr"+firstName;
        model.addAttribute("firstName",newFirstName);
        String newAddress=(String)session.getAttribute("address");
        String address=newAddress+"new controller";
        model.addAttribute("address",address);
        System.out.println("inside new controller, retrieving first name"+firstName);
        return "hello-world";
    }
}
