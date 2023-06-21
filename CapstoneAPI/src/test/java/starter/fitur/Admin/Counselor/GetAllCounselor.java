package starter.fitur.Admin.Counselor;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCounselor {
    protected static String url = "https://13.210.163.192:8080";

    @Step("I set GET all counselor with valid endpoint")
    public String setGetAllCounselorWithValidEndpoint() {
        return url + "/admin/counselors";

    }

    @Step("I set GET all counselor with invalid endpoint")
    public String setGetAllCounselorWithInvalidEndpoint() {
        return url + "/admin/counselor";

    }

    @Step("I send HTTP GET request with valid endpoint")
    public void sendReqValidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI")
                .get(setGetAllCounselorWithValidEndpoint());

    }
    @Step("I receive a valid HTTP response code 200 OK")
    public void HttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }


    @Step("I send HTTP GET request with invalid endpoint")
    public void sendReqInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI")
                .get(setGetAllCounselorWithInvalidEndpoint());

    }
    @Step("I received HTTP response code 404 Not Found")
    public void HttpResponse404() {
        restAssuredThat(response -> response.statusCode(404));

    }
}
