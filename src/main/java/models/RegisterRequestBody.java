package models;

public class RegisterRequestBody {
    public String name;
    public String email;
    public String password;
    public String password_confirmation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    public String getPassword_confirmation() {
        return password_confirmation;
    }

    public void setPassword_confirmation(String password_confirmation) {
        this.password_confirmation = password_confirmation;
    }

//    public RegisterRequestBody(String name, String email, String password, String password_confirmation){
//        this.name = name;
//        this.email= email;
//        this.password = password;
//        this.password_confirmation = password_confirmation;
//
//
//    }
}
