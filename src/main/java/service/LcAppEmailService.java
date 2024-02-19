package service;

import org.springframework.stereotype.Service;


public interface LcAppEmailService {
     void sendEmail(String userName,String userEmail, String result);
}
