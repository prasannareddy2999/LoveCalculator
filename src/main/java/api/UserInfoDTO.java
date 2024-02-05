package api;


import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {
    @NotEmpty(message = "* UserName cant be blank ")
    @Size(min=3,max=20,message="*Your Name should have atleast 3 characters and atmost 20 characters")
    private String userName;

    public boolean isTermAndCondition() {
        return termAndCondition;
    }

    public void setTermAndCondition(boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }

   @AssertTrue(message = "You have to agree to our terms and conditions")
    private boolean termAndCondition;

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    @NotEmpty(message = "* Crush Name cant be blank ")
    @Size(min=3,max=20,message="*Your Name should have atleast 3 characters and atmost 20 characters")
    private String crushName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserInfoDTP{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
