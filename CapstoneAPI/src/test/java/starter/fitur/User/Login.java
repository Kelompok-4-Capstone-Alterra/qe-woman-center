package starter.fitur.User;

import org.json.simple.JSONObject;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Login {
    protected static String url = "https://13.210.163.192:8080";
    private Response response;

    public String setUserLoginEndpoint() {
        return url + "/login";
    }

    public void sendUserPostRequest(String username, String password) {
        JSONObject body = new JSONObject();
        body.put("username", username);
        body.put("password", password);

        RequestSpecification request = given().relaxedHTTPSValidation()
                .baseUri(setUserLoginEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }

    public void verifySuccessUserLogin() {
        response.then().statusCode(200);
    }

    public void verifyFailedUserLogin() {
        response.then().statusCode(400);
    }
}
