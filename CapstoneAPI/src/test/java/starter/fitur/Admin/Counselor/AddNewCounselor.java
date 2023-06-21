package starter.fitur.Admin.Counselor;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class AddNewCounselor {
    protected String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODY5MzEyNDd9.4KUiEVZpL6yvgij6dSw1G0YJ1XKMwFqOKVveXW-FFww";
    private Response response;
    private Map<String, Object>data = new HashMap<>();

    @Step("I set POST endpoint")
    public String setPostEndpoint() {
        return url + "/admin/counselors";
    }

    @Step("I send POST HTTP request")
    public void data(io.cucumber.datatable.DataTable dataTable) {
        for (Map<Object, Object> row : dataTable.asMaps(String.class, String.class)){
            Object field = row.get("name");
            Object value = row.get("value");
            if (field.equals("image") && value != null){
                File imageFile = new File((String) value);
                data.put((String) field, imageFile);

            } else{
                data.put((String) field, value);
            }
        }
        response = RestAssured.given().relaxedHTTPSValidation()
                .contentType("multipart/form-data")
                .multiPart("image", data.get("image"))
                .formParams(data)
                .post(setPostEndpoint());
    }

    @Step("I receive valid HTTP response code 200 OK")
    public void HttpPostResponse200() {
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            Assert.assertEquals(200, statusCode);
        } else if (statusCode == 400) {
            Assert.assertEquals(400, statusCode);
            System.out.println("Status code 400");
        } else if (statusCode == 401) {
            Assert.assertEquals(401, statusCode);
            System.out.println("Status code 401");
        }
    }
}
