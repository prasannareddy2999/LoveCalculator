package controllers;

import api.UserInfoDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class LCAppController {
    @RequestMapping("/")
    public String showHomepAge(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO)
    {

        return "home-page";
    }
    @RequestMapping("/process-homepage")
    public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result)
    {
        System.out.println("In controller");


        if(result.hasErrors())
        {
            List<ObjectError> allErrors=result.getAllErrors();

            return "home-page";
        }
        return "result-page";
    }
}
