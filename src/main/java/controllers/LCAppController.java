package controllers;

import api.CommunicationDTO;
import api.Phone;
import api.UserInfoDTO;
import api.UserRegistrationDTO;
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

    @RequestMapping("/register")
    public String showRegistrationPage( @ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO)
    {

        /*if(result.hasErrors())
        {
            System.out.println("My page has errors");
            List<ObjectError> allErrors=result.getAllErrors();
            for(ObjectError error:allErrors)
            {
                System.out.println(error);
            }


        }
        System.out.println("inside Registration-page method");
        Phone phone=new Phone();
        phone.setCountryCode("91");
        phone.setUserNumber("123456");
        CommunicationDTO communicationDTO=new CommunicationDTO();
        communicationDTO.setPhone(phone);
        userRegistrationDTO.setCommunicationDTO(communicationDTO);*/

        return "registration-page";
    }

    @RequestMapping("/process-registerpage")
    public String showRegisterResultPage(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO)
    {



        return "registrationsucess-page";
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

        // write a service which will calculate the love percentatege between user and crush

        return "result-page";
    }
}
