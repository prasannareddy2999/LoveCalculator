package controllers;

import api.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
    @RequestMapping("/sendEmail")
    public String sendEmail(@CookieValue("lcApp.userName")String userName,Model model)
    {
        model.addAttribute("userName",userName);
        model.addAttribute("emailDTO", new EmailDTO());
        return "sendemail-page";
    }
    @RequestMapping("/processEmail")
    public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO)
    {
        return "processemail-page";
    }
}
