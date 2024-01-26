package controllers;

import api.UserInfoDTP;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LCAppController {
    @RequestMapping("/")
    public String showHomepAge(@ModelAttribute("userInfo") UserInfoDTP userInfoDTO)
    {

        return "home-page";
    }
    @RequestMapping("/process-homepage")
    public String showResultPage( @ModelAttribute("userInfo")UserInfoDTP userInfoDTO)
    {
        return "result-page";
    }
}
