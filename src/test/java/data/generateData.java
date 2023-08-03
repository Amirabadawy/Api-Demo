package data;

import models.RegisterRequestBody;

import java.util.Random;

public class generateData {
    Random random = new Random();
    int randomInt = random.nextInt(10000)+1;
    RegisterRequestBody registerRequestBody = new RegisterRequestBody();
    String otp = "1313";


    public void UserData(){
        registerRequestBody.setName("test_"+ randomInt);
        registerRequestBody.setEmail("test-"+randomInt+"@test.com");
        registerRequestBody.setPassword("123456");
        registerRequestBody.setPassword_confirmation("123456");
    }
}
