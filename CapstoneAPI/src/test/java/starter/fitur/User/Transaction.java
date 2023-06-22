package starter.fitur.User;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Transaction {
    protected static String url = "https://13.210.163.192:8080";
    private String transactionUUID;

    // show
    public String setUserGetTransactionDetailEndpoint(String uuid) {
        transactionUUID = uuid;
        return url + "/users/transactions/" + uuid;
    }

    public void sendUserGetTransactionDetailRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.userToken)
                .get(setUserGetTransactionDetailEndpoint(transactionUUID));
    }

    public void verifyUserGetTransactionDetailResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Step("I set POST transaction endpoint")
    public String setPostTransaction(){
        return url + "/users/transactions";
    }

    @Step("I send HTTP POST transaction request with valid endpoint")
    public void sendPostReqTransaction(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("counselor_id", "97e192e7-09c8-11ee-b8a9-0242ac140003");
        requestBody.put("counselor_topic_key",1);
        requestBody.put("consultation_date_id", "13c94e77-0de8-11ee-99a8-0242c0a89003");
        requestBody.put("consultation_time_id", "13c94e97-0de8-11ee-99a8-0242c0a89003");
        requestBody.put("consultation_time_start", "08:00:00");
        requestBody.put("consultation_method", "chat");
        requestBody.put("voucher_id", "");

        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImY5M2YxMGM0LTAzYTEtMTFlZS1iNDRkLTAyNDJjMGE4NDAwMyIsImVtYWlsIjoid2F2YXhpeTY0OUBwZW9naS5jb20iLCJ1c2VybmFtZSI6IndhdmF4aXkxMjMiLCJhdXRoX2J5IjoiYXV0aCIsImV4cCI6MTY4NzQyNTA5OX0.UFmwqM400nHijAvfrp9WsmiDGHwKrQNidzVPHxB0OOY";
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostTransaction());
    }

    @Step("I receive a valid HTTP transaction response code 200 OK")
    public void HttpTransactionResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I set GET all transaction with valid endpoint")
    public String setGetAllTransaction() { return url + "/users/transactions"; }

    @Step("I set GET all transaction with invalid endpoint")
    public String setGetTransactionInvalidEndpoint() { return url + "/users/transaction"; }

    @Step("I set GET all transaction with valid endpoint but invalid token")
    public String setGetTransactionInvalidToken() { return url + "/users/transactions"; }

    @Step("I send HTTP GET transaction request with valid endpoint")
    public void sendGetReqTransaction() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzU2MzQ1fQ.4vbW9ef6DBqzzLhCi6QH9gjfg7bSCzx5WXjyYTfMP2c")
                .get(setGetAllTransaction());

    }
    @Step("I receive a valid HTTP all transaction response code 200 OK")
    public void HttpGetTransactionResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }


    @Step("I send HTTP GET transaction request with invalid endpoint")
    public void sendGetReqTransactionInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzU2MzQ1fQ.4vbW9ef6DBqzzLhCi6QH9gjfg7bSCzx5WXjyYTfMP2c")
                .get(setGetTransactionInvalidEndpoint());

    }
    @Step("I receive a valid HTTP all transaction response code 404 Not Found")
    public void HttpGetTransactionResponse404() {
        restAssuredThat(response -> response.statusCode(404));

    }


    @Step("I send HTTP GET transaction request with invalid token")
    public void sendGetReqTransactionInvalidToken() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzU2MzQ1fQ.4vbW9ef6DBqzzLhCi6QH9gjfg7bSCzx5WXjyYTfMP2c")
                .get(setGetTransactionInvalidToken());

    }
    @Step("I receive a valid HTTP all transaction response code 401 Invalid Token")
    public void HttpGetTransactionResponse401() {
        restAssuredThat(response -> response.statusCode(401));

    }
}
