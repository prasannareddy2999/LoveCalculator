package controllers;

import api.EmailDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
    @RequestMapping("/sendEmail")
    public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO)
    {
        return "sendemail-page";
    }
    @RequestMapping("/processEMail")
    public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO)
    {
        return "processemail-page";
    }
}
