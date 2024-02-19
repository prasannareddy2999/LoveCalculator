package controllers;

import api.EmailDTO;
import api.UserInfoDTO;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.LcAppEmailService;
import service.LcAppEmailServiceImpl;

@Controller
public class EmailController {
    @Autowired
    LcAppEmailService lcAppEmailService;
    @RequestMapping("/sendEmail")
    public String sendEmail(@CookieValue("lcApp.userName")String userName,Model model)
    {
        model.addAttribute("userName",userName);
        model.addAttribute("emailDTO", new EmailDTO());
        return "sendemail-page";
    }
    @RequestMapping("/processEmail")
    public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO, @ModelAttribute("emailDTO") EmailDTO emailDTO)
    {
        /*String username= (String)session.getAttribute("userName");
        String newUserName="Ms."+username;
        model.addAttribute("userName",newUserName);*/
       lcAppEmailService.sendEmail(userInfoDTO.getUserName(),emailDTO.getUserEmail(),"FRIEND");

        return "processemail-page";
    }
}
