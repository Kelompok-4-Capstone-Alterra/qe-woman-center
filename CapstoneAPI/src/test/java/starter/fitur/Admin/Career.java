package starter.fitur.Admin;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Career {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODY5MTM4MjZ9.ZZSSTRWtwSSsm3xTWaJ5hpwRTJVRFSk5Or-0DufQf7Y";
    protected static String invalidToken = "eyJh";
    private Response response;
    private Map<String, Object> data = new HashMap<>();

    public String setCareerEndpoint() {
        return url + "/admin/careers";
    }
    public String setInvalidCareerEndpoint() {
        return url + "/adm/careers";
    }
    public void sendReq() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setCareerEndpoint());
    }
    public void sendReqInvalidEndpoint() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setInvalidCareerEndpoint());
    }
    public void sendReqInvalidMethod() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).put(setCareerEndpoint());
    }
    public void sendReqInvalidToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).put(setCareerEndpoint());
    }
    public void successViewAllCareer() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void failViewCareer404() {
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("message", equalTo("Not Found")));
    }
    public void failViewCareer401() {
        restAssuredThat(response -> response.statusCode(401));
    }
    public void data(io.cucumber.datatable.DataTable dataTable) {
        for (Map<String, String> row : dataTable.asMaps(String.class, String.class)) {
            String field = row.get("job_position");
            String value = row.get("value");
            if (field.equals("image") && value != null) {
                File imageFile = new File(value);
                data.put(field, imageFile);
            } else {
                data.put(field, value);
            }
        }
        response = RestAssured.given().relaxedHTTPSValidation()
                .contentType("multipart/form-data")
                .multiPart("image", data.get("image"))
                .formParams(data)
                .post(setCareerEndpoint());
    }
    public void response() {
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            Assert.assertEquals(200, statusCode);
        } else if (statusCode == 400) {
            Assert.assertEquals(400, statusCode);
            System.out.println("Status code 400");
        }else if (statusCode == 401) {
            Assert.assertEquals(401, statusCode);
            System.out.println("Status code 401");
        }
    }
}
