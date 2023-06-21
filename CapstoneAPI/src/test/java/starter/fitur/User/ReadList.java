package starter.fitur.User;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class ReadList {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzIyOTUwfQ.ZFIdN4_i2Qpu_JhyVnlmS0UQ5aq9yp40HycYSaEALdA";
    protected static String invToken = "eYj";
    private String name;
    private String description;
    private String article_id;
    private String reading_list_id;
    private Response response;

    public String setReadListEndpoint() {
        return url + "/users/reading-lists";
    }
    public String setReadListInvEndpoint() {
        return url + "/urs/reading-lists";
    }

    public void sendPostRequest(String name, String description) {
        this.name = name;
        this.description = description;

        JSONObject body = new JSONObject();
        body.put("name", name);
        body.put("description", description);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(token)
                .baseUri(setReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void sendPostRequestInvEnd(String name, String description) {
        this.name = name;
        this.description = description;

        JSONObject body = new JSONObject();
        body.put("name", name);
        body.put("description", description);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(token)
                .baseUri(setReadListInvEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void sendPostRequestInvToken(String name, String description) {
        this.name = name;
        this.description = description;

        JSONObject body = new JSONObject();
        body.put("name", name);
        body.put("description", description);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(invToken)
                .baseUri(setReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void success() {
        response.then().statusCode(200);
    }

    public void failCreateReadList401() {
        response.then().statusCode(401);
    }
    public void failCreateReadList400() {
        response.then().statusCode(400);
    }
    public void failCreateReadList404() {
        response.then().statusCode(404);
    }
    public void sendGetRequest() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setReadListEndpoint());
    }
    public void successGet() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendGetRequestInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invToken).get(setReadListEndpoint());
    }
    public void failGet() {
        restAssuredThat(response -> response.statusCode(401));
    }

    public String setSaveToReadListEndpoint() {
        return url + "/users/reading-lists/save";
    }

    public void sendSavePostRequest(String article_id, String reading_list_id) {
        this.article_id = article_id;
        this.reading_list_id = reading_list_id;

        JSONObject body = new JSONObject();
        body.put("article_id", article_id);
        body.put("reading_list_id", reading_list_id);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(token)
                .baseUri(setSaveToReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void sendSavePostRequestInvToken(String article_id, String reading_list_id) {
        this.article_id = article_id;
        this.reading_list_id = reading_list_id;

        JSONObject body = new JSONObject();
        body.put("article_id", article_id);
        body.put("reading_list_id", reading_list_id);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(invToken)
                .baseUri(setSaveToReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void response200() {
        response.then().statusCode(200);
    }
    public void response401() {
        response.then().statusCode(401);
    }
    public void response400() {
        response.then().statusCode(400);
    }
}
