package tests;

import endpoints.UserEndPoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import payload.User;

import java.util.Random;

public class UserTestCases {
    //    Faker faker = new Faker();
    User userPayload = new User();
    String em = userPayload.getEmail();
    String otp = "1313";
    Random random = new Random();
    int randomInt = random.nextInt(10000)+1;

    @BeforeClass
    public void setupData(){

//        userPayload.setName(faker.name().name());
//        userPayload.setEmail(faker.internet().safeEmailAddress());
//        String pass = userPayload.setPassword(faker.internet().password(6,10));
//        userPayload.setPassword_confirmation(pass);
        userPayload.setName("test_"+ randomInt);
        userPayload.setEmail("test-"+randomInt+"@test.com");
        userPayload.setPassword("123456");
        userPayload.setPassword_confirmation("123456");

    }

    @Test(priority = 1)
    public void testPostUser(){
        Response response = UserEndPoints.createUser(userPayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test (priority = 2)
    public void verifyOTP(){
        Response response = UserEndPoints.verifyOtp(userPayload.getEmail(),otp);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
