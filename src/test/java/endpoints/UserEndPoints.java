package endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.VerifyOTPRequestBody;
import payload.User;

import static io.restassured.RestAssured.given;

public class UserEndPoints {
    public static Response createUser(User payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.post_createUser);

        return response;
    }

    public static Response verifyOtp(String email, String OTP){
        VerifyOTPRequestBody verifyOTPRequestBody = new VerifyOTPRequestBody();
        verifyOTPRequestBody.otp=OTP;
        verifyOTPRequestBody.email=email;
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(verifyOTPRequestBody)
                .when()
                .post(Routes.post_otp);

        return response;
    }
}
