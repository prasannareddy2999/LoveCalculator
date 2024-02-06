package api;

import java.util.Arrays;

public class UserRegistrationDTO {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name="your name";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    private String userName="username";
    private String Password="pass";
    private String country="India";
    private String[] hobby={"Travel","Reading"};

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender="Female";

    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", Password='" + Password + '\'' +
                ", country=" + (country) +
                ", hobby=" + Arrays.toString(hobby) +
                ", gender='" + gender + '\'' +
                '}';
    }
}
