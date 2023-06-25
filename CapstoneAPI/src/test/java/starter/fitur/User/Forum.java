package starter.fitur.User;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Forum {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3OTgwNjYwfQ.uc_rrgBA5Qx8eCcUS0JG_66jm3NJmx_BoavbE2rtb-8";

    protected static String invToken = "abcdef";

    @Step("I set create forum endpoint")
    public String setCreateForumEnd(){return url+"/users/forums";}
    @Step("I send POST create forum Request")
    public void sendPostCreateForumReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "https://youtu.be/AbXyAoTS7Ps")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I success create forum and response code 200")
    public void successCreateForum(){
        restAssuredThat(response -> response.body("meta.message", equalTo("successfully created forum data")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send POST create forum Request with empty category id")
    public void sendReqEmptyCategoryId(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "")
                .formParam("link", "https://youtu.be/AbXyAoTS7Ps")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message category is required")
    public void messageCategoryisRequired(){
        restAssuredThat(response -> response.body("meta.message", equalTo("category is required")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send POST create forum Request with empty link")
    public void sendReqEmptyLink(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message link is required")
    public void messageLinkIsRequired(){
        restAssuredThat(response -> response.body("meta.message", equalTo("link is required")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send POST create forum Request with empty topic")
    public void sendReqEmptyTopic(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "https://youtu.be/vaasnYZ827c")
                .formParam("topic", "")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message topic are required")
    public void messageTopicAreRequired(){
        restAssuredThat(response -> response.body("meta.message", equalTo("topic are required")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send POST crete forum Request with invalid token")
    public void sendPostReqInvalidToken(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(invToken)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "https://youtu.be/vaasnYZ827c")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message invalid token")
    public void failCreateForum(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
    @Step("I set get all forum endpoint")
    public String setGetAllForumEnd(){return url+"/users/forums";}
    @Step("I send GET all forum Request")
    public void sendGetReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .when()
                .get(setGetAllForumEnd());
    }
    @Step("I success get all forum and response code 200")
    public void successGetAllForum(){
        restAssuredThat(response -> response.body("meta.message", equalTo("success to get all forum data")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send GET all forum Request with invalid token")
    public void sendReqInvalidToken(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(invToken)
                .when()
                .get(setGetAllForumEnd());
    }
    @Step("I fail get all forum and message invalid token")
    public void messageInvalidToken(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }

    // update forum
    @Step("I set PUT forum valid endpoint")
    public String setPutForumValidEndpoint() {
        return url + "/users/forums/5f380d1d-0a77-40fa-a98a-485dd95c647a";
    }

    @Step("I set PUT forum invalid endpoint")
    public String setPutForumInvalidEndpoint() {
        return url + "/users/forum/5f380d1d-0a77-40fa-a98a-485dd95c647a";
    }

    @Step("I set PUT forum valid endpoint with invalid ID")
    public String setPutForumInvalidID() {
        return url + "/users/forums/Bd681f7c-7cda-4e5d-a60f-5b182a5b8f10";
    }

    @Step("I set PUT forum valid endpoint with invalid token")
    public String setPutForumInvalidToken() {
        return url + "/users/forums/5f380d1d-0a77-40fa-a98a-485dd95c647a";
    }

    // join forum
    @Step("I set POST forum valid endpoint")
    public String setPostForumValidEndpoint() {
        return url + "/users/forums/joins";
    }

    @Step("I set POST forum invalid endpoint")
    public String setPostForumInvalidEndpoint() {
        return url + "/users/forum/join";
    }

    @Step("I set POST forum valid endpoint with invalid ID")
    public String setPostForumInvalidID() {
        return url + "/users/forums/joins";
    }

    @Step("I set POST forum valid endpoint with invalid token")
    public String setPostForumInvalidToken() {
        return url + "/users/forums/joins";
    }

    // update forum
    @Step("I send HTTP PUT forum to request with valid endpoint")
    public void sendPutReqForumValidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3OTgwNjYwfQ.uc_rrgBA5Qx8eCcUS0JG_66jm3NJmx_BoavbE2rtb-8")
                .put(setPutForumValidEndpoint());

    }

    @Step("I received HTTP forum response code 200 OK")
    public void HttpPutForumResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send HTTP PUT forum to request with invalid endpoint")
    public void sendPutReqForumInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3OTgwNjYwfQ.uc_rrgBA5Qx8eCcUS0JG_66jm3NJmx_BoavbE2rtb-8")
                .put(setPutForumInvalidEndpoint());

    }

    @Step("I received HTTP forum response code 404 Not Found")
    public void HttpPutForumResponse404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send HTTP PUT forum to request with invalid ID")
    public void sendPutReqForumInvalidID() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3OTgwNjYwfQ.uc_rrgBA5Qx8eCcUS0JG_66jm3NJmx_BoavbE2rtb-8")
                .put(setPutForumInvalidID());

    }

    @Step("I received HTTP forum response code 400")
    public void HttpPutForumResponse400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send HTTP PUT forum to request with invalid token")
    public void sendPutReqForumInvalidToken() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3NzAwNTI4fQ")
                .put(setPutForumInvalidToken());

    }

    @Step("I received HTTP forum response code 401")
    public void HttpPutForumResponse401() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // join forum
    @Step("I send HTTP POST forum to request with valid endpoint")
    public void sendPostReqForumValidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("forum_id", "9f03dd62-7744-4963-b122-61bbba21653b");

        SerenityRest.given().auth().oauth2(token).relaxedHTTPSValidation()
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostForumValidEndpoint());
    }

    @Step("I received HTTP join forum response code 200 OK")
    public void HttpPostForumResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send HTTP POST forum to request with invalid endpoint")
    public void sendPostReqForumInvalidEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("forum_id", "9f03dd62-7744-4963-b122-61bbba21653b");

        SerenityRest.given().auth().oauth2(token).relaxedHTTPSValidation()
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostForumInvalidEndpoint());
    }

    @Step("I received HTTP join forum response code 404 Not Found")
    public void HttpPostForumResponse404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send HTTP POST forum to request with invalid ID")
    public void sendPostReqForumInvalidID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("forum_id", "b8e86d73-c9fa-46d1-e6c47df32612");

        SerenityRest.given().auth().oauth2(token).relaxedHTTPSValidation()
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostForumInvalidID());
    }

    @Step("I received HTTP join forum response code 400")
    public void HttpPostForumResponse400() {
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I send HTTP POST forum to request with invalid token")
    public void sendPostReqForumInvalidToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("forum_id", "9f03dd62-7744-4963-b122-61bbba21653b");

        SerenityRest.given().auth().oauth2(invToken).relaxedHTTPSValidation()
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostForumInvalidToken());
    }

    @Step("I received HTTP join forum response code 401")
    public void HttpPostForumResponse401() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
