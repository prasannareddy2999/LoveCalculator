package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LcAppEmailServiceImpl implements LcAppEmailService {
    @Autowired
    JavaMailSender javaMailSender;
    @Override
    public void sendEmail(String userName,String userEmail, String result)
    {
        SimpleMailMessage newEmail=new SimpleMailMessage();
        newEmail.setTo(userEmail);
        newEmail.setSubject("Love Calculator Application Result");
        newEmail.setText("Hi"+userName+"The result predicted by love calculator is "+result);

        javaMailSender.send(newEmail);
    }

}
