package formatter;

import api.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements  Formatter<Phone> {
    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
        System.out.println("inside the parse methos of the phone number formatter");
        //logic
        String[] phoneNumberArray=completePhoneNumber.split("-");
        Phone phone=new Phone();
        int index=completePhoneNumber.indexOf('-');
        if(index==-1)
        {
            phone.setCountryCode("91");
            phone.setUserNumber(phoneNumberArray[0]);
        }
        else {


        phone.setCountryCode(phoneNumberArray[0]);
        phone.setUserNumber(phoneNumberArray[1]);}
        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        //usedto display the default value in the view

        return phone.getCountryCode()+"-"+phone.getUserNumber();
    }
}
